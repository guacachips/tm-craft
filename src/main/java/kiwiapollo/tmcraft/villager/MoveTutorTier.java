package kiwiapollo.tmcraft.villager;

import com.cobblemon.mod.common.api.moves.MoveTemplate;
import com.cobblemon.mod.common.api.moves.categories.DamageCategories;

public enum MoveTutorTier {
    STATUS(0, 0, 6, 1),
    LOW(1, 60, 10, 1),
    MID(61, 90, 16, 1),
    HIGH(91, 120, 16, 1),
    ULTRA(121, Integer.MAX_VALUE, 22, 3);

    private final int minPower;
    private final int maxPower;
    private final int emeraldCount;
    private final int typeGemCount;

    MoveTutorTier(int minPower, int maxPower, int emeraldCount, int typeGemCount) {
        this.minPower = minPower;
        this.maxPower = maxPower;
        this.emeraldCount = emeraldCount;
        this.typeGemCount = typeGemCount;
    }

    public int getEmeraldCount() {
        return emeraldCount;
    }

    public int getTypeGemCount() {
        return typeGemCount;
    }

    public static MoveTutorTier fromMoveTemplate(MoveTemplate template) {
        if (template.getDamageCategory() == DamageCategories.INSTANCE.getSTATUS()) {
            return STATUS;
        }

        double power = template.getPower();

        if (power <= 60) {
            return LOW;
        } else if (power <= 90) {
            return MID;
        } else if (power <= 120) {
            return HIGH;
        } else {
            return ULTRA;
        }
    }
}
