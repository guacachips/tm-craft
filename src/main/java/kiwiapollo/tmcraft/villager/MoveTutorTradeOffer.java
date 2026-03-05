package kiwiapollo.tmcraft.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

/**
 * Registers no-op trade factories for each villager level.
 * Actual offers are built by MoveTutorRotation via the daily rotation system.
 * These no-op registrations keep vanilla's level infrastructure working
 * so the villager can still level up through the 5 tiers.
 */
public class MoveTutorTradeOffer {
    public static void initialize() {
        register();
    }

    private static void register() {
        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.NOVICE.getLevel(),
                factories -> factories.add((entity, random) -> null)
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.APPRENTICE.getLevel(),
                factories -> factories.add((entity, random) -> null)
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.JOURNEYMAN.getLevel(),
                factories -> factories.add((entity, random) -> null)
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.EXPERT.getLevel(),
                factories -> factories.add((entity, random) -> null)
        );

        TradeOfferHelper.registerVillagerOffers(MoveTutorVillager.PROFESSION, TradeLevel.MASTER.getLevel(),
                factories -> factories.add((entity, random) -> null)
        );
    }
}
