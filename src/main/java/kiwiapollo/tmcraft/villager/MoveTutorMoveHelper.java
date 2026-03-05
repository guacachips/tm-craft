package kiwiapollo.tmcraft.villager;

import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.Moves;
import com.cobblemon.mod.common.api.types.ElementalType;
import kiwiapollo.tmcraft.common.TypeGemMap;
import kiwiapollo.tmcraft.item.MoveTeachingItem;
import kiwiapollo.tmcraft.item.tutormove.TutorMoveTeachingItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class MoveTutorMoveHelper {

    public static String getMoveName(Item item) {
        return ((MoveTeachingItem) item).getMoveName();
    }

    public static MoveTemplate getMoveTemplate(Item item) {
        return Moves.INSTANCE.getByName(getMoveName(item));
    }

    public static MoveTutorTier getTier(Item item) {
        MoveTemplate template = getMoveTemplate(item);
        if (template == null) {
            return MoveTutorTier.LOW;
        }
        return MoveTutorTier.fromMoveTemplate(template);
    }

    public static TradeOffer createTradeOffer(Item item) {
        MoveTutorTier tier = getTier(item);

        ItemStack emeralds = new ItemStack(Items.EMERALD, tier.getEmeraldCount());

        ElementalType type = ((TutorMoveTeachingItem) item).getMoveType();
        ItemStack typeGems = new ItemStack(new TypeGemMap().get(type), tier.getTypeGemCount());

        ItemStack result = new ItemStack(item);

        return new TradeOffer(
                emeralds,
                typeGems,
                result,
                0,
                1,     // maxUses: stock depletes, no restock until next day
                2,
                0.05F  // priceMultiplier: non-zero so gossip discounts apply
        );
    }
}
