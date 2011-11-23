package me.hammale.Sewer;

import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Sewer extends JavaPlugin {
	static Server server;
	static Plugin plugin;
	
	//private final SewerBlockListener blockListener = new SewerBlockListener();
	//public final SewerPlayerListener playerListener = new SewerPlayerListener();
	
	private SewerCommandListener cmdExecutor;
	private SewerChunkListener chunkListener;
	
	@Override
	public void onEnable()
    {	 
	    System.out.println("Sewers Enabled!" );
	    cmdExecutor = new SewerCommandListener(this);
	    chunkListener = new SewerChunkListener(this);
		getCommand("sewer").setExecutor(cmdExecutor);
		registerEvents();
		
		server = this.getServer();
		plugin = this;
    }
	public void onDisable()
    {
		System.out.println("Sewers Disabled!");
    }
	private void registerEvents()
    {
		getServer().getPluginManager().registerEvent(Event.Type.CHUNK_POPULATED, this.chunkListener, Event.Priority.Normal, this);
    }
}