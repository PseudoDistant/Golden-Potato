package io.github.farlandercraft.goldenpotato;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tater implements ModInitializer {
	Item GoldenPotato = new BasicItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).alwaysEdible().saturationModifier(14.4f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1500), 1.0f).build()));
	Item GoldenBakedPotato = new BasicItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).alwaysEdible().saturationModifier(19.5f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 6000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 2), 1.0f).build()));
	Item EnchGoldenBakedPotato = new GlintItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).alwaysEdible().saturationModifier(19.5f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 6000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 3), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5000, 3), 1.0f).build()));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("goldenpotato", "golden_potato"), GoldenPotato);
		Registry.register(Registry.ITEM, new Identifier("goldenpotato", "golden_baked_potato"), GoldenBakedPotato);
		Registry.register(Registry.ITEM, new Identifier("goldenpotato", "enchanted_golden_baked_potato"), EnchGoldenBakedPotato);

		System.out.println("Hello Fabric world!");
	}
}
