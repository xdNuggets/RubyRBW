package me.joshh.rankedbedwars.shop;

import me.joshh.rankedbedwars.shop.impl.ShopItem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemShop{


    public ItemShop(Player p, int amount, String name) {
        Inventory gui = Bukkit.createInventory(p, amount, ChatColor.translateAlternateColorCodes('&',name));


        ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);

        ItemMeta emptyMeta = empty.getItemMeta();
        emptyMeta.setDisplayName(" ");
        emptyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        empty.setItemMeta(emptyMeta);

        ItemStack wool = new ShopItem(Material.WOOL, 16, 4);


    }


    
}
