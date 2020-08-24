package me.discordgoat.bm.items;

import com.google.gson.*;
import java.io.*;
import org.bukkit.inventory.*;

public final class ItemGenerator {
    private ItemGenerator() {}

    /* Generates an item by reading its corresponding JSON file in the /resources/items directory */
    public static ItemStack generateItem(String name) {
        ItemStackBuilder raw = new Gson().fromJson(new InputStreamReader(ItemGenerator.class.
                getResourceAsStream(File.separator + "items" + File.separator + name + ".json")), ItemStackBuilder.class);
        return raw.build();
    }
}
