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
import net.minecraft.registry.tag.ItemTags;


public class EmeraldTMRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AGILITY)
                .input(Items.FIREWORK_ROCKET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STEALTHROCK)
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RAINDANCE)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUNNYDAY)
                .input(CobblemonItems.SUN_STONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SCARYFACE)
                .input(Items.SOUL_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BULKUP)
                .input(Items.GOLDEN_APPLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HONECLAWS)
                .input(CobblemonItems.RAZOR_CLAW)
                .input(Items.GRINDSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TOXIC)
                .input(CobblemonItems.BLACK_SLUDGE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TRICKROOM)
                .input(Items.ENDER_CHEST)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LIGHTSCREEN)
                .input(Items.GLASS_PANE)
                .input(Items.ENCHANTED_BOOK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_REFLECT)
                .input(Items.GLASS_PANE)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHUP)
                .input(CobblemonItems.MIRROR_HERB)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SWORDSDANCE)
                .input(Items.IRON_SWORD)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKPOLISH)
                .input(Items.GRINDSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FAKETEARS)
                .input(Items.GHAST_TEAR)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ATTRACT)
                .input(CobblemonItems.LOVE_SWEET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SANDSTORM)
                .input(CobblemonItems.SOFT_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLASH)
                .input(Items.LANTERN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WILLOWISP)
                .input(Items.SOUL_LANTERN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CALMMIND)
                .input(Items.TARGET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_REST)
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DOUBLETEAM)
                .input(CobblemonItems.X_ACCURACY)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MIMIC)
                .input(Items.GLASS_PANE)
                .input(Items.IRON_INGOT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKILLSWAP)
                .input(Items.ENCHANTED_BOOK)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GUARDSWAP)
                .input(CobblemonItems.X_DEFENSE)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POWERSWAP)
                .input(CobblemonItems.X_ATTACK)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SPEEDSWAP)
                .input(CobblemonItems.X_SPEED)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SNATCH)
                .input(Items.DIAMOND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THUNDERWAVE)
                .input(Items.REPEATER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TORMENT)
                .input(CobblemonItemTags.MINTS)
                .input(Items.COCOA_BEANS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROOST)
                .input(ItemTags.BEDS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SAFEGUARD)
                .input(Items.IRON_HELMET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUBSTITUTE)
                .input(Items.ARMOR_STAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LOWSWEEP)
                .input(Items.COBWEB)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CONFUSERAY)
                .input(Items.SHROOMLIGHT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ENDURE)
                .input(CobblemonItems.FOCUS_BAND)
                .offerTo(exporter);

        // Snowscape (Japanese: ゆきげしき Snowscape) is a non-damaging Ice-type move introduced in Generation IX,
        // replacing Hail from earlier generations. It is TM052 in Generation IX.
        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HAIL)
                .input(CobblemonItems.IRON_BALL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SNOWSCAPE)
                .input(CobblemonItems.IRON_BALL)
                .input(CobblemonItems.PROTECTOR)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FEATHERDANCE)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_METALSOUND)
                .input(Items.PRISMARINE_SHARD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SLEEPTALK)
                .input(Items.PHANTOM_MEMBRANE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PROTECT)
                .input(Items.SHIELD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SPIKES)
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TOXICSPIKES)
                .input(Items.POINTED_DRIPSTONE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_IMPRISON)
                .input(Items.IRON_BARS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EERIEIMPULSE)
                .input(Items.SUSPICIOUS_STEW)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ELECTRICTERRAIN)
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GRASSYTERRAIN)
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHICTERRAIN)
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MISTYTERRAIN)
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_NASTYPLOT)
                .input(Items.WARPED_ROOTS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CURSE)
                .input(Items.WITHER_ROSE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONCHEER)
                .input(CobblemonItems.DIRE_HIT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONDANCE)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_COACHING)
                .input(CobblemonItems.POWER_BRACER)
                .input(CobblemonItems.POWER_BELT)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ENCORE)
                .input(Items.REPEATER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BATONPASS)
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AMNESIA)
                .input(CobblemonItems.ENIGMA_BERRY)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HELPINGHAND)
                .input(Items.BRUSH)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROAR)
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CHARGE)
                .input(CobblemonItems.CELL_BATTERY)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HAZE)
                .input(Items.MILK_BUCKET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SPITE)
                .input(CobblemonItems.ETHER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GRAVITY)
                .input(Items.SOUL_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PAINSPLIT)
                .input(Items.CACTUS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_IRONDEFENSE)
                .input(Items.SHIELD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TRICK)
                .input(CobblemonItems.LINK_CABLE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TAILWIND)
                .input(Items.ELYTRA)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TAUNT)
                .input(CobblemonItems.MAGNET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CHARM)
                .input(CobblemonItems.WHIPPED_DREAM)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WONDERROOM)
                .input(Items.MAGENTA_GLAZED_TERRACOTTA)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MAGICROOM)
                .input(Items.BLACK_GLAZED_TERRACOTTA)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SCREECH)
                .input(Items.SCULK_SHRIEKER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EMBARGO)
                .input(Items.CHAIN)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CONFIDE)
                .input(Items.WRITTEN_BOOK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_QUASH)
                .input(Items.SOUL_SAND)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AURORAVEIL)
                .input(Items.SHIELD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WORKUP)
                .input(CobblemonItems.X_ATTACK)
                .input(CobblemonItems.X_SP_ATK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RECYCLE)
                .input(Items.BUCKET)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CAPTIVATE)
                .input(Items.LEAD)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TELEPORT)
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TELEKINESIS)
                .input(Items.SHULKER_SHELL)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DEFOG)
                .input(Items.GOLDEN_CARROT)
                .input(Items.NETHER_WART)
                .input(Items.POTION)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ALLYSWITCH)
                .input(Items.LEVER)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SWAGGER)
                .input(CobblemonItems.FIGY_BERRY)
                .input(CobblemonItems.X_ATTACK)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_NIGHTMARE)
                .input(ItemTags.BEDS)
                .input(Items.PHANTOM_MEMBRANE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SOFTBOILED)
                .input(Items.EGG)
                .input(CobblemonItems.HYPER_POTION)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DEFENSECURL)
                .input(CobblemonItems.X_DEFENSE)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DETECT)
                .input(Items.SPYGLASS)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WHIRLWIND)
                .input(Items.FEATHER, 3)
                .offerTo(exporter);

        EmeraldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SWEETSCENT)
                .input(ItemTags.SMALL_FLOWERS)
                .input(Items.HONEY_BOTTLE)
                .offerTo(exporter);
    }

    static class EmeraldTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private EmeraldTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static EmeraldTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (EmeraldTMRecipeJsonBuilder) new EmeraldTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.EMERALD_BLANK_DISC)
                    .input(new TypeGemMap().get(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.EMERALD_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.EMERALD_BLANK_DISC));
        }
    }
}
