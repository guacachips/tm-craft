package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;


public class MoveTutorTableRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlock.MOVE_TUTOR_TABLE_BLOCK)
                .pattern("II")
                .pattern("BB")
                .pattern("GG")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.BLACK_STAINED_GLASS)
                .input('G', Items.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, Registries.BLOCK.getId(ModBlock.MOVE_TUTOR_TABLE_BLOCK));
    }
}
