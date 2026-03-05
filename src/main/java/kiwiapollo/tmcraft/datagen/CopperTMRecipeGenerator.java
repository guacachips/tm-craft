package kiwiapollo.tmcraft.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import com.cobblemon.mod.common.api.tags.CobblemonItemTags;
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


public class CopperTMRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PINMISSILE)
                .input(Items.CACTUS)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BULLETSEED)
                .input(CobblemonItemTags.SEEDS)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ABSORB)
                .input(Items.SPONGE)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICICLESPEAR)
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SCALESHOT)
                .input(CobblemonItems.DRAGON_SCALE)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKBLAST)
                .input(Items.DISPENSER)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MUDSLAP)
                .input(Items.MUD)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TRIPLEAXEL)
                .input(CobblemonItems.HEAVY_DUTY_BOOTS)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STOREDPOWER)
                .input(Items.BARREL)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_INFESTATION)
                .input(Items.COBWEB)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RAGE)
                .input(Items.EMERALD)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        CopperTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TAILSLAP)
                .input(Items.STICK)
                .input(Items.PAPER)
                .offerTo(exporter);
    }

    static class CopperTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private CopperTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static CopperTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (CopperTMRecipeJsonBuilder) new CopperTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.COPPER_BLANK_DISC)
                    .input(new TypeGemMap().get(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.COPPER_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.COPPER_BLANK_DISC));
        }
    }
}
