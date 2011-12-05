package me.hammale.Sewer;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.block.Sign;
import org.bukkit.entity.Creature;
import org.bukkit.entity.CreatureType;
import org.bukkit.inventory.ItemStack;

public class CaveIn {

	Random gen = new Random();

	private final AbandonedTunnel tun = new AbandonedTunnel();
	
	public int cavein1(Block set, Material m, BlockFace bf){
		
		BlockFace bf1 = BlockFace.NORTH;
		BlockFace bf2 = BlockFace.SOUTH;
		BlockFace bf3 = BlockFace.EAST;
		BlockFace bf4 = BlockFace.WEST;
				
		int tun1 = tun.nstStraight(set, m, bf);
		
		Block blocked = set.getRelative(BlockFace.UP, 1);
		Block s1 = blocked.getRelative(bf4, 1);
		Block s2 = blocked.getRelative(BlockFace.UP, 1);
		Block s3 = s2.getRelative(bf4, 1);
		Block s4 = s3.getRelative(BlockFace.UP, 1);
		Block s5 = s4.getRelative(bf3, 1);	
		Block s6 = s4.getRelative(bf3, 2);
		Block s7 = s2.getRelative(bf3, 1);
		Block sign = s2.getRelative(bf2, 1);
		
		blocked.setTypeId(85);
		s1.setTypeId(85);
		s2.setTypeId(85);
		s3.setTypeId(85);
		s4.setTypeId(85);
		s5.setTypeId(85);
		s6.setTypeId(85);
		s7.setTypeId(85);

		byte flags = (byte) (0x5);//may need to be 0x2
		sign.setTypeIdAndData(68, flags, true);
		
		Sign signtext = (Sign)sign.getState();
		signtext.setLine(0, "Danger!!!");
		signtext.setLine(1, "CLOSED FOR");
		signtext.setLine(2, "CAVE-IN");
		signtext.setLine(3, "STAY OUT!!!");
	
		int i = 1;
		while(i < tun1-2){
			Block initial= set.getRelative(bf, i);
			Block b0 = initial.getRelative(BlockFace.UP, 1);
			Block b1 = initial.getRelative(bf4, 1);
			Block b2 = initial.getRelative(BlockFace.UP, 1);
			Block b3 = b2.getRelative(bf4, 1);
			Block b4 = b3.getRelative(BlockFace.UP, 1);
			Block b5 = b4.getRelative(bf3, 1);	
			Block b6 = b4.getRelative(bf3, 2);
			Block b7 = b2.getRelative(bf3, 1);
			
			Block b8 = b4.getRelative(BlockFace.UP, 1);
			Block b9 = b8.getRelative(bf3, 1);	
			Block b10 = b9.getRelative(bf3, 1);	
			
			if(b0.getType() == Material.AIR || b0.getType() == Material.WATER){				
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b0.setType(m);
					b0.setData((byte) ran0);
				}
			}
			if(b1.getType() == Material.AIR || b1.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b1.setType(m);
					b1.setData((byte) ran0);
				}
			}
			if(b2.getType() == Material.AIR || b2.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b2.setType(m);
					b2.setData((byte) ran0);
				}
			}
			if(b3.getType() == Material.AIR || b3.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b3.setType(m);
					b3.setData((byte) ran0);
				}
			}
			if(b4.getType() == Material.AIR || b4.getType() == Material.WATER){;
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b4.setType(m);
					b4.setData((byte) ran0);
				}
			}
			if(b5.getType() == Material.AIR || b5.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b5.setType(m);
					b5.setData((byte) ran0);
				}
			}
			if(b6.getType() == Material.AIR || b6.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b6.setType(m);
					b6.setData((byte) ran0);
				}
			}
			if(b7.getType() == Material.AIR || b7.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b7.setType(m);
					b7.setData((byte) ran0);
				}
			}
			if(b8.getType() == Material.AIR || b8.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b8.setType(m);
					b8.setData((byte) ran0);
				}
			}
			if(b9.getType() == Material.AIR || b9.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b9.setType(m);
					b9.setData((byte) ran0);
				}
			}
			if(b10.getType() == Material.AIR || b10.getType() == Material.WATER){
				int r0 = gen.nextInt(2);
				if(r0 == 1){
					int ran0 = gen.nextInt(3);
					b10.setType(m);
					b10.setData((byte) ran0);
				}
			}
			i++;
		}
		//START CHEST CODE//
		
		Block otherset = set.getRelative(bf, tun1-2);
		Block c2 = otherset.getRelative(BlockFace.UP, 1);	
		int chestran = gen.nextInt(10);

		for (int x = 1; x <= chestran; x++){
			int matran = gen.nextInt(11);;
			Material mat = null;
			if(matran == 0){
				mat = Material.COOKED_BEEF;
			}
			if(matran == 1){
				mat = Material.COOKED_CHICKEN;
			}
			if(matran == 2){
				mat = Material.COOKED_FISH;
			}
			if(matran == 3){
				mat = Material.GOLD_INGOT;
			}
			if(matran == 4){
				mat = Material.FLINT_AND_STEEL;
			}
			if(matran == 5){
				mat = Material.SADDLE;
			}
			if(matran == 6){
				mat = Material.BOOKSHELF;
			}
			if(matran == 7){
				mat = Material.CHAINMAIL_HELMET;
			}
			if(matran == 8){
				mat = Material.CHAINMAIL_LEGGINGS;
			}
			if(matran == 9){
				mat = Material.DIAMOND;
			}
			if(matran == 10){
				mat = Material.BUCKET;
			}
			int amt = gen.nextInt(10);

			c2.setTypeId(54);
			Chest chest = (Chest)c2.getState();
			if (matran <= 4) {
				chest.getInventory().addItem(new ItemStack[] { new ItemStack(mat, amt) });
			}

			else {
				chest.getInventory().addItem(new ItemStack[] { new ItemStack(mat, 1) });
			}
		}
		
		//END CHEST CODE//
		return tun1;
	}
}	
	