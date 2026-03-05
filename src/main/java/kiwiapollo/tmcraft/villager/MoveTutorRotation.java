package kiwiapollo.tmcraft.villager;

import kiwiapollo.tmcraft.TMCraft;
import kiwiapollo.tmcraft.item.misc.ModSmithingTemplateItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveItem;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MoveTutorRotation {
    private static final String TAG_PREFIX = "tmcraft_day_";

    public static boolean isMoveTutor(VillagerEntity villager) {
        return villager.getVillagerData().getProfession() == MoveTutorVillager.PROFESSION;
    }

    public static boolean needsRefresh(VillagerEntity villager, long currentDay) {
        String expectedTag = TAG_PREFIX + currentDay;
        return !villager.getCommandTags().contains(expectedTag);
    }

    public static void rebuildOffers(VillagerEntity villager, long currentDay) {
        TradeOfferList offers = villager.getOffers();
        offers.clear();

        int level = villager.getVillagerData().getLevel();
        int slotCount = Math.max(1, Math.min(level, 5));

        List<Item> pool = TutorMoveItem.getAll();
        long seed = villager.getUuid().getLeastSignificantBits() ^ currentDay;
        Random rng = new Random(seed);
        Collections.shuffle(pool, rng);

        int added = 0;
        for (Item item : pool) {
            if (added >= slotCount) {
                break;
            }

            TradeOffer offer = MoveTutorMoveHelper.createTradeOffer(item);
            if (offer != null) {
                offers.add(offer);
                added++;
            }
        }

        if (level >= 3) {
            offers.add(new TradeOffer(
                    new ItemStack(Items.EMERALD, 22),
                    ModSmithingTemplateItem.MOVE_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(),
                    10, 2, 0.05F
            ));
        }

        villager.getCommandTags().removeIf(tag -> tag.startsWith(TAG_PREFIX));
        villager.getCommandTags().add(TAG_PREFIX + currentDay);

        TMCraft.LOGGER.debug("Rebuilt {} move offers for villager {} (level {}, day {})",
                added, villager.getUuid(), level, currentDay);
    }

    public static long getCurrentDay(ServerWorld world) {
        return world.getTimeOfDay() / 24000L;
    }
}
