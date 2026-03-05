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


public class GoldTMRecipeGenerator {
    public void generate(RecipeExporter exporter) {
        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CRUNCH)
                .input(CobblemonItems.DEEP_SEA_TOOTH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONCLAW)
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICEPUNCH)
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FIREPUNCH)
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THUNDERPUNCH)
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HIDDENPOWER)
                .input(Items.ENDER_EYE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_VOLTSWITCH)
                .input(Items.ENDER_PEARL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_UTURN)
                .input(CobblemonItems.EJECT_BUTTON)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PLUCK)
                .input(CobblemonItemTags.BERRIES)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SHADOWBALL)
                .input(Items.SNOWBALL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SHADOWCLAW)
                .input(CobblemonItems.RAZOR_CLAW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AIRSLASH)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AERIALACE)
                .input(CobblemonItems.SHARP_BEAK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_VENOSHOCK)
                .input(CobblemonItems.POISON_BARB)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SCALD)
                .input(Items.BLAZE_POWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STEELWING)
                .input(Items.FEATHER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICEFANG)
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FIREFANG)
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THUNDERFANG)
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BOUNCE)
                .input(Items.SLIME_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MEGAPUNCH)
                .input(CobblemonItems.EXPERT_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAINPUNCH)
                .input(CobblemonItems.BLACK_BELT)
                .input(Items.SPONGE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RAZORSHELL)
                .input(Items.NAUTILUS_SHELL)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SMARTSTRIKE)
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_METRONOME)
                .input(Items.CLOCK)
                .input(Items.JUKEBOX)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TRIATTACK)
                .input(Items.ICE)
                .input(Items.BLAZE_POWDER)
                .input(Items.LIGHTNING_ROD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BRINE)
                .input(Items.GLOWSTONE_DUST)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AVALANCHE)
                .input(Items.POWDER_SNOW_BUCKET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKYDROP)
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DAZZLINGGLEAM)
                .input(Items.END_ROD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WATERPULSE)
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DARKPULSE)
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONPULSE)
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FROSTBREATH)
                .input(Items.DRAGON_BREATH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_XSCISSOR)
                .input(Items.SHEARS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DIG)
                .input(Items.IRON_SHOVEL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUBMISSION)
                .input(Items.LEAD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GIGADRAIN)
                .input(Items.SPONGE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WATERFALL)
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRILLRUN)
                .input(CobblemonItems.DIRE_HIT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEADBUTT)
                .input(CobblemonItems.ROCKY_HELMET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FACADE)
                .input(CobblemonItems.PARALYZE_HEAL)
                .input(CobblemonItems.BURN_HEAL)
                .input(CobblemonItems.ICE_HEAL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SILVERWIND)
                .input(Items.FEATHER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_NIGHTSHADE)
                .input(Items.EXPERIENCE_BOTTLE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SWIFT)
                .input(CobblemonItems.X_ACCURACY)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEX)
                .input(Items.ENDER_EYE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ZENHEADBUTT)
                .input(CobblemonItems.ROCKY_HELMET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BODYSLAM)
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THROATCHOP)
                .input(Items.TIPPED_ARROW)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BREAKINGSWIPE)
                .input(Items.FERMENTED_SPIDER_EYE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SKITTERSMACK)
                .input(Items.SCULK_SENSOR)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SCORCHINGSANDS)
                .input(Items.BLAZE_POWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEATCRASH)
                .input(CobblemonItems.FOCUS_BAND)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BURNINGJEALOUSY)
                .input(CobblemonItems.DESTINY_KNOT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LASHOUT)
                .input(Items.EGG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SEEDBOMB)
                .input(CobblemonItemTags.SEEDS)
                .input(Items.GUNPOWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKTOMB)
                .input(Items.OBSIDIAN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLASHCANNON)
                .input(Items.GLOWSTONE_DUST)
                .input(Items.DISPENSER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LEECHLIFE)
                .input(Items.GOLDEN_APPLE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FIREPLEDGE)
                .input(Items.WRITTEN_BOOK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GRASSPLEDGE)
                .input(Items.WRITTEN_BOOK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_WATERPLEDGE)
                .input(Items.WRITTEN_BOOK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HARDPRESS)
                .input(Items.SMITHING_TABLE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ALLURINGVOICE)
                .input(CobblemonItems.LOVE_SWEET)
                .input(Items.GOAT_HORN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHICNOISE)
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_UPPERHAND)
                .input(CobblemonItems.KINGS_ROCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_EXPANDINGFORCE)
                .input(Items.PISTON)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_IRONHEAD)
                .input(Items.IRON_HELMET)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TEMPERFLARE)
                .input(Items.FLINT_AND_STEEL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ENDEAVOR)
                .input(Items.LEAD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ICESPINNER)
                .input(Items.IRON_PICKAXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_REVERSAL)
                .input(CobblemonItems.HP_UP)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_HEAVYSLAM)
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_TERABLAST)
                .input(CobblemonItems.X_ATTACK)
                .input(CobblemonItems.X_SP_ATK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FLIPTURN)
                .input(CobblemonItems.EJECT_BUTTON)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_KNOCKOFF)
                .input(Items.BONE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BUGBITE)
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SUPERFANG)
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LUNGE)
                .input(CobblemonItems.PROTEIN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BODYPRESS)
                .input(Items.ANVIL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_LIQUIDATION)
                .input(Items.IRON_PICKAXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AURASPHERE)
                .input(CobblemonItems.LIFE_ORB)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_GRASSKNOT)
                .input(Items.LEAD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ELECTROBALL)
                .input(CobblemonItemTags.POKE_BALLS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_POISONJAB)
                .input(CobblemonItems.BLACK_BELT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STOMPINGTANTRUM)
                .input(CobblemonItems.HEAVY_DUTY_BOOTS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROCKSLIDE)
                .input(Items.GRAVEL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYSHOCK)
                .input(Items.LIGHTNING_ROD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BRICKBREAK)
                .input(Items.BRICKS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHICFANGS)
                .input(CobblemonItems.RAZOR_FANG)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYBEAM)
                .input(Items.BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_THIEF)
                .input(CobblemonItems.RELIC_COIN)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BULLDOZE)
                .input(Items.IRON_HOE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_AIRCUTTER)
                .input(Items.IRON_AXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONTAIL)
                .input(Items.WEEPING_VINES)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DIVE)
                .input(Items.TURTLE_SCUTE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_REVENGE)
                .input(Items.CACTUS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ASSURANCE)
                .input(CobblemonItems.RED_CARD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYCHOCUT)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BEATUP)
                .input(Items.ROTTEN_FLESH)
                .input(Items.BONE)
                .input(Items.GUNPOWDER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_NATUREPOWER)
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RETURN)
                .input(CobblemonItems.SOOTHE_BELL)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_FRUSTRATION)
                .input(CobblemonItems.ENERGY_ROOT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_CROSSPOISON)
                .input(CobblemonItems.DIRE_HIT)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_ROUND)
                .input(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SHOCKWAVE)
                .input(CobblemonItems.X_ACCURACY)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BRUTALSWING)
                .input(CobblemonItems.MEDICINAL_LEEK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_MYSTICALFIRE)
                .input(Items.SOUL_CAMPFIRE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RETALIATE)
                .input(Items.BLAZE_POWDER)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_NATURALGIFT)
                .input(CobblemonItemTags.BERRIES)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SEISMICTOSS)
                .input(Items.CARTOGRAPHY_TABLE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_INCINERATE)
                .input(Items.CAMPFIRE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_SECRETPOWER)
                .input(Items.GRASS_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_STRENGTH)
                .input(Items.BLAZE_POWDER)
                .input(Items.NETHER_WART)
                .input(Items.POTION)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_RAZORWIND)
                .input(Items.IRON_SWORD)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BUBBLEBEAM)
                .input(Items.MAGMA_BLOCK)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_PSYWAVE)
                .input(Items.REPEATER)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_DRAGONBREATH)
                .input(Items.DRAGON_BREATH)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_COUNTER)
                .input(Items.SHIELD)
                .input(Items.IRON_AXE)
                .offerTo(exporter);

        GoldTMRecipeJsonBuilder.create((TMMoveTeachingItem) TMMoveItem.TM_BIDE)
                .input(Items.TURTLE_HELMET)
                .input(CobblemonItems.X_ATTACK, 2)
                .offerTo(exporter);
    }

    static class GoldTMRecipeJsonBuilder extends ShapelessRecipeJsonBuilder {
        private GoldTMRecipeJsonBuilder(ItemConvertible output) {
            super(RecipeCategory.MISC, output, 1);
        }

        public static GoldTMRecipeJsonBuilder create(TMMoveTeachingItem item) {
            return (GoldTMRecipeJsonBuilder) new GoldTMRecipeJsonBuilder(item)
                    .input(BlankDiscItem.GOLD_BLANK_DISC)
                    .input(new TypeGemMap().get(item.getMoveType()))
                    .criterion(FabricRecipeProvider.hasItem(BlankDiscItem.GOLD_BLANK_DISC), FabricRecipeProvider.conditionsFromItem(BlankDiscItem.GOLD_BLANK_DISC));
        }
    }
}
