package com.nightshinerst.itv.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import static net.minecraft.component.type.ConsumableComponents.food;

public class ModFoodComponents {
    public static final FoodComponent RAW_SKLANKO_WING = new FoodComponent.Builder().nutrition(2).saturationModifier(0.6f).build();
    public static final FoodComponent COOKED_SKLANKO_WING = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();
}