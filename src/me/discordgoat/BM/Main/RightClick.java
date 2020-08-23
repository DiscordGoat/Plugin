package me.discordgoat.BM.Main;

import java.util.*;
import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;
import org.bukkit.event.player.*;
import org.bukkit.potion.*;

public class RightClick implements Listener {
	@EventHandler
	@SuppressWarnings("deprecation")
	public void onRightClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (p.getItemInHand().getItemMeta().getLore() != null) {
				List<String> lore = p.getInventory().getItemInMainHand().getItemMeta().getLore();
				if (lore == null || lore.size() < 2 || !lore.get(1).equals(ChatColor.DARK_RED + "Resistance " + ChatColor.DARK_AQUA + "V"))
					return;
				Block b = p.getTargetBlock(null, 8);
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
