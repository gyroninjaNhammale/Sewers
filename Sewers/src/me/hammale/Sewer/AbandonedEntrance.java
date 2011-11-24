package me.hammale.Sewer;

import java.util.Random;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;

public class AbandonedEntrance {

Random gen = new Random();

	public void entrance1(Block set, Material m, BlockFace bf){
	
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
		
		otherset.setType(Material.FENCE);
		set1.setType(Material.FENCE);
		set2.setType(Material.FENCE);
		set3.setType(Material.FENCE);
		set4.setType(Material.FENCE);
		set5.setType(Material.FENCE);
		set6.setType(Material.FENCE);
		set7.setType(Material.FENCE);
		set8.setType(Material.FENCE);
		
		byte flags = (byte) (0x5);//may need to be 0x2
		set9.setTypeIdAndData(68, flags, true);
		
		Sign sign = (Sign)set9.getState();
		sign.setLine(0, "Stay Out");
		sign.setLine(1, "Danger!!!");
		sign.setLine(2, "Trespassers");
		sign.setLine(3, "Will DIE!!!");
		int x = sign.getX();
		int y = sign.getY();
		int z = sign.getZ();
		
		World w = sign.getWorld();
	
	}

}