package com.teamdungeon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
//import net.minecraftforge.common.MinecraftForge;

@Mod(modid = TeamDungeon.MODID, name = TeamDungeon.MODNAME, version = TeamDungeon.VERSION)
public class TeamDungeon {
    public static final String MODID = "teamdungeon";
	public static final String MODNAME = "Team Dungeon";
    public static final String VERSION = "0.0";

	@SidedProxy(clientSide="teamdungeon.ClientProxy", serverSide="teamdungeon.ServerProxy")
	public static CommonProxy proxy;

	@Instance
	public static TeamDungeon instance = new TeamDungeon();

	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
	}

    @EventHandler
    public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
//		MinecraftForge.EVENT_BUS.register(new Events());
    }

	@EventHandler
    public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}
}
