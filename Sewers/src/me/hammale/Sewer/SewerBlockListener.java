package me.hammale.Sewer;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;

public class SewerBlockListener extends BlockListener {
	
	private final AbandonedEntrance aent = new AbandonedEntrance();
	
	public void onBlockBreak(BlockBreakEvent e) {
		
		Block b = e.getBlock();
		if(b.getTypeId() == 63 || b.getTypeId() == 323){
			World w = b.getWorld();
			int x = b.getX();
			int y = b.getY();
			int z = b.getZ();			
			boolean contains = aent.checkLocation(w, x, y, z);
			
			if(contains){
				b.setTypeId(46);
			}
			
		}
		
	}
}
