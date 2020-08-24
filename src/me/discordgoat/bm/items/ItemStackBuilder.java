package me.discordgoat.bm.items;

import java.util.*;
import me.discordgoat.bm.*;
import org.bukkit.*;
import org.bukkit.enchantments.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;

public class ItemStackBuilder {
    public String name;
    public String displayName;
    public String material;
    public boolean unbreakable;
    public int hideFlags;
    public List<String> lore;
    public List<RecipeBuilder> recipes;
    public List<EnchantmentBuilder> enchantments;

    /* Builds an ItemStack based on the attributes of this class */
    public ItemStack build() {
        Material mat = Material.getMaterial(material);
        if (mat == null)
            return null;
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        if (meta == null)
            return null;
        meta.setDisplayName(displayName);
        meta.setUnbreakable(unbreakable);

        /* Bitwise manipulation of HideFlags, see https://minecraft.gamepedia.com/Tutorials/Command_NBT_tags
         */
        if ((hideFlags & 1) != 0)
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        if ((hideFlags & 2) != 0)
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        if ((hideFlags & 4) != 0)
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        if ((hideFlags & 8) != 0)
            meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
        if ((hideFlags & 16) != 0)
            meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        if ((hideFlags & 32) != 0)
            meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);

        meta.setLore(lore);
        item.setItemMeta(meta);
        for (EnchantmentBuilder enchBuilder : enchantments) {
            Enchantment ench = new EnchantmentWrapper(enchBuilder.id);
            item.addUnsafeEnchantment(ench, enchBuilder.level);
        }

        int i = 0;
        /* Building the ItemStack will also register any recipes associated with it */
        for (RecipeBuilder recipeBuilder : recipes) {
            Recipe recipe = recipeBuilder.build(new NamespacedKey(Main.instance, name + i), item);
            Bukkit.addRecipe(recipe);
            i++; // Avoid clashing NamespacedKeys
        }
        return item;
    }
}
