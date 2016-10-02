package com.teamdungeon.blocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.teamdungeon.TeamDungeon;	


public final class BlockRenderRegister {
	
	public static String modid = TeamDungeon.MODID;
	
	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerBlocks() {
		reg(ModBlocks.construction_pack);
		reg(ModBlocks.small_cobblestone_pack);
	}
}