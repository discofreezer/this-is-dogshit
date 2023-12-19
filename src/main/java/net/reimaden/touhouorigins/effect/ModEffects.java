package net.reimaden.touhouorigins.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.reimaden.touhouorigins.TouhouOrigins;

public class ModEffects {
    public static StatusEffect MANAPOWER;
    public static StatusEffect MAGIFIRE;
    public static StatusEffect MAGIWATER;
    public static StatusEffect MAGIWOOD;
    public static StatusEffect MAGIMETAL;
    public static StatusEffect MAGIEARTH;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TouhouOrigins.MOD_ID, name),
                new ManaPowerEffect(StatusEffectCategory.BENEFICIAL, 3052277));
    }
    public static StatusEffect registerMagifireEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TouhouOrigins.MOD_ID, name),
                new MagifireEffect(StatusEffectCategory.HARMFUL, 16718592));
    }
    public static StatusEffect registerMagiwaterEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TouhouOrigins.MOD_ID, name),
                new MagiwaterEffect(StatusEffectCategory.HARMFUL, 16718592));
    }    public static StatusEffect registerMagiwoodEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TouhouOrigins.MOD_ID, name),
                new MagiwoodEffect(StatusEffectCategory.HARMFUL, 4298752));
    }    public static StatusEffect registerMagimetalEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TouhouOrigins.MOD_ID, name),
                new MagimetalEffect(StatusEffectCategory.HARMFUL, 13421772));
    }    public static StatusEffect registerMagiearthEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(TouhouOrigins.MOD_ID, name),
                new MagiearthEffect(StatusEffectCategory.HARMFUL, 7757073));
    }

    public static void registerEffects() {
        MANAPOWER = registerStatusEffect("manapower");
        MAGIFIRE = registerMagifireEffect("火");
        MAGIWATER = registerMagiwaterEffect("水");
        MAGIWOOD = registerMagiwoodEffect("木");
        MAGIMETAL = registerMagimetalEffect("金");
        MAGIEARTH = registerMagiearthEffect("土");


    }



}
