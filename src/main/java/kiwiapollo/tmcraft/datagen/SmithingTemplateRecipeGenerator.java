package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.misc.ModSmithingTemplateItem;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;


public class SmithingTemplateRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("GBG")
                .pattern("GDG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT)
                .input('D', Items.COBBLED_DEEPSLATE)
                .input('B', Items.BLAZE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of(TMCraft.MOD_ID, "move_upgrade_smithing_template_from_blaze_powder"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE, 2)
                .pattern("GTG")
                .pattern("GDG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT)
                .input('D', Items.COBBLED_DEEPSLATE)
                .input('T', ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
    }
}
