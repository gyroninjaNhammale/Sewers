package me.hammale.Sewer;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SewerCommandListener implements CommandExecutor {
    
	private final SewerGenerator sewergen = new SewerGenerator();
	
	@SuppressWarnings("unused")
	private Sewer plugin;
 
	public SewerCommandListener(Sewer plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player p = null;
		if (sender instanceof Player) {
			p = (Player) sender;
		}
		
		if (command.getName().equalsIgnoreCase("sewer")) {
			
			if(args.length == 1){
			String arg = args[0];
			if(arg.equalsIgnoreCase("create")){
			
			if (p == null) {
				sender.sendMessage("This command can only be run by a player!");
			} else if (p.isOp()) {

				Block b = p.getLocation().getBlock();
				p.sendMessage(ChatColor.GREEN + "Generating Sewer...");
				b.setType(Material.AIR);
				Material m = (Material.SMOOTH_BRICK);
				BlockFace bf = BlockFace.SOUTH;
				Block set2 = b;
				sewergen.start1(set2, m, bf);
				p.sendMessage(ChatColor.GREEN + "Sewer Complete!");
										
			return true;
			}
			else {
				sender.sendMessage("This command can opnly be run by an OP!");
			}
		}
	}
}
		return false;
}		
	
}


