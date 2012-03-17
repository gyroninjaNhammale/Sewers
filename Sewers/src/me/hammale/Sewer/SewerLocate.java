package me.hammale.Sewer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class SewerLocate
{
  public ArrayList<Integer> distance = new ArrayList<Integer>();
  public Location end;
  public boolean nav = false;

  public double initial = 0.0D;
  public String direction = "http://www.hammhome.net/alex/hammcraft/plugins/sewers/images/w.png";
  public Sewer plugin;

  public void SewerLocate1(Sewer plugin)
  {
    this.plugin = plugin;
  }

  public Location findSewer(World w, Player p)
  {
    try
    {
      FileInputStream fstream = new FileInputStream("plugins/Sewers/sewers.txt");

      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String strLine;
      while ((strLine = br.readLine()) != null)
      {
        String delims = ",";
        String[] cords = strLine.split(delims);

        int x = Integer.parseInt(cords[0]);
        int y = Integer.parseInt(cords[1]);
        int z = Integer.parseInt(cords[2]);

        Location l = w.getBlockAt(x, y, z).getLocation();
        double dis = p.getEyeLocation().distance(l);
        int far = (int)dis;

        if (dis > far) {
          end = l;
        }
      }
      in.close();
      return end;
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
    return null;
  }
}