package me.discordgoat.bm.events;

import me.discordgoat.bm.Main;
import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;
import org.bukkit.event.player.*;
import org.bukkit.inventory.*;
import org.bukkit.potion.*;

public class RightClick implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            ItemStack item = e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.SHIELD) ?
                    e.getPlayer().getInventory().getItemInMainHand() : e.getPlayer().getInventory().getItemInOffHand();

            /* Use isSimilar if you want to check if the item is equal to another instead of checking the lore */
            if (item.isSimilar(Main.strongshield)) {
                Block b = p.getTargetBlock(null, 8);
                Location loc = new Location(b.getWorld(), b.getX(), b.getY(), b.getZ(), p.getLocation().getYaw(),
                        p.getLocation().getPitch());
                p.playSound(loc, Sound.BLOCK_ANVIL_HIT, 1, 1);
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 4));
                p.getWorld().spawnParticle(Particle.FLAME, p.getLocation().getX(), p.getLocation().getY(),
                        p.getLocation().getZ(), 10, 10, 10, 1);
            }
        }
    }
}
