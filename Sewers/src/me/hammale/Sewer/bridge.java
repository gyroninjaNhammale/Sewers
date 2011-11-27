package me.hammale.Sewer;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;

public class bridge {

	Random gen = new Random();
	private final Tunnel tun = new Tunnel();
	
	public void nsbridge(Block set, Material m, BlockFace bf){

		BlockFace bf1 = BlockFace.NORTH;
		BlockFace bf2 = BlockFace.SOUTH;
		BlockFace bf3 = BlockFace.EAST;
		BlockFace bf4 = BlockFace.WEST;
		
		int tun1 = tun.nstStraight(set, m, bf2);
		
		int gap = gen.nextInt(15);
		
		if(gap <= 5){
			gap = 8;
		}
		
		int finalgap = gap+tun1;
		
		Block bridge = set.getRelative(BlockFace.SOUTH, finalgap);
		
		int tun2 = tun.nstStraight(bridge, m, bf2);
	}
}