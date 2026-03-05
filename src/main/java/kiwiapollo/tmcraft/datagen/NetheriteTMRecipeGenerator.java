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


public class NetheriteTMRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GIGAIMPACT)
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HYPERBEAM)
                .input(Items.SCULK_SHRIEKER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MEGAKICK)
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SELFDESTRUCT)
                .input(Items.TNT)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SOLARBEAM)
                .input(CobblemonItems.SUN_STONE)
                .input(Items.END_ROD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DOUBLEEDGE)
                .input(Items.IRON_SWORD)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MEGAHORN)
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUPERPOWER)
                .input(CobblemonItems.POWER_BRACER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRACOMETEOR)
                .input(Items.FIREWORK_STAR)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLAREBLITZ)
                .input(Items.ELYTRA)
                .input(Items.FIREWORK_ROCKET)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SOLARBLADE)
                .input(CobblemonItems.SUN_STONE)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BLASTBURN)
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HYDROCANNON)
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FRENZYPLANT)
                .input(Items.END_CRYSTAL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_OUTRAGE)
                .input(CobblemonItems.DRAGON_SCALE)
                .input(CobblemonItems.DRAGON_FANG)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_OVERHEAT)
                .input(Items.LAVA_BUCKET)
                .input(Items.LAVA_BUCKET)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FOCUSBLAST)
                .input(Items.BOW)
                .input(Items.CROSSBOW)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LEAFSTORM)
                .input(ItemTags.LEAVES)
                .input(Items.FEATHER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_METEORBEAM)
                .input(Items.END_ROD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FUTURESIGHT)
                .input(Items.SPYGLASS)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BRAVEBIRD)
                .input(CobblemonItems.SHARP_BEAK)
                .input(Items.FEATHER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CLOSECOMBAT)
                .input(CobblemonItems.FOCUS_BAND)
                .input(CobblemonItems.FOCUS_SASH)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STEELBEAM)
                .input(Items.END_ROD)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FOCUSPUNCH)
                .input(CobblemonItems.CELL_BATTERY)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GUNKSHOT)
                .input(Items.DISPENSER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EXPLOSION)
                .input(Items.END_CRYSTAL, 3)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HORNDRILL)
                .input(Items.NETHERITE_PICKAXE)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FISSURE)
                .input(Items.NETHERITE_SHOVEL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKULLBASH)
                .input(Items.WITHER_SKELETON_SKULL)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ZAPCANNON)
                .input(Items.LIGHTNING_ROD)
                .input(Items.DISPENSER)
                .offerTo(exporter);

        NetheriteTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKYATTACK)
                .input(Items.ELYTRA)
                .input(Items.FIREWORK_ROCKET)
                .offerTo(exporter);
    }

    static class NetheriteTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private NetheriteTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static NetheriteTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (NetheriteTMRecipeJsonBuilder) new NetheriteTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.NETHERITE_BLANK_DISC)
                    .input(new TypeGemMap().get(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.NETHERITE_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.NETHERITE_BLANK_DISC));
        }
    }
}
