package firenh.eleanorsmod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import firenh.eleanorsmod.entity.effect.EMEffectUtil;
import firenh.eleanorsmod.entity.effect.EMStatusEffect;
import net.minecraft.entity.LivingEntity;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
	@Inject(at = @At("RETURN"), method = "modifyAppliedDamage", cancellable = true)
	private void init(CallbackInfoReturnable<Float> info) {
		if (((LivingEntity)(Object)this).hasStatusEffect(EMStatusEffect.VULNERABILITY)) {
			info.setReturnValue(
				EMEffectUtil.vulnerabilityDamageIncrease(info.getReturnValueF(), ((LivingEntity)(Object)this).getStatusEffect(EMStatusEffect.VULNERABILITY).getAmplifier())
			);
		}
	}
}