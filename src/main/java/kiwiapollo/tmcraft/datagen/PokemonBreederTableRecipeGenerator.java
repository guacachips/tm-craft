package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.block.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;


public class PokemonBreederTableRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlock.POKEMON_BREEDER_TABLE_BLOCK)
                .pattern("EE")
                .pattern("BB")
                .pattern("GG")
                .input('E', Items.EGG)
                .input('B', Items.BLACK_STAINED_GLASS)
                .input('G', Items.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Items.EGG), FabricRecipeProvider.conditionsFromItem(Items.EGG))
                .offerTo(exporter, Registries.BLOCK.getId(ModBlock.POKEMON_BREEDER_TABLE_BLOCK));
    }
}
