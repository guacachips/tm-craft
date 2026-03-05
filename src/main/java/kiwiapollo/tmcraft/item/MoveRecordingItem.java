package kiwiapollo.tmcraft.item;

import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.battles.model.actor.BattleActor;
import com.cobblemon.mod.common.api.item.PokemonAndMoveSelectingItem;
import com.cobblemon.mod.common.api.moves.Move;
import com.cobblemon.mod.common.battles.pokemon.BattlePokemon;
import com.cobblemon.mod.common.item.battle.BagItem;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class MoveRecordingItem extends Item implements PokemonAndMoveSelectingItem {
    public MoveRecordingItem() {
        super(new Item.Settings());
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);

        if (world.isClient()) {
            return TypedActionResult.pass(itemStack);
        }

        return use((ServerPlayerEntity) player, itemStack);
    }

    @Override
    public @Nullable BagItem getBagItem() {
        return null;
    }

    @Override
    public @Nullable TypedActionResult<ItemStack> use(@NotNull ServerPlayerEntity player, @NotNull ItemStack itemStack) {
        return PokemonAndMoveSelectingItem.DefaultImpls.use(this, player, itemStack);
    }

    @Override
    public void applyToPokemon(@NotNull ServerPlayerEntity player, @NotNull ItemStack itemStack, @NotNull Pokemon pokemon, @NotNull Move move) {
        ItemStack stack = toMoveTeachingItem(move).getDefaultStack();

        if (player.giveItemStack(stack)) {
            player.dropStack(stack);
        }

        if (!player.isCreative()) {
            itemStack.decrement(1);
        }

        player.sendMessage(Text.translatable("item.tmcraft.success.recorded_move", move.getDisplayName()));
        player.getWorld().playSound(null, player.getBlockPos(), CobblemonSounds.PC_CLICK, SoundCategory.PLAYERS, 1.0f, 1.0f);
    }

    protected abstract Item toMoveTeachingItem(Move move);

    @Override
    public void applyToBattlePokemon(@NotNull ServerPlayerEntity serverPlayerEntity, @NotNull ItemStack itemStack, @NotNull BattlePokemon battlePokemon, @NotNull Move move) {

    }

    @Override
    public boolean canUseOnPokemon(@NotNull ItemStack itemStack, @NotNull Pokemon pokemon) {
        return true;
    }

    @Override
    public boolean canUseOnBattlePokemon(@NotNull ItemStack itemStack, @NotNull BattlePokemon battlePokemon) {
        return false;
    }

    @Override
    public boolean canUseOnMove(@NotNull ItemStack itemStack, @NotNull Pokemon pokemon, @NotNull Move move) {
        return true;
    }

    @Override
    public boolean canUseOnMove(@NotNull ItemStack itemStack, @NotNull Move move) {
        return true;
    }

    @Override
    public @Nullable TypedActionResult<ItemStack> interactWithSpecific(@NotNull ServerPlayerEntity player, @NotNull ItemStack itemStack, @NotNull Pokemon pokemon) {
        return PokemonAndMoveSelectingItem.DefaultImpls.interactWithSpecific(this, player, itemStack, pokemon);
    }

    @Override
    public @Nullable TypedActionResult<ItemStack> interactWithSpecificBattle(@NotNull ServerPlayerEntity player, @NotNull ItemStack itemStack, @NotNull BattlePokemon battlePokemon) {
        return PokemonAndMoveSelectingItem.DefaultImpls.interactWithSpecificBattle(this, player, itemStack, battlePokemon);
    }

    @Override
    public @Nullable TypedActionResult<ItemStack> interactGeneral(@NotNull ServerPlayerEntity player, @NotNull ItemStack itemStack) {
        return PokemonAndMoveSelectingItem.DefaultImpls.interactGeneral(this, player, itemStack);
    }

    @Override
    public @Nullable TypedActionResult<ItemStack> interactGeneralBattle(@NotNull ServerPlayerEntity player, @NotNull ItemStack itemStack, @NotNull BattleActor battleActor) {
        return PokemonAndMoveSelectingItem.DefaultImpls.interactGeneralBattle(this, player, itemStack, battleActor);
    }
}
