package com.nightshinerst.itv;

import com.nightshinerst.itv.block.ModBlocks;
import com.nightshinerst.itv.item.ModItemGroups;
import com.nightshinerst.itv.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.item.FuelRegistry.*;

//Ignore this comment. >:3
public class IntoTheVoid implements ModInitializer {
	public static final String MOD_ID = "itv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItems.registerFuels();
	}
}