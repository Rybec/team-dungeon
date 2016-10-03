package com.teamdungeon.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	public static Item handMirror;
	public static Item roundMirror;

	public static void createItems() {
//		GameRegistry.registerItem(handMirror = new HandMirror(), "hand_mirror");
		GameRegistry.registerItem(roundMirror = new RoundMirror(), "round_mirror");
	}
}