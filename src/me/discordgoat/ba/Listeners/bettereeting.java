package me.discordgoat.ba.Listeners;


import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class bettereeting extends JavaPlugin implements Listener {
	

	public void onEat(PlayerItemConsumeEvent e) {
		Player p = (e.getPlayer());
			
		
        

        	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 0));
        	p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 1));
        
		
		
	}

}
