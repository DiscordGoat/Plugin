package me.discordgoat.BM.Main;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Cat;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	@SuppressWarnings("deprecation")
	@EventHandler

	public void onSpawn(CreatureSpawnEvent e) {
		@SuppressWarnings("unused")

		Location loc = e.getLocation();
		//Golem Armor
		ItemStack golemhat = new ItemStack(Material.IRON_HELMET);

		ItemMeta golemhatMeta = golemhat.getItemMeta();

		golemhatMeta.setDisplayName(ChatColor.GOLD + "Golem Helmet");
		golemhat.setItemMeta(golemhatMeta);
		golemhat.addEnchantment(Enchantment.MENDING, 1);
		golemhat.addEnchantment(Enchantment.DURABILITY, 3);
		golemhat.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		final ShapedRecipe golemhat1 = new ShapedRecipe(new ItemStack(golemhat)).shape("AAA", "A A", "   ").setIngredient('A', Material.IRON_BLOCK);
		Bukkit.addRecipe(golemhat1);
		
		
		
		ItemStack goathelm = new ItemStack(Material.GOLDEN_HELMET);
		ItemStack goatchest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack goatlegs = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack goatboots = new ItemStack(Material.GOLDEN_BOOTS);
		ItemMeta goathelmMeta = goathelm.getItemMeta();
		ItemMeta goatchestMeta = goatchest.getItemMeta();
		ItemMeta goatlegsMeta = goatlegs.getItemMeta();
		ItemMeta goatbootsMeta = goatboots.getItemMeta();
		goathelmMeta.setDisplayName(ChatColor.GOLD + "Goat Helmet");
		goathelm.setItemMeta(goathelmMeta);
		goathelm.addEnchantment(Enchantment.DURABILITY, 3);
		goathelm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		goathelm.addEnchantment(Enchantment.MENDING, 1);
		final ShapedRecipe goathelm1 = new ShapedRecipe(new ItemStack(goathelm)).shape("AAA", "B B", "   ")
				.setIngredient('A', Material.LEATHER).setIngredient('B', Material.MUTTON);
		Bukkit.addRecipe(goathelm1);
		goatchestMeta.setDisplayName(ChatColor.GOLD + "Goat Chestplate");
		goatchest.setItemMeta(goatchestMeta);
		goatchest.addEnchantment(Enchantment.DURABILITY, 3);
		goatchest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		goatchest.addEnchantment(Enchantment.MENDING, 1);
		final ShapedRecipe goatchest1 = new ShapedRecipe(new ItemStack(goatchest)).shape("A A", "BBB", "BAB")
				.setIngredient('A', Material.LEATHER).setIngredient('B', Material.MUTTON);
		Bukkit.addRecipe(goatchest1);
		goatlegsMeta.setDisplayName(ChatColor.GOLD + "Goat Leggings");
		goatchest.setItemMeta(goatlegsMeta);
		goatlegs.addEnchantment(Enchantment.DURABILITY, 3);
		goatlegs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		goatlegs.addEnchantment(Enchantment.MENDING, 1);
		final ShapedRecipe goatlegs1 = new ShapedRecipe(new ItemStack(goatlegs)).shape("AAA", "B B", "B B")
				.setIngredient('A', Material.LEATHER).setIngredient('B', Material.MUTTON);
		Bukkit.addRecipe(goatlegs1);
		goatbootsMeta.setDisplayName(ChatColor.GOLD + "Goat Boots");
		goatboots.setItemMeta(goatbootsMeta);
		goatboots.addEnchantment(Enchantment.DURABILITY, 3);
		goatboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		goatboots.addEnchantment(Enchantment.MENDING, 1);
		final ShapedRecipe goatboots1 = new ShapedRecipe(new ItemStack(goatboots)).shape("   ", "B B", "A A")
				.setIngredient('A', Material.LEATHER).setIngredient('B', Material.MUTTON);
		Bukkit.addRecipe(goatboots1);
		ItemStack nondeadhelm = new ItemStack(Material.LEATHER_HELMET);
		ItemStack nondeadchestpiece = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemStack nondeadlegs = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack nondeadshoe = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemStack ghoul = new ItemStack(Material.STONE_SWORD);

		ItemStack lethhelm = new ItemStack(Material.LEATHER_HELMET);
		ItemMeta lethhelmMeta = lethhelm.getItemMeta();
		lethhelmMeta.setDisplayName(ChatColor.GREEN + "Reinforced Leather Helmet");
		lethhelm.setItemMeta(lethhelmMeta);
		lethhelm.addEnchantment(Enchantment.DURABILITY, 3);
		lethhelm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		lethhelm.addEnchantment(Enchantment.MENDING, 1);

		ItemStack lethchest = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemMeta lethchestMeta = lethchest.getItemMeta();
		lethchestMeta.setDisplayName(ChatColor.GREEN + "Reinforced Leather Chestplate");
		lethchest.setItemMeta(lethchestMeta);
		lethchest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		lethchest.addEnchantment(Enchantment.DURABILITY, 3);
		lethchest.addEnchantment(Enchantment.MENDING, 1);
		final ShapedRecipe lethchest1 = new ShapedRecipe(new ItemStack(lethchest)).shape("A A", "ABA", "ABA")
				.setIngredient('A', Material.LEATHER).setIngredient('B', Material.COBBLESTONE);

		Bukkit.addRecipe(lethchest1);

		ItemStack lethlegs = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemMeta lethlegsMeta = lethlegs.getItemMeta();
		lethlegsMeta.setDisplayName(ChatColor.GREEN + "Reinforced Leather Leggings");
		lethlegs.setItemMeta(lethlegsMeta);
		lethlegs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		lethlegs.addEnchantment(Enchantment.DURABILITY, 3);
		lethlegs.addEnchantment(Enchantment.MENDING, 1);
		final ShapedRecipe lethlegs1 = new ShapedRecipe(new ItemStack(lethlegs)).shape("AAA", "B B", "B B")
				.setIngredient('A', Material.LEATHER).setIngredient('B', Material.COBBLESTONE);

		Bukkit.addRecipe(lethlegs1);

		ItemStack lethboots = new ItemStack(Material.LEATHER_BOOTS);
		ItemMeta lethbootsMeta = lethboots.getItemMeta();
		lethbootsMeta.setDisplayName(ChatColor.GREEN + "Reinforced Leather Boots");
		lethboots.setItemMeta(lethbootsMeta);
		lethboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		lethboots.addEnchantment(Enchantment.DURABILITY, 3);
		lethboots.addEnchantment(Enchantment.MENDING, 1);
		final ShapedRecipe lethboots1 = new ShapedRecipe(new ItemStack(lethboots)).shape("   ", "A A", "B B")
				.setIngredient('A', Material.LEATHER).setIngredient('B', Material.COBBLESTONE);
		Bukkit.addRecipe(lethboots1);
		
		ItemStack crystaldiamond = new ItemStack(Material.DIAMOND);
		ItemMeta crystaldiamondMeta = crystaldiamond.getItemMeta();
		crystaldiamondMeta.setDisplayName(ChatColor.BLUE + "Crystal Diamond");
		ArrayList<String> lore = new ArrayList<>();
		lore.add(ChatColor.BLUE + "RARE ITEM");
		crystaldiamondMeta.setLore(lore);
		crystaldiamond.addUnsafeEnchantment(Enchantment.MENDING, 1);
		crystaldiamondMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		crystaldiamondMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		crystaldiamondMeta.setUnbreakable(true);
		crystaldiamond.setItemMeta(crystaldiamondMeta);
		ItemStack crystaldiamondhelm = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta crystaldiamondhelmMeta = crystaldiamondhelm.getItemMeta();
		crystaldiamondhelmMeta.setDisplayName(ChatColor.DARK_PURPLE + "Crystal Diamond Helmet");
		ArrayList<String> lorey = new ArrayList<>();
		lorey.add("EPIC ARMOR");

		crystaldiamondhelmMeta.setLore(lorey);
		crystaldiamondhelm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		crystaldiamondhelmMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		crystaldiamondhelmMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		crystaldiamondhelmMeta.setUnbreakable(true);
		crystaldiamondhelm.setItemMeta(crystaldiamondhelmMeta);
		ShapedRecipe crystaldiamondhelm1 = new ShapedRecipe(crystaldiamondhelm);
		crystaldiamondhelm1.shape("ABA", "A A", "   ");
		crystaldiamondhelm1.setIngredient('A', crystaldiamond.getData());
		crystaldiamondhelm1.setIngredient('B', Material.IRON_INGOT);


		
		if (e.getEntity() instanceof Zombie) {
			LivingEntity zombie = e.getEntity();
			zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 1));
			zombie.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
			zombie.getCanPickupItems();
			zombie.getEquipment().setBoots(nondeadshoe);
			zombie.getEquipment().setBootsDropChance(0);
			zombie.getEquipment().setLeggings(nondeadlegs);
			zombie.getEquipment().setLeggingsDropChance(0);
			zombie.getEquipment().setHelmet(nondeadhelm);
			zombie.getEquipment().setHelmetDropChance(0);
			zombie.getEquipment().setChestplate(nondeadchestpiece);
			zombie.getEquipment().setChestplateDropChance(0);
			zombie.getEquipment().setItemInHand(crystaldiamond);
			zombie.getEquipment().setItemInHandDropChance(1);
			zombie.setCustomName(ChatColor.RED + "[lvl] 1 Zombie");
			zombie.setCustomNameVisible(true);

		}
		ItemStack nondeadhelmiron = new ItemStack(Material.LEATHER_HELMET);
		ItemStack nondeadchestpieceiron = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack nondeadlegsiron = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack nondeadshoes = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemStack littybow = new ItemStack(Material.BOW);
		if (e.getEntity() instanceof Skeleton) {
			LivingEntity skelet = e.getEntity();
			skelet.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 1));
			skelet.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
			littybow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
			skelet.getCanPickupItems();
			skelet.getEquipment().setBoots(nondeadshoes);
			skelet.getEquipment().setBootsDropChance(0);
			skelet.getEquipment().setLeggings(nondeadlegsiron);
			skelet.getEquipment().setLeggingsDropChance(0);
			skelet.getEquipment().setHelmet(nondeadhelmiron);
			skelet.getEquipment().setHelmetDropChance(0);
			skelet.getEquipment().setChestplate(nondeadchestpieceiron);
			skelet.getEquipment().setChestplateDropChance(0);
			skelet.getEquipment().setItemInHand(littybow);
			skelet.setCustomName(ChatColor.RED + "[lvl] 3 Skeleton");
			skelet.setCustomNameVisible(true);
		}
		if (e.getEntity() instanceof Creeper) {
			LivingEntity creeper = e.getEntity();
			creeper.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999, 0));
			creeper.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 1));
			creeper.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 1));
			creeper.getCanPickupItems();
			creeper.getEquipment().setBoots(nondeadshoes);
			creeper.getEquipment().setBootsDropChance(0);
			creeper.getEquipment().setLeggings(nondeadlegsiron);
			creeper.getEquipment().setLeggingsDropChance(0);
			creeper.getEquipment().setHelmet(nondeadhelmiron);
			creeper.getEquipment().setHelmetDropChance(0);
			creeper.getEquipment().setChestplate(nondeadchestpieceiron);
			creeper.getEquipment().setChestplateDropChance(0);
			creeper.setCustomName(ChatColor.RED + "[lvl] 7 Creeper");
			creeper.setCustomNameVisible(true);
		}
		if (e.getEntity() instanceof Spider) {
			LivingEntity arachnid = e.getEntity();
			arachnid.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1));
			arachnid.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 0));
			arachnid.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 3));
			arachnid.getCanPickupItems();
			arachnid.getEquipment().setBoots(nondeadshoes);
			arachnid.getEquipment().setBootsDropChance(0);
			arachnid.getEquipment().setLeggings(nondeadlegsiron);
			arachnid.getEquipment().setLeggingsDropChance(0);
			arachnid.getEquipment().setHelmet(nondeadhelmiron);
			arachnid.getEquipment().setHelmetDropChance(0);
			arachnid.getEquipment().setChestplate(nondeadchestpieceiron);
			arachnid.getEquipment().setChestplateDropChance(0);
			arachnid.setCustomName(ChatColor.RED + "[lvl] 2 Spider");
			arachnid.setCustomNameVisible(true);

		}
		if (e.getEntity() instanceof Witch) {
			LivingEntity alchemist = e.getEntity();
			alchemist.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
			alchemist.getCanPickupItems();
			alchemist.getEquipment().setBoots(nondeadshoes);
			alchemist.getEquipment().setBootsDropChance(0);
			alchemist.getEquipment().setLeggings(nondeadlegsiron);
			alchemist.getEquipment().setLeggingsDropChance(0);
			alchemist.getEquipment().setHelmet(nondeadhelmiron);
			alchemist.getEquipment().setHelmetDropChance(0);
			alchemist.getEquipment().setChestplate(nondeadchestpieceiron);
			alchemist.getEquipment().setChestplateDropChance(0);
			alchemist.setCustomName(ChatColor.RED + "[lvl] 11 Witch");
			alchemist.setCustomNameVisible(true);

		}
		if (e.getEntity() instanceof Blaze) {
			LivingEntity firedemon = e.getEntity();
			firedemon.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
			firedemon.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 2));
			firedemon.getCanPickupItems();
			firedemon.getEquipment().setBoots(nondeadshoes);
			firedemon.getEquipment().setBootsDropChance(0);
			firedemon.getEquipment().setLeggings(nondeadlegsiron);
			firedemon.getEquipment().setLeggingsDropChance(0);
			firedemon.getEquipment().setHelmet(nondeadhelmiron);
			firedemon.getEquipment().setHelmetDropChance(0);
			firedemon.getEquipment().setChestplate(nondeadchestpieceiron);
			firedemon.getEquipment().setChestplateDropChance(0);
			firedemon.setCustomName(ChatColor.RED + "[lvl] 21 Blaze");
			firedemon.setCustomNameVisible(true);

		}
		if (e.getEntity() instanceof CaveSpider) {
			LivingEntity fangedarachnid = e.getEntity();
			fangedarachnid.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
			fangedarachnid.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 2));
			fangedarachnid.getCanPickupItems();
			fangedarachnid.getEquipment().setBoots(nondeadshoes);
			fangedarachnid.getEquipment().setBootsDropChance(0);
			fangedarachnid.getEquipment().setLeggings(nondeadlegsiron);
			fangedarachnid.getEquipment().setLeggingsDropChance(0);
			fangedarachnid.getEquipment().setHelmet(nondeadhelmiron);
			fangedarachnid.getEquipment().setHelmetDropChance(0);
			fangedarachnid.getEquipment().setChestplate(nondeadchestpieceiron);
			fangedarachnid.getEquipment().setChestplateDropChance(0);
			fangedarachnid.setCustomName(ChatColor.RED + "[lvl] 14 Cave Spider");
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
		lore.add(ChatColor.GRAY + "Damage: " + ChatColor.RED + "+100");
		lore.add(ChatColor.GRAY + "Strength: " + ChatColor.RED + "+125");
		lore.add("Unbreakable");
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
			burnedskele.getEquipment().setItemInMainHand(ghoul);
			burnedskele.getEquipment().setItemInHandDropChance(1);

			burnedskele.setCustomName(ChatColor.RED + "[lvl] 54 Wither Skeleton");
			burnedskele.setCustomNameVisible(true);

		}
		ItemStack oinkzombhat = new ItemStack(Material.LEATHER_HELMET);
		ItemStack oinkzombshirt = new ItemStack(Material.GOLDEN_CHESTPLATE);
		ItemStack oinkzombpants = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemStack oinkzombslippers = new ItemStack(Material.GOLDEN_BOOTS);
		ItemStack shinysword = new ItemStack(Material.GOLDEN_SWORD);

		ItemMeta shinyswordMeta = heavysword.getItemMeta();
		shinyswordMeta.setDisplayName(ChatColor.GREEN + "Shiny Sword");
		shinysword.setItemMeta(shinyswordMeta);
		shinysword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
		shinysword.addEnchantment(Enchantment.DURABILITY, 3);
		shinysword.addEnchantment(Enchantment.SWEEPING_EDGE, 3);
		if (e.getEntity() instanceof PigZombie) {
			LivingEntity pigzomb = e.getEntity();
			pigzomb.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
			pigzomb.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 1));
			pigzomb.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 9999999, 2));
			pigzomb.getCanPickupItems();
			pigzomb.getEquipment().setBoots(oinkzombslippers);
			pigzomb.getEquipment().setBootsDropChance(0);
			pigzomb.getEquipment().setLeggings(oinkzombpants);
			pigzomb.getEquipment().setLeggingsDropChance(0);
			pigzomb.getEquipment().setHelmet(oinkzombhat);
			pigzomb.getEquipment().setHelmetDropChance(0);
			pigzomb.getEquipment().setChestplate(oinkzombshirt);
			pigzomb.getEquipment().setChestplateDropChance(0);
			pigzomb.getEquipment().setItemInMainHand(shinysword);
			pigzomb.setCustomName(ChatColor.RED + "[lvl] 34 Zombie Pigman");
			pigzomb.setCustomNameVisible(true);

		}
		if (e.getEntity() instanceof Enderman) {
			LivingEntity tpslender = e.getEntity();
			tpslender.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 9999999, 2));
			tpslender.setCustomName(ChatColor.RED + "[lvl] 74 Enderman");
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
			merm.setCustomName(ChatColor.RED + "[lvl] 15 Drowned");
			merm.setCustomNameVisible(true);
		}

	}
}
