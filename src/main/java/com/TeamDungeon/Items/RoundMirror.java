package com.teamdungeon.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;

public class RoundMirror extends Item {
	public RoundMirror() {
		super();

		this.setUnlocalizedName("round_mirror");
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
}