package me.hammale.Sewer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.getspout.spoutapi.gui.GenericContainer;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.gui.GenericTexture;
import org.getspout.spoutapi.gui.InGameHUD;
import org.getspout.spoutapi.gui.PopupScreen;
import org.getspout.spoutapi.gui.WidgetAnchor;
import org.getspout.spoutapi.player.SpoutPlayer;

public class SewerLocate {
	
	public ArrayList<Integer> distance = new ArrayList<Integer>();
	public Location end;
	public boolean nav = false;
	public InGameHUD hud;
	public GenericTexture images;
	
	public HashSet<String> active = new HashSet<String>();
	public double initial = 0;
	public String direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/w.png";
	
    public Sewer plugin;
    
    public void SewerLocate1(Sewer plugin) {
		this.plugin = plugin;
	}
	
	public Location findSewer(World w, Player p){
		
		try{
			  // Open the file that is the first 
			  // command line parameter
			  FileInputStream fstream = new FileInputStream("plugins/Sewers/sewers.txt");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  //Read File Line By Line
			  int far;
			  while ((strLine = br.readLine()) != null){
			  // Print the content on the console
			  String delims = ",";
			  String[] cords = strLine.split(delims);

			  int x = Integer.parseInt(cords[0]);
			  int y = Integer.parseInt(cords[1]);
			  int z = Integer.parseInt(cords[2]);
			  
				  Location l = w.getBlockAt(x, y, z).getLocation();
				  double dis = p.getEyeLocation().distance(l);
				  far = (int)dis;
				  
				  if(dis > far){
					  end = l;
				  }
			  }
			  in.close();
			  return end;
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
		return null;		
	}
	
	public void DisplayArrows(Player p){
		
		initial = p.getEyeLocation().distance(findSewer(p.getWorld(), p));
		
		active.add(p.getName());
		
		SpoutPlayer player = (SpoutPlayer) p;
		
		hud = player.getMainScreen();
        GenericContainer generalBox = new GenericContainer();
        images = new GenericTexture();
        PopupScreen popup = new GenericPopup();
        
        generalBox.setAnchor(WidgetAnchor.TOP_CENTER);
        
        images.setUrl("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/e.png");
        try {
          @SuppressWarnings("unused")
          URL urlimage = new URL("http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/e.png");
        }
        catch (MalformedURLException e1) {
          e1.printStackTrace();
        }

        generalBox.setWidth(48).setHeight(48);
        images.setWidth(48).setHeight(48);
        images.setVisible(true);
        generalBox.addChild(images);
        
        hud.attachWidget(plugin, generalBox);
        player.getMainScreen().setScreen(hud);
		
        nav = true;
		}
	
	public void StopNav(Player p) {

		active.remove(p.getName());
		SpoutPlayer player = (SpoutPlayer) p;
		player.getMainScreen().removeWidgets(plugin);
		nav = false;
		
	}
	
	public void updateScreen(Player p){
		
		SpoutPlayer player = (SpoutPlayer) p;
        try {
            @SuppressWarnings("unused")
            URL urlimage = new URL(direction);
          }
          catch (MalformedURLException e1) {
            e1.printStackTrace();
          }

        images.setUrl(direction);
		player.getMainScreen().updateWidget(hud);
		
	}
	
}
