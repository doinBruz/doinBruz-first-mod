package name.doinbruz.first.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public static final FoodComponent TRIPPA_SNIPPA_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(14)
            .saturationModifier(0.8f)
            .build();

    public static final ConsumableComponent TRIPPA_SNIPPA_CONSUMABLE_COMPONENT = ConsumableComponents.food()
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 15, 1), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 90, 1), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 90, 1), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 90, 1), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 90, 1), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 15, 1), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 15, 1), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 1, 1), 1.0f))
        .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 15, 1), 1.0f))
        .build();        
}

