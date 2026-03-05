package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.item.misc.BlankDiscItem;
import kiwiapollo.tmcraft.item.misc.ModSmithingTemplateItem;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;


public class BlankDiscRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlankDiscItem.COPPER_BLANK_DISC)
                .input(Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT), FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItem.COPPER_BLANK_DISC),
                        Ingredient.ofItems(Items.IRON_INGOT),
                        RecipeCategory.MISC,
                        BlankDiscItem.IRON_BLANK_DISC
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.COPPER_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.COPPER_BLANK_DISC))
                .offerTo(exporter, Registries.ITEM.getId(BlankDiscItem.IRON_BLANK_DISC));

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItem.IRON_BLANK_DISC),
                        Ingredient.ofItems(Items.GOLD_INGOT),
                        RecipeCategory.MISC,
                        BlankDiscItem.GOLD_BLANK_DISC
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.IRON_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.IRON_BLANK_DISC))
                .offerTo(exporter, Registries.ITEM.getId(BlankDiscItem.GOLD_BLANK_DISC));

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItem.GOLD_BLANK_DISC),
                        Ingredient.ofItems(Items.DIAMOND),
                        RecipeCategory.MISC,
                        BlankDiscItem.DIAMOND_BLANK_DISC
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.GOLD_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.GOLD_BLANK_DISC))
                .offerTo(exporter, Registries.ITEM.getId(BlankDiscItem.DIAMOND_BLANK_DISC));

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItem.GOLD_BLANK_DISC),
                        Ingredient.ofItems(Items.EMERALD),
                        RecipeCategory.MISC,
                        BlankDiscItem.EMERALD_BLANK_DISC
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.GOLD_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.GOLD_BLANK_DISC))
                .offerTo(exporter, Registries.ITEM.getId(BlankDiscItem.EMERALD_BLANK_DISC));

        SmithingTransformRecipeJsonBuilder
                .create(
                        Ingredient.ofItems(ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(BlankDiscItem.DIAMOND_BLANK_DISC),
                        Ingredient.ofItems(Items.NETHERITE_INGOT),
                        RecipeCategory.MISC,
                        BlankDiscItem.NETHERITE_BLANK_DISC
                )
                .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.DIAMOND_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.DIAMOND_BLANK_DISC))
                .offerTo(exporter, Registries.ITEM.getId(BlankDiscItem.NETHERITE_BLANK_DISC));
    }
}
