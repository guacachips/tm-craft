package kiwiapollo.tmcraft.villager;

import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemMap;
import kiwiapollo.tmcraft.item.eggmove.EggMoveItem;
import kiwiapollo.tmcraft.item.eggmove.EggMoveTeachingItem;
import kiwiapollo.tmcraft.item.misc.ModSmithingTemplateItem;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradedItem;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class PokemonBreederTradeOffer {
    public static void initialize() {
        register();
    }

    private static void register() {
        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.NOVICE.getLevel(),
                factories -> factories.add(new PokemonBreederTradeOffer.Novice())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.APPRENTICE.getLevel(),
                factories -> factories.add(new PokemonBreederTradeOffer.Apprentice())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add(new PokemonBreederTradeOffer.Journeyman())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add(new PokemonBreederTradeOffer.MoveUpgradeSmithingTemplate())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.EXPERT.getLevel(),
                factories -> factories.add(new PokemonBreederTradeOffer.Expert())
        );

        TradeOfferHelper.registerVillagerOffers(PokemonBreederVillager.PROFESSION, TradeLevel.MASTER.getLevel(),
                factories -> factories.add(new PokemonBreederTradeOffer.Master())
        );
    }

    private static TradedItem getEmeraldBuyItem(int count) {
        return new TradedItem(Items.EMERALD, count);
    }

    private static TradedItem getTypeGemBuyItem(Item move, int count) {
        ElementalType type = ((EggMoveTeachingItem) move).getMoveType();
        return new TradedItem(new TypeGemMap().get(type), count);
    }

    private static ItemStack getEggMoveSellItem(Item move) {
        return new ItemStack(move);
    }

    private static class Novice implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 6;
        private static final int TYPE_GEM_COUNT = 1;

        private static final List<Item> MOVES = List.of(
                EggMoveItem.EGG_TIDYUP,
                EggMoveItem.EGG_CHILLYRECEPTION,
                EggMoveItem.EGG_SHEDTAIL,
                EggMoveItem.EGG_POWERTRIP,
                EggMoveItem.EGG_ASTONISH,
                EggMoveItem.EGG_ICEBALL,
                EggMoveItem.EGG_LICK
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    Optional.of(getTypeGemBuyItem(move, TYPE_GEM_COUNT)),
                    getEggMoveSellItem(move),
                    10, 2, 0.05F
            );
        }
    }

    private static class Apprentice implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 10;
        private static final int TYPE_GEM_COUNT = 1;

        private static final List<Item> MOVES = List.of(
                EggMoveItem.EGG_FAKEOUT,
                EggMoveItem.EGG_AQUAJET,
                EggMoveItem.EGG_BULLETPUNCH,
                EggMoveItem.EGG_SHADOWSNEAK,
                EggMoveItem.EGG_CONFUSION,
                EggMoveItem.EGG_POISONFANG,
                EggMoveItem.EGG_CLEARSMOG,
                EggMoveItem.EGG_LASTRESPECTS,
                EggMoveItem.EGG_BITE,
                EggMoveItem.EGG_ANCIENTPOWER,
                EggMoveItem.EGG_WINGATTACK,
                EggMoveItem.EGG_FEINTATTACK,
                EggMoveItem.EGG_FLAMEWHEEL,
                EggMoveItem.EGG_ROLLINGKICK,
                EggMoveItem.EGG_SHADOWPUNCH,
                EggMoveItem.EGG_BARBBARRAGE,
                EggMoveItem.EGG_SLUDGE,
                EggMoveItem.EGG_AURORABEAM,
                EggMoveItem.EGG_OCTAZOOKA,
                EggMoveItem.EGG_NIGHTSLASH,
                EggMoveItem.EGG_CHIPAWAY,
                EggMoveItem.EGG_SMELLINGSALTS,
                EggMoveItem.EGG_FREEZEDRY,
                EggMoveItem.EGG_CRUSHCLAW,
                EggMoveItem.EGG_PARTINGSHOT
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    Optional.of(getTypeGemBuyItem(move, TYPE_GEM_COUNT)),
                    getEggMoveSellItem(move),
                    10, 6, 0.05F
            );
        }
    }

    private static class Journeyman implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 16;
        private static final int TYPE_GEM_COUNT = 1;

        private static final List<Item> MOVES = List.of(
                EggMoveItem.EGG_SLAM,
                EggMoveItem.EGG_FIRSTIMPRESSION,
                EggMoveItem.EGG_SPARKLINGARIA,
                EggMoveItem.EGG_DRAGONHAMMER,
                EggMoveItem.EGG_DRAGONRUSH,
                EggMoveItem.EGG_CROSSCHOP,
                EggMoveItem.EGG_HAMMERARM
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    Optional.of(getTypeGemBuyItem(move, TYPE_GEM_COUNT)),
                    getEggMoveSellItem(move),
                    10, 8, 0.05F
            );
        }
    }

    private static class MoveUpgradeSmithingTemplate implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 22;

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            return new TradeOffer(
                    new TradedItem(Items.EMERALD, EMERALD_COUNT),
                    ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(),
                    10, 8, 0.05F
            );
        }
    }

    private static class Expert implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 16;
        private static final int TYPE_GEM_COUNT = 1;

        private static final List<Item> MOVES = List.of(
                EggMoveItem.EGG_GRASSWHISTLE,
                EggMoveItem.EGG_INGRAIN,
                EggMoveItem.EGG_BELLYDRUM,
                EggMoveItem.EGG_MIST,
                EggMoveItem.EGG_FLAIL,
                EggMoveItem.EGG_FORESIGHT,
                EggMoveItem.EGG_MIRRORCOAT,
                EggMoveItem.EGG_YAWN,
                EggMoveItem.EGG_REFRESH,
                EggMoveItem.EGG_MUDSPORT,
                EggMoveItem.EGG_AQUARING,
                EggMoveItem.EGG_LIFEDEW,
                EggMoveItem.EGG_MEFIRST,
                EggMoveItem.EGG_FINALGAMBIT,
                EggMoveItem.EGG_DISABLE,
                EggMoveItem.EGG_SWITCHEROO,
                EggMoveItem.EGG_ROTOTILLER,
                EggMoveItem.EGG_VENOMDRENCH,
                EggMoveItem.EGG_PRESENT,
                EggMoveItem.EGG_WISH,
                EggMoveItem.EGG_TICKLE,
                EggMoveItem.EGG_HEALPULSE,
                EggMoveItem.EGG_HYPNOSIS,
                EggMoveItem.EGG_HOWL,
                EggMoveItem.EGG_MEMENTO,
                EggMoveItem.EGG_TEETERDANCE,
                EggMoveItem.EGG_STRENGTHSAP,
                EggMoveItem.EGG_WIDEGUARD,
                EggMoveItem.EGG_MORNINGSUN,
                EggMoveItem.EGG_ASSIST,
                EggMoveItem.EGG_ODORSLEUTH,
                EggMoveItem.EGG_PUNISHMENT,
                EggMoveItem.EGG_SIMPLEBEAM,
                EggMoveItem.EGG_MEDITATE,
                EggMoveItem.EGG_MINDREADER,
                EggMoveItem.EGG_BARRIER,
                EggMoveItem.EGG_POWERTRICK,
                EggMoveItem.EGG_GUARDSPLIT,
                EggMoveItem.EGG_PSYCHOSHIFT,
                EggMoveItem.EGG_ACUPRESSURE,
                EggMoveItem.EGG_AUTOTOMIZE,
                EggMoveItem.EGG_TRUMPCARD,
                EggMoveItem.EGG_PERISHSONG,
                EggMoveItem.EGG_ENTRAINMENT,
                EggMoveItem.EGG_POWERSPLIT,
                EggMoveItem.EGG_METALBURST,
                EggMoveItem.EGG_STUFFCHEEKS,
                EggMoveItem.EGG_CRAFTYSHIELD
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    Optional.of(getTypeGemBuyItem(move, TYPE_GEM_COUNT)),
                    getEggMoveSellItem(move),
                    10, 8, 0.05F
            );
        }
    }

    private static class Master implements TradeOffers.Factory {
        private static final int EMERALD_COUNT = 22;
        private static final int TYPE_GEM_COUNT = 3;

        private static final List<Item> MOVES = List.of(
                EggMoveItem.EGG_PETALDANCE,
                EggMoveItem.EGG_POWERWHIP,
                EggMoveItem.EGG_THRASH,
                EggMoveItem.EGG_SYNCHRONOISE,
                EggMoveItem.EGG_RAGINGFURY,
                EggMoveItem.EGG_BURNUP,
                EggMoveItem.EGG_LASTRESORT,
                EggMoveItem.EGG_BOOMBURST,
                EggMoveItem.EGG_WATERSPOUT,
                EggMoveItem.EGG_HEADSMASH
        );

        @Override
        public @Nullable TradeOffer create(Entity entity, Random random) {
            List<Item> offers = new ArrayList<>(MOVES);
            Collections.shuffle(offers);
            Item move = offers.get(0);

            return new TradeOffer(
                    getEmeraldBuyItem(EMERALD_COUNT),
                    Optional.of(getTypeGemBuyItem(move, TYPE_GEM_COUNT)),
                    getEggMoveSellItem(move),
                    10, 8, 0.05F
            );
        }
    }
}
