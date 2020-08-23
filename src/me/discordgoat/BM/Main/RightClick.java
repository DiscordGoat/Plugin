package me.discordgoat.BM.Main;

import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RightClick implements Listener {
	@EventHandler
	@SuppressWarnings("deprecation")
	public void onRightClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (p.getItemInHand().getItemMeta().getLore().equals(ChatColor.DARK_RED + "Resistance " + ChatColor.DARK_AQUA + "V")) {

			Block b = p.getTargetBlock((Set<Material>) null, 8);
			Location loc = new Location(b.getWorld(), b.getX(), b.getY(), b.getZ(), p.getLocation().getYaw(),
					p.getLocation().getPitch());
			p.playSound(loc, Sound.BLOCK_ANVIL_HIT, 1, 1);
			p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 20, 4));


			p.getWorld().spawnParticle(Particle.FLAME, p.getLocation().getX(), p.getLocation().getY(),
					p.getLocation().getZ(), 10, 10, 10, 1);

	

}

	}
}
}
