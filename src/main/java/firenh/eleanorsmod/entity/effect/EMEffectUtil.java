package firenh.eleanorsmod.entity.effect;

import firenh.eleanorsmod.EleanorsMod;

public interface EMEffectUtil {
    public static float vulnerabilityDamageIncrease(float damage, int level) {
        float damageIncrease = damage * (1 + (level + 1) * 0.5f);
        EleanorsMod.LOGGER.info("Vulnerability: Prev: " + damage + " Post: " + damageIncrease);
        return damageIncrease;
    }
}
