package net.reimaden.touhouorigins.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.reimaden.touhouorigins.TouhouOrigins;

public class ModEffects {
    public static StatusEffect MANAPOWER;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TouhouOrigins.MOD_ID, name),
                new ManaPowerEffect(StatusEffectCategory.BENEFICIAL, 3052277));
    }

    public static void registerEffects() {
        MANAPOWER = registerStatusEffect("manapower");
    }
}
