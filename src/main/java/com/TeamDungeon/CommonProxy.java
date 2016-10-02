package com.teamdungeon;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import com.teamdungeon.items.ModItems;
import com.teamdungeon.blocks.ModBlocks;
import com.teamdungeon.crafting.ModCrafting;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
		ModItems.createItems();
		ModBlocks.createBlocks();
	}
	
    public void init(FMLInitializationEvent event) {
		ModCrafting.initCrafting();
    }
	
    public void postInit(FMLPostInitializationEvent event) {
	}
	
}