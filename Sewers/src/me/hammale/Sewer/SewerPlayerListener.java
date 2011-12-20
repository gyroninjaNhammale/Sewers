package me.hammale.Sewer;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class SewerPlayerListener extends PlayerListener {
	
	private Sewer plugin;
	 
	public SewerPlayerListener(Sewer plugin) {
		this.plugin = plugin;
	}
	
	private final SewerCommandListener cmd = new SewerCommandListener(plugin);
	
	public void onPlayerMove(PlayerMoveEvent e) {
		if(!(plugin.active.isEmpty())){
		if(plugin.active.contains(e.getPlayer().getName())){
			Player p = e.getPlayer();
			String dir = getDirection(e.getPlayer());
			if(p.getEyeLocation().distance(cmd.findSewer(p.getWorld(), p)) < plugin.initial){
				plugin.direction = getDirection(p);
			}else{
				if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/e.png")){
					plugin.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/w.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/w.png")){
					plugin.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/e.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/n.png")){
					plugin.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/s.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/s.png")){
					plugin.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/n.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/nw.png")){
					plugin.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/se.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/se.png")){
					plugin.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/nw.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/sw.png")){
					plugin.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/ne.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/ne.png")){
					plugin.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/sw.png";
				}
			}
			cmd.updateScreen(p);
		}
		}
	}
	
	   public String getDirection(Player playerSelf){
	         String dir = "";
	         float y = playerSelf.getLocation().getYaw();
	         if( y < 0 ){y += 360;}
	         y %= 360;
	         int i = (int)((y+8) / 22.5);
	         if(i == 0){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/w.png";}
	         else if(i == 1){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/nw.png";}
	         else if(i == 2){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/nw.png";}
	         else if(i == 3){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/nw.png";}
	         else if(i == 4){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/n.png";}
	         else if(i == 5){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/ne.png";}
	         else if(i == 6){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/ne.png";}
	         else if(i == 7){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/ne.png";}
	         else if(i == 8){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/e.png";}
	         else if(i == 9){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/se.png";}
	         else if(i == 10){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/se.png";}
	         else if(i == 11){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/se.png";}
	         else if(i == 12){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/s.png";}
	         else if(i == 13){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/sw.png";}
	         else if(i == 14){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/sw.png";}
	         else if(i == 15){dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/sw.png";}
	         else {dir = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/w.png";}
	         return dir;
	    }
	
}
