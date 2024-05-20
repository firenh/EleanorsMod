package firenh.eleanorsmod.entity.effect;

import firenh.eleanorsmod.EleanorsMod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class EMStatusEffect extends StatusEffect {
    protected EMStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }
    
    protected EMStatusEffect(StatusEffectCategory category, int color, ParticleEffect particleEffect) {
        super(category, color, particleEffect);
    }

    public static final RegistryEntry<StatusEffect> VULNERABILITY = register("vulnerability", new EMStatusEffect(StatusEffectCategory.HARMFUL, 0x9b957d));

    public static void init() {
        new EMStatusEffect(StatusEffectCategory.NEUTRAL, 0);
    }

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, EleanorsMod.id(id), statusEffect);
    }
}
