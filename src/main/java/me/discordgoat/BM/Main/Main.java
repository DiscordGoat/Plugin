package me.discordgoat.BM.Main;

import java.util.*;
import me.discordgoat.BM.items.*;
import org.bukkit.*;
import org.bukkit.enchantments.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.plugin.java.*;
import org.bukkit.potion.*;

import me.discordgoat.BM.ScoreBoard.ScoreHelper;

public class Main extends JavaPlugin implements Listener {
	public static Main instance;

	public static ItemStack strongshield;
	public static ItemStack golemhat, golemchest, golemlegs, golemboots;
	public static ItemStack goathelm, goatchest, goatlegs, goatboots;
	public static ItemStack lethhelm, lethchest, lethlegs, lethboots;
	public static ItemStack crystaldiamond;
	public static ItemStack ghoul = new ItemStack(Material.STONE_SWORD);

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new RightClick(), this);
		instance = this;

		strongshield = ItemGenerator.generateItem("strongshield");
		golemhat = ItemGenerator.generateItem("golemhat");
		golemchest = ItemGenerator.generateItem("golemchest");
		golemlegs = ItemGenerator.generateItem("golemlegs");
		golemboots = ItemGenerator.generateItem("golemboots");
		goathelm = ItemGenerator.generateItem("goathelm");
		goatchest = ItemGenerator.generateItem("goatchest");
		goatlegs = ItemGenerator.generateItem("goatlegs");
		goatboots = ItemGenerator.generateItem("goatboots");
		lethhelm = ItemGenerator.generateItem("lethhelm");
		lethchest = ItemGenerator.generateItem("lethchest");
		lethlegs = ItemGenerator.generateItem("lethlegs");
		lethboots = ItemGenerator.generateItem("lethboots");
		crystaldiamond = ItemGenerator.generateItem("crystaldiamond");
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		ScoreHelper helper = ScoreHelper.createScore(player);
		helper.setTitle(ChatColor.GREEN + "SkyBlock");
		helper.setSlot(3, ChatColor.GRAY + "" + ChatColor.UNDERLINE + "-------------------");
		helper.setSlot(2, ChatColor.GREEN + "Coins: " + ChatColor.WHITE + "1");
		helper.setSlot(3, ChatColor.GRAY + "" + ChatColor.UNDERLINE + "-------------------");
	}

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		if(ScoreHelper.hasScore(player)) {
			ScoreHelper.removeScore(player);
		}
	}

	public void onSpawn(CreatureSpawnEvent e) {
		if (e.getEntity() instanceof Zombie) {
			LivingEntity zombie = e.getEntity();
			zombie.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 9999999, 1));
			zombie.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9999999, 1));
			zombie.setCustomName(ChatColor.RED + "[lvl] 1 Zombie");
			zombie.setCustomNameVisible(true);

		}
		ItemStack nondeadhelmiron = new ItemStack(Material.LEATHER_HELMET);
		ItemStack nondeadchestpieceiron = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack nondeadlegsiron = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack nondeadshoes = new ItemStack(Material.CHAINMAIL_BOOTS);
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
			creeper.getCanPickupItems();
			creeper.getEquipment().setBoots(nondeadshoes);
			creeper.getEquipment().setBootsDropChance(0);
			creeper.getEquipment().setLeggings(nondeadlegsiron);
			creeper.getEquipment().setLeggingsDropChance(0);
			creeper.getEquipment().setHelmet(nondeadhelmiron);
			creeper.getEquipment().setHelmetDropChance(0);
			creeper.getEquipment().setChestplate(nondeadchestpieceiron);
			creeper.getEquipment().setChestplateDropChance(0);
			creeper.setCustomName(ChatColor.RED + "[lvl] 1 Creeper");
			creeper.setCustomNameVisible(true);
		}


		if (e.getEntity() instanceof Spider) {
			LivingEntity arachnid = e.getEntity();
			arachnid.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 0));
			arachnid.getCanPickupItems();
			arachnid.getEquipment().setBoots(nondeadshoes);
			arachnid.getEquipment().setBootsDropChance(0);
			arachnid.getEquipment().setLeggings(nondeadlegsiron);
			arachnid.getEquipment().setLeggingsDropChance(0);
			arachnid.getEquipment().setHelmet(nondeadhelmiron);
			arachnid.getEquipment().setHelmetDropChance(0);
			arachnid.getEquipment().setChestplate(nondeadchestpieceiron);
			arachnid.getEquipment().setChestplateDropChance(0);
			arachnid.setCustomName(ChatColor.RED + "[lvl] 1 Spider");
			arachnid.setCustomNameVisible(true);

		}
		if (e.getEntity() instanceof Witch) {
			LivingEntity alchemist = e.getEntity();
			alchemist.getCanPickupItems();
			alchemist.getEquipment().setBoots(nondeadshoes);
			alchemist.getEquipment().setBootsDropChance(0);
			alchemist.getEquipment().setLeggings(nondeadlegsiron);
			alchemist.getEquipment().setLeggingsDropChance(0);
			alchemist.getEquipment().setHelmet(nondeadhelmiron);
			alchemist.getEquipment().setHelmetDropChance(0);
			alchemist.getEquipment().setChestplate(nondeadchestpieceiron);
			alchemist.getEquipment().setChestplateDropChance(0);
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
		ItemStack burnedskelehelm = new ItemStack(Material.LEATHER_HELMET);
		ItemStack burnedskelechest = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemStack burnedskeleleather = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack burnedskeleshoes = new ItemStack(Material.CHAINMAIL_BOOTS);

		ItemStack heavysword = new ItemStack(Material.IRON_SWORD, 1000);
		ItemMeta heavyswordMeta = heavysword.getItemMeta();
		heavyswordMeta.setDisplayName(ChatColor.GREEN + "Heavy Sword");

		// Set lore
		ArrayList<String> lore1 = new ArrayList<>();
		lore1.add(ChatColor.GRAY + "Damage: " + ChatColor.RED + "+100");
		lore1.add(ChatColor.GRAY + "Strength: " + ChatColor.RED + "+125");
		lore1.add("Unbreakable");
		heavyswordMeta.setLore(lore1);
		heavysword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
		heavyswordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		heavyswordMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		heavysword.setItemMeta(heavyswordMeta);
		if (e.getEntity() instanceof WitherSkeleton) {
			LivingEntity burnedskele = e.getEntity();
			burnedskele.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
			burnedskele.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 0));
			burnedskele.getCanPickupItems();
			burnedskele.getEquipment().setBoots(burnedskeleshoes);
			burnedskele.getEquipment().setBootsDropChance(0);
			burnedskele.getEquipment().setLeggings(burnedskeleleather);
			burnedskele.getEquipment().setLeggingsDropChance(0);
			burnedskele.getEquipment().setHelmet(burnedskelehelm);
			burnedskele.getEquipment().setHelmetDropChance(0);
			burnedskele.getEquipment().setChestplate(burnedskelechest);
			burnedskele.getEquipment().setChestplateDropChance(0);
			//burnedskele.getEquipment().setItemInMainHand(ghoul);
			burnedskele.getEquipment().setItemInHandDropChance(1);

			burnedskele.setCustomName(ChatColor.RED + "[lvl] 2 Wither Skeleton");
			burnedskele.setCustomNameVisible(true);

		}
		new ItemStack(Material.LEATHER_HELMET);
		new ItemStack(Material.GOLDEN_CHESTPLATE);
		new ItemStack(Material.CHAINMAIL_LEGGINGS);
		new ItemStack(Material.GOLDEN_BOOTS);
		ItemStack shinysword = new ItemStack(Material.GOLDEN_SWORD);

		ItemMeta shinyswordMeta = heavysword.getItemMeta();
		shinyswordMeta.setDisplayName(ChatColor.GREEN + "Shiny Sword");
		shinysword.setItemMeta(shinyswordMeta);
		shinysword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
		shinysword.addEnchantment(Enchantment.DURABILITY, 3);
		shinysword.addEnchantment(Enchantment.SWEEPING_EDGE, 3);
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
