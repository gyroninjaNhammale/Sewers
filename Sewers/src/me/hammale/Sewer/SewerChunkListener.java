package me.hammale.Sewer;

import java.util.Random;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.event.world.WorldListener;

public class SewerChunkListener extends WorldListener {
	
	private final SewerGenerator sewergen = new SewerGenerator();
	    public final Sewer plugin;
		Random gen = new Random();
		
		public SewerChunkListener(Sewer plugin) {
			this.plugin = plugin;
		}
	
		public void onChunkPopulate(ChunkPopulateEvent event){
			int ran = gen.nextInt(100);
			if(ran == 0){
			World w = event.getWorld();
			if(plugin.isAllowedWorld(w) == 1){
		    int bx = event.getChunk().getX()<<4;
			int bz = event.getChunk().getZ()<<4;
			
			Block b = w.getBlockAt(bx, 127, bz);
			int i = 1;
			Block down = b.getRelative(BlockFace.DOWN, 1);
			while (down.getType() == (Material.AIR)){
				 down = b.getRelative(BlockFace.DOWN, i);
				 if(i == 70){
					 break;
				 }
				 i++;
			}

				System.out.println("[Sewers] Generating Sewer @ X:" + down.getLocation().getX() + " Y:"+ down.getLocation().getY() + " Z:" + down.getLocation().getZ());
				Material m = (Material.SMOOTH_BRICK);
				BlockFace bf = BlockFace.SOUTH;
				sewergen.start1(down, m, bf);
				System.out.println("[Sewers] Sewer Complete!");
				
		    }	
		}
	}
					
}
