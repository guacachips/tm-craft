package kiwiapollo.tmcraft.item;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.moves.BenchedMove;
import com.cobblemon.mod.common.api.moves.Move;
import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.Moves;
import com.cobblemon.mod.common.api.moves.categories.DamageCategories;
import com.cobblemon.mod.common.api.moves.categories.DamageCategory;
import com.cobblemon.mod.common.api.storage.party.PlayerPartyStore;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.tmcraft.common.TextColorMap;
import kiwiapollo.tmcraft.gamerule.ModGameRule;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Language;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public abstract class MoveTeachingItem extends Item implements ElementalTypeItem {
    private final String move;
    private final ElementalType type;
    private final String translation;

    public MoveTeachingItem(String move, ElementalType type, String translation) {
        super(new FabricItemSettings());

        this.move = move;
        this.type = type;
        this.translation = translation;
    }

    public String getMoveName() {
        return this.move;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (getMoveTemplate().getDamageCategory() == DamageCategories.INSTANCE.getSTATUS()) {
            tooltip.add(getMoveTypeTooltipText());
            tooltip.add(getMoveDamageCategoryTooltipText());

        } else {
            tooltip.add(getMoveTypeTooltipText());
            tooltip.add(getMoveDamageCategoryTooltipText());
            tooltip.add(getMovePowerTooltipText());
        }
    }

    private Text getMoveTypeTooltipText() {
        return type.getDisplayName().setStyle(Style.EMPTY.withColor(type.getHue()));
    }

    private Text getMoveDamageCategoryTooltipText() {
        DamageCategory category = getMoveTemplate().getDamageCategory();
        Style style = Style.EMPTY.withColor(new TextColorMap().get(category));
        return category.getDisplayName().copy().setStyle(style);
    }

    private Text getMovePowerTooltipText() {
        Style style = Style.EMPTY.withColor(Formatting.YELLOW);
        return Text.literal(String.valueOf(getMoveTemplate().getPower())).setStyle(style);
    }

    @NotNull
    private MoveTemplate getMoveTemplate() {
        return Objects.requireNonNull(Moves.INSTANCE.getByName(move));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!(context.getPlayer() instanceof ServerPlayerEntity player)) {
            return ActionResult.PASS;
        }

        if (player.getWorld().isClient()) {
            return ActionResult.PASS;
        }

        player.sendMessage(getName().copy().formatted(Formatting.YELLOW));

        PlayerPartyStore party = Cobblemon.INSTANCE.getStorage().getParty(player);

        for (int i = 0; i < party.size(); i++) {
            Pokemon pokemon = party.get(i);
            player.sendMessage(Text.literal(String.format("[%d] ", i + 1)).append(getMoveLearnStatus(pokemon)));
        }

        return ActionResult.SUCCESS;
    }

    private Text getMoveLearnStatus(Pokemon pokemon) {
        if (Objects.isNull(pokemon)) {
            return Text.translatable("item.tmcraft.move_learn_status.empty").formatted(Formatting.GRAY);

        } else if (isPokemonAlreadyLearnedMove(pokemon)) {
            return pokemon.getDisplayName().append(Text.literal(", ")).append(Text.translatable("item.tmcraft.move_learn_status.learned").formatted(Formatting.YELLOW));

        } else if (isPokemonAbleToLearnMove(pokemon)) {
            return pokemon.getDisplayName().append(Text.literal(", ")).append(Text.translatable("item.tmcraft.move_learn_status.able").formatted(Formatting.GREEN));

        } else {
            return pokemon.getDisplayName().append(Text.literal(", ")).append(Text.translatable("item.tmcraft.move_learn_status.unable").formatted(Formatting.RED));
        }
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (user.getWorld().isClient()) {
            return ActionResult.PASS;
        }

        if (!(user instanceof ServerPlayerEntity player)) {
            return ActionResult.PASS;
        }

        if (!(entity instanceof PokemonEntity)) {
            return ActionResult.PASS;
        }

        Pokemon pokemon = ((PokemonEntity) entity).getPokemon();

        if (!isMoveExist()) {
            player.getWorld().playSound(null, player.getBlockPos(), SoundEvents.ITEM_SHIELD_BLOCK, SoundCategory.PLAYERS, 1.0f, 1.0f);
            return ActionResult.PASS;
        }

        if (!isPokemonOwnedByPlayer(player, pokemon)) {
            player.getWorld().playSound(null, player.getBlockPos(), SoundEvents.ITEM_SHIELD_BLOCK, SoundCategory.PLAYERS, 1.0f, 1.0f);
            return ActionResult.PASS;
        }

        if (isPokemonAlreadyLearnedMove(pokemon)) {
            player.sendMessage(Text.translatable("item.tmcraft.error.already_learned_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
            player.getWorld().playSound(null, player.getBlockPos(), SoundEvents.ITEM_SHIELD_BLOCK, SoundCategory.PLAYERS, 1.0f, 1.0f);
            return ActionResult.PASS;
        }

        if (!isPokemonAbleToLearnMove(pokemon)) {
            player.sendMessage(Text.translatable("item.tmcraft.error.cannot_learn_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()).formatted(Formatting.RED));
            player.getWorld().playSound(null, player.getBlockPos(), SoundEvents.ITEM_SHIELD_BLOCK, SoundCategory.PLAYERS, 1.0f, 1.0f);
            return ActionResult.PASS;
        }

        teachMoveToPokemon(pokemon);

        if (shouldConsumeItemByGameRule(player.getServerWorld()) && !player.isCreative()) {
            itemStack.decrement(1);
        }

        player.sendMessage(Text.translatable("item.tmcraft.success.pokemon_learned_move", pokemon.getDisplayName(), getMoveTemplate().getDisplayName()));
        player.getWorld().playSound(null, player.getBlockPos(), CobblemonSounds.PC_CLICK, SoundCategory.PLAYERS, 1.0f, 1.0f);

        return ActionResult.SUCCESS;
    }

    private void teachMoveToPokemon(Pokemon pokemon) {
        if (pokemon.getMoveSet().hasSpace()) {
            pokemon.getMoveSet().add(getMoveTemplate().create());

        } else {
            pokemon.getBenchedMoves().add(new BenchedMove(getMoveTemplate(), 0));
        }
    }

    private boolean isMoveExist() {
        try {
            getMoveTemplate();
            return true;

        } catch (NullPointerException e) {
            return false;
        }
    }

    private boolean isPokemonAlreadyLearnedMove(Pokemon pokemon) {
        return isMoveSetMove(pokemon) || isAccessibleMove(pokemon);
    }

    private boolean isMoveSetMove(Pokemon pokemon) {
        return pokemon.getMoveSet().getMoves().stream()
                .map(Move::getName)
                .anyMatch(name -> name.equals(move));
    }

    private boolean isAccessibleMove(Pokemon pokemon) {
        return pokemon.getAllAccessibleMoves().stream()
                .map(MoveTemplate::getName)
                .anyMatch(name -> name.equals(move));
    }

    protected boolean isLearnedByLevelUp(Pokemon pokemon) {
        return pokemon.getForm().getMoves()
                .getLevelUpMoves().values().stream()
                .flatMap(List::stream)
                .map(MoveTemplate::getName).toList()
                .contains(move);
    }

    protected boolean isLearnedByTM(Pokemon pokemon) {
        return pokemon.getForm().getMoves()
                .getTmMoves().stream()
                .map(MoveTemplate::getName).toList()
                .contains(move);
    }

    protected boolean isLearnedByMoveTutor(Pokemon pokemon) {
        return pokemon.getForm().getMoves()
                .getTutorMoves().stream()
                .map(MoveTemplate::getName).toList()
                .contains(move);
    }

    protected boolean isLearnedByBreeding(Pokemon pokemon) {
        return pokemon.getForm().getMoves()
                .getEggMoves().stream()
                .map(MoveTemplate::getName).toList()
                .contains(move);
    }

    private boolean isPokemonOwnedByPlayer(PlayerEntity player, Pokemon pokemon) {
        return player.equals(pokemon.getOwnerPlayer());
    }

    protected abstract boolean isPokemonAbleToLearnMove(Pokemon pokemon);

    private boolean shouldConsumeItemByGameRule(ServerWorld world) {
        try {
            return world.getGameRules().get(ModGameRule.CONSUME_MOVE_ITEM_ON_USE).get();

        } catch (NullPointerException e) {
            return true;
        }
    }

    @Override
    public Text getName(ItemStack stack) {
        if (Language.getInstance().hasTranslation(super.getTranslationKey())) {
            return super.getName(stack);

        } else {
            MoveTemplate m = Moves.INSTANCE.getByName(this.move);
            return Text.translatable(translation, m.getNum(), m.getDisplayName());
        }
    }

    @Override
    public Text getName() {
        if (Language.getInstance().hasTranslation(super.getTranslationKey())) {
            return super.getName();

        } else {
            MoveTemplate m = Moves.INSTANCE.getByName(this.move);
            return Text.translatable(translation, m.getNum(), m.getDisplayName());
        }
    }

    @Override
    public ElementalType getMoveType() {
        return type;
    }
}
