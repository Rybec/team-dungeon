package com.teamdungeon;

import net.minecraftforge.fml.common.Mod.EventHandler;
//import net.minecraftforge.fml.common.FMLCommonHanlder;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class Events {
	@SubscribeEvent
	public void rightClickBlock(PlayerInteractEvent.RightClickBlock e) {
		System.out.println("Block Right Clicked:");
		System.out.println("Player: " + e.getEntityPlayer());
		System.out.println("pos: " + e.getPos());
		System.out.println("Face: " + e.getFace() + "\n\n");
		// e.getItemStack() for the items the player is holding
	}
}