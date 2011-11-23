package me.hammale.Sewer;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class AbandonedEntrance {

	Random gen = new Random();
	public AbandonedEntrance (Block set, Material m, BlockFace bf){

		Block otherset = set.getRelative(bf, 0);
		Block set1 = otherset.getRelative(BlockFace.WEST, 1);
		Block set2 = otherset.getRelative(BlockFace.EAST, 1);
		Block set3 = otherset.getRelative(BlockFace.UP, 1);
		Block set4 = set1.getRelative(BlockFace.UP, 1);
		Block set5 = set2.getRelative(BlockFace.UP, 1);
		Block set6 = set3.getRelative(BlockFace.UP, 1);
		Block set7 = set4.getRelative(BlockFace.UP, 1);
		Block set8 = set5.getRelative(BlockFace.UP, 1);
		Block set9 = set3.getRelative(BlockFace.SOUTH, 1);

		otherset.setType(Material.WOOD);
		set1.setType(Material.WOOD);
		set2.setType(Material.WOOD);
		set3.setType(Material.WOOD);
		set4.setType(Material.WOOD);
		set5.setType(Material.WOOD);
		set6.setType(Material.WOOD);
		set7.setType(Material.WOOD);
		set8.setType(Material.WOOD);
		set9.setType(Material.WALL_SIGN); //sign will say be ware or something if you destroy it or click it it willl summon lightning to strike and the wood will disapear.
	}
	
	
}