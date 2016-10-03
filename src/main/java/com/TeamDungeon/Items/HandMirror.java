package com.teamdungeon.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;

public class HandMirror extends Item {
	public HandMirror() {
		super();

		this.setUnlocalizedName("hand_mirror");
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack i_stack, World wld, EntityPlayer player, EnumHand hand) {
System.out.println("\nRight clicked on the Hand Mirror!\n");

		// Get player's bed in the dimension the player is in
		BlockPos bed = player.getBedLocation(player.dimension);
System.out.println("Bed location: " + bed + " in dimension " + player.dimension);

		if (bed == null) {
			// If player has no bed in this dimension...
			player.changeDimension(0);  // Take player to Overworld
			bed = player.getBedLocation(0); // Get player's bed in Overworld
			System.out.println("Bed location: " + bed + " in dimension 0 (Overworld)");
		}

		if (bed != null) {
			// If bed was found (in current dimension or Overworld)
			BlockPos spawn = player.getBedSpawnLocation(wld, bed, true);
			if (spawn != null) {
				bed = spawn;
			}
		} else {
			// If no bed was found, player will be in Overworld now,
			// and we can just take the player to world spawn.
			bed = wld.getSpawnPoint();
		}
System.out.println("Ultimate spawn location: " + bed);

		// And now we move the player to the spawn location
		if (bed != null) {
			player.setPosition(bed.getX(), bed.getY(), bed.getZ());
			return new ActionResult(EnumActionResult.SUCCESS, i_stack);  // Otherwise the mirror will be consumed on use
		} else {
			return new ActionResult(EnumActionResult.FAIL, i_stack);  // Otherwise the mirror will be consumed on use
		}
	}
}