package me.hammale.Sewer;

import java.util.HashSet;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;

public class AbandonedEntrance {

	Random gen = new Random();
	public HashSet<Location> spying = new HashSet<Location>();
	
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

		otherset.setType(Material.WOOD);
		set1.setType(Material.WOOD);
		set2.setType(Material.WOOD);
		set3.setType(Material.WOOD);
		set4.setType(Material.WOOD);
		set5.setType(Material.WOOD);
		set6.setType(Material.WOOD);
		set7.setType(Material.WOOD);
		set8.setType(Material.WOOD);
		set9.setType(Material.WALL_SIGN);

		Sign sign = (Sign)set9.getState();
		sign.setLine(0, "Stay Out");
		sign.setLine(1, "Danger!!!");
		sign.setLine(2, "Tresspassers");
		sign.setLine(3, "Will DIE!!!");
		int x = sign.getX();
		int y = sign.getY();
		int z = sign.getZ();
		
		World w = sign.getWorld();
		addLocation(w, x, y, z);
	}
	
	public void addLocation(World w, int x, int y, int z){
		Location l = new Location(w, x, y, z);
		spying.add(l);		
	}
	public boolean checkLocation(World w, int x, int y, int z){
		Location l = new Location(w, x, y, z);
		if(spying.contains(l)){
			//DO SOMTHING INTERESTING HERE!
			spying.remove(l);
			return true;
		}else{
			return false;
		}
	}
	
}