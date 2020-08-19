

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onSpawn(CreatureSpawnEvent e) {
		@SuppressWarnings("unused")
		Location loc = e.getLocation();
		if (e.getEntity() instanceof Zombie) {
			LivingEntity zombie = e.getEntity();
			zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 1));
			zombie.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 9999999, 20));
			zombie.setCustomName(ChatColor.RED + "[lvl] 1 Zombie");
			zombie.setCustomNameVisible(true);
		}
	}
}
