package net.reimaden.touhouorigins.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.reimaden.touhouorigins.TouhouOrigins;
import net.reimaden.touhouorigins.effect.ModEffects;

public class ModPotions {
    public static Potion MANAPOWER_POTION;

    public static Potion registerPotion(String name) {
        return Registry.register(Registries.POTION, new Identifier(TouhouOrigins.MOD_ID, name),
                new Potion(new StatusEffectInstance(ModEffects.MANAPOWER, 900, 0)));
    }

    public static void registerPotions() {
        MANAPOWER_POTION = registerPotion("manapower_potion");
    }
}
