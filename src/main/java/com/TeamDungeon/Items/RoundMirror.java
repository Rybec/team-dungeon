package com.teamdungeon.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;



public class RoundMirror extends Item {
	// For casting time and cooldown
	private int counter = 0;
	private int cast_time = 20 * 2;  //  2 Seconds
	private int cooldown  = 20 * 30; // 30 Seconds
	
	// These are necessary for tracking casting time
	private BlockPos bed = null;
	private int dim = 0;
	private EntityPlayer player;
	
	public RoundMirror() {
		super();

		this.setUnlocalizedName("round_mirror");
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack i_stack, World wld, EntityPlayer play, EnumHand hand) {

		// If still cooling down or client side (only server can change position)
		if (counter > 0 || wld.isRemote) {
			return new ActionResult(EnumActionResult.FAIL, i_stack);
		}

		// Get player's bed in the dimension the player is in
		player = play;
		dim = player.dimension;
		bed = player.getBedLocation(dim);

		if (bed == null) {
			// If player has no bed in this dimension...
			dim = 0;
			bed = player.getBedLocation(0); // Get player's bed in Overworld
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
			counter = cast_time + cooldown;
			return new ActionResult(EnumActionResult.SUCCESS, i_stack);  // Otherwise the mirror will be consumed on use
		} else {
			return new ActionResult(EnumActionResult.FAIL, i_stack);  // Otherwise the mirror will be consumed on use
		}

	}

	public void onUpdate(ItemStack stack, World wld, Entity entity, int itemSlot, boolean selected) {
		super.onUpdate(stack, wld, entity, itemSlot, selected);
		if (counter > 0) {
			counter--;
		}
		
		if (bed != null && counter < cooldown) {
			if (dim != player.dimension) {
//!!!!! This consistently causes crashes.  No clue why.  It should be moving the player to the
// Overworld, when the player is in a dimension with no bed/spawn.
// See https://github.com/sky0-1/Nomadic-Tents-1.9/blob/master/com/yurtmod/block/TileEntityTentDoor.java#L134-L179 for some example code.  Also run `grep transferPlayerToDimension * -r` in build/tmp/recompileMc/sources/net/minecraft for the function signature and a use case example.
//!!!!!
				player.getServer().getPlayerList().transferPlayerToDimension((EntityPlayerMP)player, dim, player.getServer().worldServerForDimension(dim).getDefaultTeleporter());
			}
			
			player.setPositionAndUpdate(bed.getX(), bed.getY(), bed.getZ());
			bed = null;
		}
	}
}