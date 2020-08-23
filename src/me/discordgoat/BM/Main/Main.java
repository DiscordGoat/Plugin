package me.discordgoat.BM.Main;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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
		e.getLocation();
		// op shield
		ItemStack strongshield = new ItemStack(Material.SHIELD);
		ItemMeta strongshieldMeta = strongshield.getItemMeta();
		strongshieldMeta.setDisplayName(ChatColor.DARK_GRAY + "Resistant Shield");
		strongshieldMeta.setUnbreakable(true);
		ArrayList<String> lore4 = new ArrayList<>();
		lore4.add("");
		lore4.add(ChatColor.DARK_RED + "Resistance " + ChatColor.DARK_AQUA + "V");
		strongshieldMeta.setLore(lore4);
		strongshieldMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		strongshieldMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		strongshieldMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		strongshieldMeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		strongshieldMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		strongshieldMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		strongshield.setItemMeta(strongshieldMeta);
		strongshield.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		
		final ShapedRecipe strongshield1 = new ShapedRecipe(new ItemStack(strongshield)).shape("BAB", "BBB", " B ").setIngredient('A', Material.HEART_OF_THE_SEA)
				.setIngredient('B', Material.SHIELD);
		Bukkit.addRecipe(strongshield1);
		//Golem Armor
		
		ItemStack golemhat = new ItemStack(Material.IRON_HELMET);

		ItemMeta golemhatMeta = golemhat.getItemMeta();

		golemhatMeta.setDisplayName(ChatColor.GOLD + "Golem Helmet");

		golemhatMeta.setUnbreakable(true);
		ArrayList<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_RED + "Protection " + ChatColor.DARK_AQUA + "V");
		golemhatMeta.setLore(lore);
		golemhatMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		golemhatMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		golemhatMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		golemhatMeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		golemhatMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		golemhatMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		golemhat.setItemMeta(golemhatMeta);
		golemhat.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		golemhat.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
		golemhat.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
		golemhat.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
		golemhat.addUnsafeEnchantment(Enchantment.OXYGEN, 5);
		golemhat.addUnsafeEnchantment(Enchantment.WATER_WORKER, 5);

		final ShapedRecipe golemhat1 = new ShapedRecipe(new ItemStack(golemhat)).shape("   ", "AAA", "A A").setIngredient('A', Material.IRON_BLOCK);
		Bukkit.addRecipe(golemhat1);
		
		ItemStack golemchest = new ItemStack(Material.IRON_CHESTPLATE);

		ItemMeta golemchestMeta = golemchest.getItemMeta();

		golemchestMeta.setDisplayName(ChatColor.GOLD + "Golem Chestplate");

		golemchestMeta.setUnbreakable(true);
		ArrayList<String> lore2 = new ArrayList<>();
		lore2.add("");
		lore2.add(ChatColor.DARK_RED + "Protection " + ChatColor.DARK_AQUA + "V");
		golemchestMeta.setLore(lore2);
		golemchestMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		golemchestMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		golemchestMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		golemchestMeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		golemchestMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		golemchestMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		golemchest.setItemMeta(golemchestMeta);
		golemchest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		golemchest.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
		golemchest.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
		golemchest.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);

		final ShapedRecipe golemchest1 = new ShapedRecipe(new ItemStack(golemchest)).shape("A A", "AAA", "AAA").setIngredient('A', Material.IRON_BLOCK);
		Bukkit.addRecipe(golemchest1);
		
		ItemStack golemlegs = new ItemStack(Material.IRON_LEGGINGS);

		ItemMeta golemlegsMeta = golemlegs.getItemMeta();

		golemlegsMeta.setDisplayName(ChatColor.GOLD + "Golem Leggings");

		golemlegsMeta.setUnbreakable(true);
		ArrayList<String> lore3 = new ArrayList<>();
		lore3.add("");
		lore3.add(ChatColor.DARK_RED + "Protection " + ChatColor.DARK_AQUA + "V");
		golemlegsMeta.setLore(lore3);
		golemlegsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		golemlegsMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		golemlegsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		golemlegsMeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		golemlegsMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		golemlegsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		golemlegs.setItemMeta(golemlegsMeta);
		golemlegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		golemlegs.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
		golemlegs.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
		golemlegs.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);

		final ShapedRecipe golemlegs1 = new ShapedRecipe(new ItemStack(golemlegs)).shape("AAA", "A A", "A A").setIngredient('A', Material.IRON_BLOCK);
		Bukkit.addRecipe(golemlegs1);
		
		ItemStack golemboots = new ItemStack(Material.IRON_BOOTS);

		ItemMeta golembootsMeta = golemboots.getItemMeta();

		golembootsMeta.setDisplayName(ChatColor.GOLD + "Golem Boots");

		golembootsMeta.setUnbreakable(true);
		ArrayList<String> lore5 = new ArrayList<>();
		lore5.add("");
		lore5.add(ChatColor.DARK_RED + "Protection " + ChatColor.DARK_AQUA + "V");
		golembootsMeta.setLore(lore5);
		golembootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		golembootsMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		golembootsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		golembootsMeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		golembootsMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		golembootsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		golemboots.setItemMeta(golemlegsMeta);
		golemboots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		golemboots.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
		golemboots.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
		golemboots.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
		golemboots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 5);

		final ShapedRecipe golemboots1 = new ShapedRecipe(new ItemStack(golemboots)).shape("   ", "A A", "A A").setIngredient('A', Material.IRON_BLOCK);
		Bukkit.addRecipe(golemboots1);
		
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
		new ItemStack(Material.LEATHER_HELMET);
		new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		new ItemStack(Material.LEATHER_LEGGINGS);
		new ItemStack(Material.CHAINMAIL_BOOTS);
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
		ArrayList<String> Y = new ArrayList<>();
		lore.add(ChatColor.BLUE + "RARE ITEM");
		crystaldiamondMeta.setLore(Y);
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
