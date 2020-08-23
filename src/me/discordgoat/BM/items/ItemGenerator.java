package me.discordgoat.BM.items;

import com.google.gson.*;
import java.io.*;
import org.bukkit.inventory.*;

public final class ItemGenerator {
    private ItemGenerator() {}

    public static ItemStack generateItem(String name) {
        Gson gson = new Gson();
        try {
            ItemStackBuilder raw = gson.fromJson(new FileReader("recipes" + File.separator + name + ".json"), ItemStackBuilder.class);
            return raw.build();
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
