package kiwiapollo.tmcraft.datagen;

import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import kiwiapollo.tmcraft.item.misc.BlankBookItem;
import kiwiapollo.tmcraft.item.misc.BlankDiscItem;
import kiwiapollo.tmcraft.item.misc.BlankEggItem;
import kiwiapollo.tmcraft.item.misc.BlankStarItem;
import kiwiapollo.tmcraft.item.tmmove.TMMoveItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(RecipeProvider::new);
        pack.addProvider(ItemTagProvider::new);
        pack.addProvider(PoiTagProvider::new);
        pack.addProvider(BlockTagProvider::new);
        pack.addProvider(LootTableProvider::new);
    }

    private static class RecipeProvider extends FabricRecipeProvider {
        public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        public void generate(RecipeExporter exporter) {
            new CopperTMRecipeGenerator().generate(exporter);
            new IronTMRecipeGenerator().generate(exporter);
            new GoldTMRecipeGenerator().generate(exporter);
            new DiamondTMRecipeGenerator().generate(exporter);
            new EmeraldTMRecipeGenerator().generate(exporter);
            new NetheriteTMRecipeGenerator().generate(exporter);

            new BlankDiscRecipeGenerator().generate(exporter);
            new SmithingTemplateRecipeGenerator().generate(exporter);
            new MoveTutorTableRecipeGenerator().generate(exporter);
            new PokemonBreederTableRecipeGenerator().generate(exporter);
        }
    }

    private static class ItemTagProvider extends FabricTagProvider<Item> {
        public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, RegistryKeys.ITEM, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {
            TMMoveItem.getAll().forEach(getOrCreateTagBuilder(ModTagRegistry.TM_MOVES)::add);
            EggMoveItem.getAll().forEach(getOrCreateTagBuilder(ModTagRegistry.EGG_MOVES)::add);
            TutorMoveItem.getAll().forEach(getOrCreateTagBuilder(ModTagRegistry.TUTOR_MOVES)::add);
            TutorMoveItem.getAll().forEach(getOrCreateTagBuilder(ModTagRegistry.STAR_MOVES)::add);

            BlankDiscItem.getAll().forEach(getOrCreateTagBuilder(ModTagRegistry.BLANK_DISCS)::add);
            BlankEggItem.getAll().forEach(getOrCreateTagBuilder(ModTagRegistry.BLANK_EGGS)::add);
            BlankBookItem.getAll().forEach(getOrCreateTagBuilder(ModTagRegistry.BLANK_BOOKS)::add);
            BlankStarItem.getAll().forEach(getOrCreateTagBuilder(ModTagRegistry.BLANK_STARS)::add);
        }
    }
}
