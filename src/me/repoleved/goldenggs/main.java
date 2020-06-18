package me.repoleved.goldenggs;

import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new gg(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
