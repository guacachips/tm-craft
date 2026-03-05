package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import kiwiapollo.tmcraft.common.TypeGemMap;
import kiwiapollo.tmcraft.item.misc.BlankDiscItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveTeachingItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItem;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;


public class IronTMRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FIRESPIN)
                .input(Items.IRON_BARS)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MUDSHOT)
                .input(Items.MUD)
                .input(Items.ARROW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MAGICALLEAF)
                .input(ItemTags.LEAVES)
                .input(Items.ARROW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_METALCLAW)
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POWERGEM)
                .input(Items.DIAMOND)
                .input(Items.EMERALD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKSMASH)
                .input(Items.IRON_PICKAXE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STRUGGLEBUG)
                .input(Items.COBWEB)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GYROBALL)
                .input(CobblemonItems.IRON_BALL)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POWERUPPUNCH)
                .input(CobblemonItems.BLACK_BELT)
                .input(CobblemonItems.PROTEIN)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAININGKISS)
                .input(CobblemonItems.LOVE_SWEET)
                .input(Items.SPONGE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CHARGEBEAM)
                .input(Items.END_ROD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ECHOEDVOICE)
                .input(Items.SCULK_SENSOR)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLING)
                .input(Items.CROSSBOW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MEGADRAIN)
                .input(Items.SPONGE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PAYDAY)
                .input(CobblemonItems.RELIC_COIN)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLAMECHARGE)
                .input(CobblemonItems.X_SPEED)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LOWKICK)
                .input(Items.IRON_BOOTS)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FALSESWIPE)
                .input(Items.WOODEN_SWORD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ACIDSPRAY)
                .input(Items.SPLASH_POTION)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CHILLINGWATER)
                .input(Items.ICE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ELECTROWEB)
                .input(Items.COBWEB)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WEATHERBALL)
                .input(CobblemonItems.SKY_TUMBLESTONE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TRAILBLAZE)
                .input(CobblemonItems.X_SPEED)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DISARMINGVOICE)
                .input(CobblemonItems.LOVE_SWEET)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POUNCE)
                .input(Items.IRON_AXE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICYWIND)
                .input(Items.FEATHER)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WHIRLPOOL)
                .input(Items.NAUTILUS_SHELL)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SANDTOMB)
                .input(Items.SAND, 2)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SMACKDOWN)
                .input(Items.ANVIL)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GRASSYGLIDE)
                .input(Items.PHANTOM_MEMBRANE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DUALWINGBEAT)
                .input(Items.PHANTOM_MEMBRANE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_VACUUMWAVE)
                .input(Items.CROSSBOW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ACROBATICS)
                .input(Items.ELYTRA)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POISONTAIL)
                .input(Items.TWISTING_VINES)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SNARL)
                .input(Items.AMETHYST_SHARD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PAYBACK)
                .input(Items.CACTUS)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SNORE)
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CUT)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FURYCUTTER)
                .input(Items.IRON_HOE)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROLLOUT)
                .input(Items.CROSSBOW)
                .input(CobblemonItems.X_ATTACK)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WATERGUN)
                .input(Items.CROSSBOW)
                .offerTo(exporter);

        IronTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONRAGE)
                .input(Items.DRAGON_HEAD)
                .offerTo(exporter);
    }

    static class IronTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private IronTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static IronTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (IronTMRecipeJsonBuilder) new IronTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.IRON_BLANK_DISC)
                    .input(new TypeGemMap().get(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.IRON_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.IRON_BLANK_DISC));
        }
    }
}
