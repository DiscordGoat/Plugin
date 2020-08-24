package me.discordgoat.bm;

import me.discordgoat.bm.entities.*;
import me.discordgoat.bm.events.*;
import me.discordgoat.bm.items.*;
import me.discordgoat.bm.scoreboard.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.event.player.*;
import org.bukkit.inventory.*;
import org.bukkit.plugin.java.*;

public class Main extends JavaPlugin implements Listener {
	public static Main instance;

	public static ItemStack strongshield;
	public static ItemStack golemhat, golemchest, golemlegs, golemboots;
	public static ItemStack goathelm, goatchest, goatlegs, goatboots;
	public static ItemStack lethhelm, lethchest, lethlegs, lethboots;
	public static ItemStack crystaldiamond;
	public static ItemStack heavysword, shinysword, ghoul = new ItemStack(Material.STONE_SWORD);

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new RightClick(), this);
		Bukkit.getPluginManager().registerEvents(new EntityHelper(), this);
		instance = this;

		// Must be after the assignment above, or will raise NullPointerException!
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
		heavysword = ItemGenerator.generateItem("heavysword");
		shinysword = ItemGenerator.generateItem("shinysword");
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		ScoreHelper helper = ScoreHelper.createScore(player);
		helper.setTitle(ChatColor.GREEN + "SkyBlock");
		helper.setSlot(3, ChatColor.GRAY + "-------------------");
		helper.setSlot(2, ChatColor.GREEN + "Coins: " + ChatColor.WHITE + "1");
		helper.setSlot(1, ChatColor.GRAY + "-------------------");

		player.getInventory().addItem(heavysword, shinysword);
		player.getInventory().setItemInOffHand(strongshield);
	}

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		if(ScoreHelper.hasScore(player)) {
			ScoreHelper.removeScore(player);
		}
	}
}
