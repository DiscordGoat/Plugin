package me.discordgoat.bm.entities;

import me.discordgoat.bm.Main;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.event.entity.*;
import org.bukkit.inventory.*;
import org.bukkit.potion.*;

public final class EntityHelper implements Listener {
    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Zombie) {
            LivingEntity zombie = e.getEntity();
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 9999999, 1));
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9999999, 1));
            zombie.setCustomName(ChatColor.RED + "[lvl] 1 Zombie");
            zombie.setCustomNameVisible(true);
        }

        // Useless statement??
        new ItemStack(Material.BOW);

        if (e.getEntity() instanceof Skeleton) {
            LivingEntity skelet = e.getEntity();

            skelet.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 2));
            skelet.setCustomName(ChatColor.RED + "[lvl] 1 Skeleton");
            skelet.setCustomNameVisible(true);
        }
        if (e.getEntity() instanceof Creeper) {
            LivingEntity creeper = e.getEntity();
            creeper.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999, 0));
            creeper.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 1));
            creeper.setCustomName(ChatColor.RED + "[lvl] 1 Creeper");
            creeper.setCustomNameVisible(true);
        }
        if (e.getEntity() instanceof Spider) {
            LivingEntity arachnid = e.getEntity();
            arachnid.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 0));
            arachnid.setCustomName(ChatColor.RED + "[lvl] 1 Spider");
            arachnid.setCustomNameVisible(true);

        }
        if (e.getEntity() instanceof Witch) {
            LivingEntity alchemist = e.getEntity();
            alchemist.setCustomName(ChatColor.RED + "[lvl] 1 Witch");
            alchemist.setCustomNameVisible(true);

        }
        if (e.getEntity() instanceof Blaze) {
            LivingEntity firedemon = e.getEntity();
            firedemon.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 2));
            firedemon.setCustomName(ChatColor.RED + "[lvl] 1 Blaze");
            firedemon.setCustomNameVisible(true);

        }
        if (e.getEntity() instanceof CaveSpider) {
            LivingEntity fangedarachnid = e.getEntity();
            fangedarachnid.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 2));
            fangedarachnid.setCustomName(ChatColor.RED + "[lvl] 1 Cave Spider");
            fangedarachnid.setCustomNameVisible(true);

        }
        if (e.getEntity() instanceof WitherSkeleton) {
            LivingEntity burnedskele = e.getEntity();
            burnedskele.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
            burnedskele.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 0));
            burnedskele.getCanPickupItems();
            burnedskele.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
            burnedskele.getEquipment().setBootsDropChance(0);
            burnedskele.getEquipment().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
            burnedskele.getEquipment().setLeggingsDropChance(0);
            burnedskele.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
            burnedskele.getEquipment().setHelmetDropChance(0);
            burnedskele.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
            burnedskele.getEquipment().setChestplateDropChance(0);
            burnedskele.getEquipment().setItemInMainHand(Main.ghoul);
            burnedskele.getEquipment().setItemInMainHandDropChance(1);

            burnedskele.setCustomName(ChatColor.RED + "[lvl] 2 Wither Skeleton");
            burnedskele.setCustomNameVisible(true);
        }

        if (e.getEntity() instanceof PigZombie) {
            LivingEntity pigzomb = e.getEntity();
            pigzomb.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 1));
            pigzomb.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 9999999, 2));
            pigzomb.setCustomName(ChatColor.RED + "[lvl] 1 Zombie Pigman");
            pigzomb.setCustomNameVisible(true);

        }
        if (e.getEntity() instanceof Enderman) {
            LivingEntity tpslender = e.getEntity();
            tpslender.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
            tpslender.setCustomName(ChatColor.RED + "[lvl] 2 Enderman");
            tpslender.setCustomNameVisible(true);
        }
        if (e.getEntity() instanceof Bat) {
            LivingEntity demonbird = e.getEntity();
            demonbird.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1));
            demonbird.setCustomName(ChatColor.RED + "[lvl] 1 Bat");
            demonbird.setCustomNameVisible(true);
        }
        if (e.getEntity() instanceof Cat) {
            LivingEntity silvester = e.getEntity();
            silvester.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 0));
            silvester.setCustomName(ChatColor.RED + "[lvl] 1 Cat");
            silvester.setCustomNameVisible(true);
        }
        if (e.getEntity() instanceof Chicken) {
            LivingEntity hayhay = e.getEntity();
            hayhay.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 0));
            hayhay.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 99999, 0));
            hayhay.setCustomName(ChatColor.RED + "[lvl] 1 Chicken");
            hayhay.setCustomNameVisible(true);
        }
        if (e.getEntity() instanceof Cow) {
            LivingEntity moo = e.getEntity();
            moo.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 0));
            moo.setCustomName(ChatColor.RED + "[lvl] 1 Cow");
            moo.setCustomNameVisible(true);
        }
        if (e.getEntity() instanceof Drowned) {
            LivingEntity merm = e.getEntity();
            merm.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 0));
            merm.setCustomName(ChatColor.RED + "[lvl] 1 Drowned");
            merm.setCustomNameVisible(true);
        }
    }
}
