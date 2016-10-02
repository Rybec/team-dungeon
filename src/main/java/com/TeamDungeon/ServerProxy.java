package com.teamdungeon;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ServerProxy extends CommonProxy {
	
	@Override
    public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
    @Override
    public void init(FMLInitializationEvent e) {
		super.init(e);
    }
	
	@Override
    public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
}