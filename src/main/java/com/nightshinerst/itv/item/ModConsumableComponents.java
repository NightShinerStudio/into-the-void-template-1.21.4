package com.nightshinerst.itv.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import static net.minecraft.component.type.ConsumableComponents.food;

public class ModConsumableComponents {
    public static final ConsumableComponent RAW_SKLANKO_WING = food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 1), 0.30f)).build();
}
