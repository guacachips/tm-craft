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


public class DiamondTMRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BLIZZARD)
                .input(Items.POWDER_SNOW_BUCKET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FIREBLAST)
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THUNDER)
                .input(Items.LIGHTNING_ROD)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HYDROPUMP)
                .input(Items.WATER_BUCKET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICEBEAM)
                .input(Items.END_ROD)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLAMETHROWER)
                .input(Items.DISPENSER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THUNDERBOLT)
                .input(CobblemonItems.ELECTIRIZER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SURF)
                .input(ItemTags.BOATS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DREAMEATER)
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_IRONTAIL)
                .input(Items.TWISTING_VINES)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WILDCHARGE)
                .input(Items.MINECART)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ENERGYBALL)
                .input(Items.SLIME_BALL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SLUDGEBOMB)
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FOULPLAY)
                .input(Items.TRIPWIRE_HOOK)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHIC)
                .input(CobblemonItems.TWISTED_SPOON)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUPERCELLSLAM)
                .input(Items.DAMAGED_ANVIL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_UPROAR)
                .input(Items.BELL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MUDDYWATER)
                .input(Items.MUD)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLY)
                .input(Items.FEATHER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EARTHQUAKE)
                .input(Items.CRYING_OBSIDIAN)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STONEEDGE)
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PHANTOMFORCE)
                .input(Items.PISTON)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HURRICANE)
                .input(Items.FEATHER, 3)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PETALBLIZZARD)
                .input(Items.PINK_PETALS, 3)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SLUDGEWAVE)
                .input(Items.WATER_BUCKET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEATWAVE)
                .input(Items.FEATHER, 3)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POLLENPUFF)
                .input(ItemTags.FLOWERS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HYPERVOICE)
                .input(Items.SCULK_SHRIEKER)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EARTHPOWER)
                .input(CobblemonItems.LIFE_ORB)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PLAYROUGH)
                .input(CobblemonItems.ROCKY_HELMET)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BUGBUZZ)
                .input(Items.BELL)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POLTERGEIST)
                .input(CobblemonItems.SPELL_TAG)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MISTYEXPLOSION)
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HIGHHORSEPOWER)
                .input(Items.SADDLE)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TAKEDOWN)
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKCLIMB)
                .input(CobblemonItems.HEAVY_DUTY_BOOTS)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EGGBOMB)
                .input(Items.EGG)
                .input(Items.TNT)
                .offerTo(exporter);

        DiamondTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DYNAMICPUNCH)
                .input(Items.PUFFERFISH)
                .offerTo(exporter);
    }

    static class DiamondTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private DiamondTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static DiamondTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (DiamondTMRecipeJsonBuilder) new DiamondTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.DIAMOND_BLANK_DISC)
                    .input(new TypeGemMap().get(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.DIAMOND_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.DIAMOND_BLANK_DISC));
        }
    }
}
