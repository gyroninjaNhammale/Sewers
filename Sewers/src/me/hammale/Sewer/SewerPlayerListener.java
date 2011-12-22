package me.hammale.Sewer;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class SewerPlayerListener extends PlayerListener {
	 
    public Sewer plugin;
    
    public SewerPlayerListener(Sewer plugin) {
		this.plugin = plugin;
	}
	
	private final SewerLocate loc = new SewerLocate(plugin);
	
	public void onPlayerMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		//if(loc.active.contains(p.getName())){
			System.out.println("MOVING!");
			if(p.getEyeLocation().distance(loc.findSewer(p.getWorld(), p)) < loc.initial){
				loc.direction = getDirection(p);
			}else{
				if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/e.png")){
					loc.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/w.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/w.png")){
					loc.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/e.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/n.png")){
					loc.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/s.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/s.png")){
					loc.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/n.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/nw.png")){
					loc.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/se.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/se.png")){
					loc.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/nw.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/sw.png")){
					loc.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/ne.png";
				}else if(getDirection(p).equals("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/ne.png")){
					loc.direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/sw.png";
				}
			}
			loc.updateScreen(p);
		//}
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
