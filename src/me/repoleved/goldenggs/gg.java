package me.repoleved.goldenggs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import net.md_5.bungee.api.ChatColor;

public class gg implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event){
		if(event.getPlayer().hasPermission("goldenggs.use")) {
		String newMessage = event.getMessage().replace("GG", "" + ChatColor.GOLD + ChatColor.BOLD + "GG");
		event.setMessage(newMessage);
		String newMessage1 = event.getMessage().replace("gg", "" + ChatColor.GOLD + ChatColor.BOLD + "GG");
		event.setMessage(newMessage1);
		}
	}
	
	
}
	

