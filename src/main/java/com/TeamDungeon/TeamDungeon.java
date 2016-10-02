package com.teamdungeon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitilizationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TeamDungeon.modId, name = TeamDungeon.name, version = TeamDungeon.version, acceptedMinecraftVersions="[1.10.2]")
public class TeamDungeon {
	@SidedProxy(serverSide = "com.teamdungeon.proxy.CommonProxy", clientSide = "com.teamdungeon.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static final String modId = "team_dungeon";
	public static final String name = "TeamDungeon";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static TeamDungeon instance;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		System.out.println("TeamDungeon is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}

