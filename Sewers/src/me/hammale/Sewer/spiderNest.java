package me.hammale.Sewer;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.Creature;
import org.bukkit.entity.CreatureType;
import org.bukkit.inventory.ItemStack;

public class spiderNest {

	Random gen = new Random();

	private final AbandonedTunnel tun = new AbandonedTunnel();
	
	public void nest1(Block set, Material m, BlockFace bf){


		
		BlockFace bf1 = BlockFace.NORTH;
		BlockFace bf2 = BlockFace.SOUTH;
		BlockFace bf3 = BlockFace.EAST;
		BlockFace bf4 = BlockFace.WEST;
				
		int tun1 = tun.nstStraight(set, m, bf);
		
		int distance = tun1/2-5;
		
		Block initialset0 = set.getRelative(bf1, distance);
		Block initialset1 = initialset0.getRelative(bf4, 4);
		Block initialset = initialset1.getRelative(BlockFace.DOWN, 7);
		
		int i = 0;
		while(i <= 7){
			Block otherset = initialset.getRelative(BlockFace.UP, i);
			Block set1 = otherset.getRelative(bf1, 1);
			Block set2 = set1.getRelative(bf1, 1);
			Block set3 = set2.getRelative(bf1, 1);
			Block set4 = set3.getRelative(bf1, 1);
			Block set5 = set4.getRelative(bf1, 1);
			Block set6 = set5.getRelative(bf1, 1);
			Block set7 = set6.getRelative(bf1, 1);
			Block set8 = set7.getRelative(bf1, 1);
			
			Block set21 = otherset.getRelative(bf3, 1);
			Block set22 = set21.getRelative(bf3, 1);
			Block set23 = set22.getRelative(bf3, 1);
			Block set24 = set23.getRelative(bf3, 1);
			Block set25 = set24.getRelative(bf3, 1);
			Block set26 = set25.getRelative(bf3, 1);
			Block set27 = set26.getRelative(bf3, 1);
			Block set28 = set27.getRelative(bf3, 1);
			
			Block set31 = set8.getRelative(bf3, 1);
			Block set32 = set31.getRelative(bf3, 1);
			Block set33 = set32.getRelative(bf3, 1);
			Block set34 = set33.getRelative(bf3, 1);
			Block set35 = set34.getRelative(bf3, 1);
			Block set36 = set35.getRelative(bf3, 1);
			Block set37 = set36.getRelative(bf3, 1);
			Block set38 = set37.getRelative(bf3, 1);
			
			Block set41 = set38.getRelative(bf2, 1);
			Block set42 = set41.getRelative(bf2, 1);
			Block set43 = set42.getRelative(bf2, 1);
			Block set44 = set43.getRelative(bf2, 1);
			Block set45 = set44.getRelative(bf2, 1);
			Block set46 = set45.getRelative(bf2, 1);
			Block set47 = set46.getRelative(bf2, 1);
			Block set48 = set47.getRelative(bf2, 1);
			
			int i1 = 1;			
			while(i1 <= 7){
				Block clr = set41.getRelative(bf4, i1);
				clr.setType(Material.WEB);
				i1++;
			}
			i1 = 1;
			while(i1 <= 7){
				Block clr = set42.getRelative(bf4, i1);
				clr.setType(Material.WEB);
				i1++;
			}
			i1 = 1;
			while(i1 <= 7){
				Block clr = set43.getRelative(bf4, i1);
				clr.setType(Material.WEB);
				i1++;
			}
			i1 = 1;
			while(i1 <= 7){
				Block clr = set44.getRelative(bf4, i1);
				clr.setType(Material.WEB);
				i1++;
			}
			i1 = 1;
			while(i1 <= 7){
				Block clr = set45.getRelative(bf4, i1);
				clr.setType(Material.WEB);
				i1++;
			}
			i1 = 1;
			while(i1 <= 7){
				Block clr = set46.getRelative(bf4, i1);
				clr.setType(Material.WEB);
				i1++;
			}
			i1 = 1;
			while(i1 <= 7){
				Block clr = set47.getRelative(bf4, i1);
				clr.setType(Material.WEB);
				i1++;
			}
			i1 = 1;
			while(i1 <= 7){
				Block clr = set48.getRelative(bf4, i1);
				clr.setType(Material.WEB);
				i1++;
			}
			
//			Block clr1 = fence1.get
//			Relative(BlockFace.UP, x);
//			Block clr2 = clr1.getRelative(bf4, 1);
//			Block clr3 = clr2.getRelative(bf4, 1);
//			Block clr4 = fence1.getRelative(bf4, 1);
//			
//			Block clr5 = clr1.getRelative(bf3, 1);
//			Block clr6 = clr1.getRelative(bf3, 2);
//			Block clr7 = clr3.getRelative(bf4, 1);
//			Block clr8 = clr3.getRelative(bf4, 2);
//			
//			Block clr9 = fence1.getRelative(bf3, 1);
//			Block clr10 = fence2.getRelative(bf4, 1);
//			Block clr11 = fence1.getRelative(bf3, 2);
//			Block clr12 = fence2.getRelative(bf4, 2);
						
			int ran1 = gen.nextInt(3);
			otherset.setType(m);
			otherset.setData((byte) ran1);
			
			int ran2 = gen.nextInt(3);
			set1.setType(m);
			set1.setData((byte) ran2);

			int ran3 = gen.nextInt(3);
			set2.setType(m);
			set2.setData((byte) ran3);
			
			int ran4 = gen.nextInt(3);
			set3.setType(m);
			set3.setData((byte) ran4);
			
			int ran5 = gen.nextInt(3);
			set4.setType(m);
			set4.setData((byte) ran5);
			
			int ran6 = gen.nextInt(3);
			set5.setType(m);
			set5.setData((byte) ran6);

			int ran7 = gen.nextInt(3);
			set6.setType(m);
			set6.setData((byte) ran7);

			int ran8 = gen.nextInt(3);
			set7.setType(m);
			set7.setData((byte) ran8);
			
			int ran9 = gen.nextInt(3);
			set8.setType(m);
			set8.setData((byte) ran9);
//	//		
			int ran21 = gen.nextInt(3);
			set21.setType(m);
			set21.setData((byte) ran21);

			int ran23 = gen.nextInt(3);
			set22.setType(m);
			set22.setData((byte) ran23);
			
			int ran24 = gen.nextInt(3);
			set23.setType(m);
			set23.setData((byte) ran24);
			
			int ran25 = gen.nextInt(3);
			set24.setType(m);
			set24.setData((byte) ran25);
			
			int ran26 = gen.nextInt(3);
			set25.setType(m);
			set25.setData((byte) ran26);

			int ran27 = gen.nextInt(3);
			set26.setType(m);
			set26.setData((byte) ran27);

			int ran28 = gen.nextInt(3);
			set27.setType(m);
			set27.setData((byte) ran28);

			int ran29 = gen.nextInt(3);
			set28.setType(m);
			set28.setData((byte) ran29);
//	//		
			int ran31 = gen.nextInt(3);
			set31.setType(m);
			set31.setData((byte) ran31);

			int ran33 = gen.nextInt(3);
			set32.setType(m);
			set32.setData((byte) ran33);
			
			int ran34 = gen.nextInt(3);
			set33.setType(m);
			set33.setData((byte) ran34);
			
			int ran35 = gen.nextInt(3);
			set34.setType(m);
			set34.setData((byte) ran35);
			
			int ran36 = gen.nextInt(3);
			set35.setType(m);
			set35.setData((byte) ran36);

			int ran37 = gen.nextInt(3);
			set36.setType(m);
			set36.setData((byte) ran37);

			int ran38 = gen.nextInt(3);
			set37.setType(m);
			set37.setData((byte) ran38);

			int ran39 = gen.nextInt(3);
			set38.setType(m);
			set38.setData((byte) ran39);
//	//		
			int ran41 = gen.nextInt(4);
			set41.setType(m);
			set41.setData((byte) ran41);

			int ran43 = gen.nextInt(4);
			set42.setType(m);
			set42.setData((byte) ran43);
			
			int ran44 = gen.nextInt(4);
			set43.setType(m);
			set44.setData((byte) ran44);
			
			int ran45 = gen.nextInt(4);
			set44.setType(m);
			set44.setData((byte) ran45);
			
			int ran46 = gen.nextInt(4);
			set45.setType(m);
			set45.setData((byte) ran46);

			int ran47 = gen.nextInt(4);
			set46.setType(m);
			set46.setData((byte) ran47);

			int ran48 = gen.nextInt(4);
			set47.setType(m);
			set47.setData((byte) ran48);

			int ran49 = gen.nextInt(4);
			set48.setType(m);
			set48.setData((byte) ran49);
			if(i == 2){
				Block spawner = otherset.getRelative(bf1, 4);
				Block spawner2 = spawner.getRelative(bf3, 4);
				spawner2.setTypeId(52);
				BlockState state = spawner2.getState();
				CreatureSpawner spawner3 = (CreatureSpawner) state;
				CreatureType type = CreatureType.CAVE_SPIDER;
				
				Block s0 = spawner2.getRelative(BlockFace.DOWN, 1);
				
				Block s1 = s0.getRelative(bf1, 1);
				Block s2 = s0.getRelative(bf1, 2);
				Block s3 = s0.getRelative(bf1, 3);
				
				Block s4 = s0.getRelative(bf2, 1);
				Block s5 = s0.getRelative(bf2, 2);
				Block s6 = s0.getRelative(bf2, 3);
				
				Block s7 = s0.getRelative(bf3, 1);
				Block s8 = s0.getRelative(bf3, 2);
				Block s9 = s0.getRelative(bf3, 3);
				
				Block s10 = s0.getRelative(bf4, 1);
				Block s11 = s0.getRelative(bf4, 2);
				Block s12 = s0.getRelative(bf4, 3);
				
				s0.setTypeId(98);
				s1.setTypeId(98);
				s2.setTypeId(98);
				s3.setTypeId(98);
				s4.setTypeId(98);
				s5.setTypeId(98);
				s6.setTypeId(98);
				s7.setTypeId(98);
				s8.setTypeId(98);
				s9.setTypeId(98);
				s10.setTypeId(98);
				s11.setTypeId(98);
				s12.setTypeId(98);
				
				spawner3.setCreatureType(type);
			}
			if(i == 1){
				i1 = 2;
				while(i1 <= 6){
					Block clr = set41.getRelative(bf4, i1);
					clr.setType(Material.SMOOTH_BRICK);								

					Block clr1 = set42.getRelative(bf4, i1);
					clr1.setType(Material.SMOOTH_BRICK);

					Block clr2 = set43.getRelative(bf4, i1);
					clr2.setType(Material.SMOOTH_BRICK);
				
					Block clr3 = set44.getRelative(bf4, i1);
					clr3.setType(Material.SMOOTH_BRICK);				

					Block clr4 = set45.getRelative(bf4, i1);
					clr4.setType(Material.SMOOTH_BRICK);		

					Block clr5 = set46.getRelative(bf4, i1);
					clr5.setType(Material.SMOOTH_BRICK);
			
					Block clr6 = set47.getRelative(bf4, i1);
					clr6.setType(Material.SMOOTH_BRICK);			

					Block clr7 = set48.getRelative(bf4, i1);
					clr7.setType(Material.SMOOTH_BRICK);
					i1++;
				}					
			}
			if(i == 7 || i == 6 || i ==5){
				i1 = 2;
				while(i1 <= 6){
					Block clr2 = set43.getRelative(bf4, i1);
					clr2.setType(Material.AIR);
				
					Block clr3 = set44.getRelative(bf4, i1);
					clr3.setType(Material.AIR);				

					Block clr4 = set45.getRelative(bf4, i1);
					clr4.setType(Material.AIR);			
					i1++;
				}					
			}
			if(i == 7){
				i1 = 2;
				while(i1 <= 6){
					Block clr = set41.getRelative(bf4, i1);
					Block up = clr.getRelative(BlockFace.UP, 1);
					if(up.getTypeId() != 98){
						up.setType(Material.WATER);
					}
					
					clr.setType(Material.IRON_FENCE);								

					Block clr1 = set42.getRelative(bf4, i1);
					clr1.setType(Material.IRON_FENCE);
					up = clr1.getRelative(BlockFace.UP, 1);
					if(up.getTypeId() != 98){
						up.setType(Material.WATER);
					}
					
					
					Block clr2 = set43.getRelative(bf4, i1);
					clr2.setType(Material.IRON_FENCE);
					up = clr2.getRelative(BlockFace.UP, 1);
					if(up.getTypeId() != 98){
						up.setType(Material.WATER);
					}
					
					
					Block clr3 = set44.getRelative(bf4, i1);
					clr3.setType(Material.IRON_FENCE);				
					up = clr3.getRelative(BlockFace.UP, 1);
					
					if(up.getTypeId() != 98){
						up.setType(Material.WATER);
					}
					
					Block clr4 = set45.getRelative(bf4, i1);
					clr4.setType(Material.IRON_FENCE);		
					up = clr4.getRelative(BlockFace.UP, 1);
					if(up.getTypeId() != 98){
						up.setType(Material.WATER);
					}
					
					
					Block clr5 = set46.getRelative(bf4, i1);
					clr5.setType(Material.IRON_FENCE);
					up = clr5.getRelative(BlockFace.UP, 1);
					if(up.getTypeId() != 98){
						up.setType(Material.WATER);
					}
					
					
					Block clr6 = set47.getRelative(bf4, i1);
					clr6.setType(Material.IRON_FENCE);			
					up = clr6.getRelative(BlockFace.UP, 1);
					if(up.getTypeId() != 98){
						up.setType(Material.WATER);
					}
					
					
					Block clr7 = set48.getRelative(bf4, i1);
					clr7.setType(Material.IRON_FENCE);
					up = clr7.getRelative(BlockFace.UP, 1);
					if(up.getTypeId() != 98){
						up.setType(Material.WATER);
					}
					
					i1++;
				}					
			}
			i++;
		}
	}
}