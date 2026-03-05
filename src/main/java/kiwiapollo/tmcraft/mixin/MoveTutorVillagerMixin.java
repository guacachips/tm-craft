package kiwiapollo.tmcraft.mixin;

import kiwiapollo.tmcraft.villager.MoveTutorRotation;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VillagerEntity.class)
public class MoveTutorVillagerMixin {

    /**
     * Cancel vanilla restock for movetutor villagers.
     * Bought moves stay gone until next day's rotation.
     */
    @Inject(method = "restock", at = @At("HEAD"), cancellable = true)
    private void tmcraft$cancelMoveTutorRestock(CallbackInfo ci) {
        VillagerEntity self = (VillagerEntity) (Object) this;
        if (MoveTutorRotation.isMoveTutor(self)) {
            ci.cancel();
        }
    }

    /**
     * After vanilla fills recipes (on profession assignment or level-up),
     * replace with rotation-based offers for movetutor villagers.
     */
    @Inject(method = "fillRecipes", at = @At("TAIL"))
    private void tmcraft$overrideMoveTutorRecipes(CallbackInfo ci) {
        VillagerEntity self = (VillagerEntity) (Object) this;
        if (!MoveTutorRotation.isMoveTutor(self)) {
            return;
        }
        if (!(self.getWorld() instanceof ServerWorld serverWorld)) {
            return;
        }
        long currentDay = MoveTutorRotation.getCurrentDay(serverWorld);
        MoveTutorRotation.rebuildOffers(self, currentDay);
    }

    /**
     * When a player opens trade UI, refresh offers if the day has changed
     * since the villager's last rebuild.
     */
    @Inject(method = "beginTradeWith", at = @At("HEAD"))
    private void tmcraft$refreshMoveTutorOnTrade(PlayerEntity customer, CallbackInfo ci) {
        VillagerEntity self = (VillagerEntity) (Object) this;
        if (!MoveTutorRotation.isMoveTutor(self)) {
            return;
        }
        if (!(self.getWorld() instanceof ServerWorld serverWorld)) {
            return;
        }
        long currentDay = MoveTutorRotation.getCurrentDay(serverWorld);
        if (MoveTutorRotation.needsRefresh(self, currentDay)) {
            MoveTutorRotation.rebuildOffers(self, currentDay);
        }
    }
}
