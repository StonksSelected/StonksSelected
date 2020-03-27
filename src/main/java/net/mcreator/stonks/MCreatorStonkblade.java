package net.mcreator.stonks;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

@Elementsstonks.ModElement.Tag
public class MCreatorStonkblade extends Elementsstonks.ModElement {
	public MCreatorStonkblade(Elementsstonks instance) {
		super(instance, 24);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("stonks", "stonkblade"));
	}
}
