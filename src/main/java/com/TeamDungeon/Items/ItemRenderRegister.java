package com.teamdungeon.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.teamdungeon.TeamDungeon;

public final class ItemRenderRegister {
	
	public static String modid = TeamDungeon.MODID;
	
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerItems() {
		// reg(ModItems.spanner);
	}
}