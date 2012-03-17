package me.hammale.Sewer;

import com.randomappdev.pluginstats.Ping;

import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Sewer extends JavaPlugin
{
  private SewerCommandListener cmdExecutor;
  private SewerChunkListener chunkListener;
  private SewerBlockListener blockListener;
  //private SewerPlayerListener playerListener;
  public FileConfiguration config;

  public void onEnable()
  {
    loadConfiguration();
    PluginDescriptionFile pdfFile = getDescription();
    System.out.println("[Sewers] Version " + pdfFile.getVersion() + " Enabled!");
    cmdExecutor = new SewerCommandListener(this);
    chunkListener = new SewerChunkListener(this);

    //playerListener = new SewerPlayerListener();
    blockListener = new SewerBlockListener();
    getCommand("sewer").setExecutor(cmdExecutor);
    registerEvents();

    pluginStats();
  }
  public void pluginStats() {
    Ping png = new Ping();
    png.init(this);
  }

  public void onDisable() {
    PluginDescriptionFile pdfFile = getDescription();
    System.out.println("[Sewers] Version " + pdfFile.getVersion() + " Disabled!");
  }

  private void registerEvents() {
    getServer().getPluginManager().registerEvents(chunkListener, this);
    getServer().getPluginManager().registerEvents(blockListener, this);
    //getServer().getPluginManager().registerEvents(playerListener, this);
  }

  public void loadConfiguration()
  {
    config = getConfig();
    config.options().copyDefaults(true);

    for (World w : getServer().getWorlds()) {
      String wrld = w.getName();
      String path2 = "ChunkGeneration.World.AllowSewers." + wrld;
      config.addDefault(path2, 1);
    }

    String path1 = "ChunkGeneration.Frequency";
    config.addDefault(path1, 100);

    config.options().copyDefaults(true);
    saveConfig();
  }

  public int isAllowedWorld(World w) {
    config = getConfig();
    String wrld = w.getName();
    int amnt = config.getInt("ChunkGeneration.World.AllowSewers." + wrld);
    return amnt;
  }

  public int getFreq() {
    config = getConfig();
    int amnt = config.getInt("ChunkGeneration.Frequency");
    return amnt;
  }
}