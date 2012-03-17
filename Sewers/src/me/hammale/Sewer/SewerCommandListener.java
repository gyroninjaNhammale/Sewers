package me.hammale.Sewer;

import java.util.Random;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SewerCommandListener
  implements CommandExecutor
{
  private final UltraGen ugen = new UltraGen();
  public Sewer plugin;
  Random gen = new Random();
  String arg;
  String arg1;
  int a1;
  private final SewerLocate loc = new SewerLocate();

  public SewerCommandListener(Sewer plugin)
  {
    this.plugin = plugin;
  }

  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    Player p = null;
    if ((sender instanceof Player)) {
      p = (Player)sender;
    }

    if (command.getName().equalsIgnoreCase("sewer"))
    {
      if (args.length == 2) {
        arg = args[0];
        arg1 = args[1];

        if (arg.equalsIgnoreCase("create"))
          if (p == null) {
            System.out.println("[Sewers] This command can only be run by a player!"); } else {
            if (p.isOp()) {
              try {
                a1 = Integer.parseInt(arg1);
              }
              catch (NumberFormatException e) {
                sender.sendMessage(ChatColor.RED + arg1 + " is not a number");
                return true;
              }
              p.sendMessage(ChatColor.GREEN + "Generating Sewer...");
              Block b = p.getLocation().getBlock();
              b.setType(Material.AIR);
              Material m = Material.SMOOTH_BRICK;
              BlockFace bf = BlockFace.NORTH;
              Block set2 = b;
              ugen.ugen(set2, m, bf, a1);

              p.sendMessage(ChatColor.GREEN + "Sewer Complete!");

              return true;
            }

            sender.sendMessage("This command can only be run by an OP!");
          }
      }
      else if (args.length == 1) {
        arg = args[0];
        if (arg.equalsIgnoreCase("create")) {
          if (p == null) {
            System.out.println("[Sewers] This command can only be run by a player!"); } else {
            if (p.isOp()) {
              p.sendMessage(ChatColor.GREEN + "Generating Sewer...");
              Block b = p.getLocation().getBlock();
              b.setType(Material.AIR);
              Material m = Material.SMOOTH_BRICK;
              BlockFace bf = BlockFace.NORTH;
              Block set2 = b;
              int roomnum = 0;
              while (roomnum < 50) {
                roomnum = gen.nextInt(100);
              }
              ugen.ugen(set2, m, bf, roomnum);

              p.sendMessage(ChatColor.GREEN + "Sewer Complete!");

              return true;
            }

            sender.sendMessage("This command can only be run by an OP!");
          }
        }

        if (arg.equalsIgnoreCase("locate")) {
          if (p == null) {
            System.out.println("This command can only be run by a player!"); } else {
            if (p.isOp()) {
              p.sendMessage(ChatColor.GREEN + "Locating Sewer...");

              Location l = loc.findSewer(p.getWorld(), p);
              if (l != null)
                p.sendMessage(ChatColor.GREEN + "Closest sewer located @: " + ChatColor.BLUE + l.getX() + ChatColor.GREEN + ", " + ChatColor.YELLOW + l.getY() + ChatColor.GREEN + ", " + ChatColor.RED + l.getZ());
              else {
                p.sendMessage(ChatColor.RED + "No Sewer's found!");
              }
              return true;
            }

            sender.sendMessage("This command can only be run by an OP!");
          }
        }

        if (arg.equalsIgnoreCase("reload")) {
          if (p == null) {
            plugin.reloadConfig();
            System.out.println("[Sewers] Sewers Reloaded!");
            return true;
          }if (p.isOp()) {
            plugin.reloadConfig();
            p.sendMessage(ChatColor.GREEN + "Sewers Reloaded!");
            return true;
          }

          sender.sendMessage("This command can only be run by an OP!");
        }

      }

    }

    return false;
  }
}