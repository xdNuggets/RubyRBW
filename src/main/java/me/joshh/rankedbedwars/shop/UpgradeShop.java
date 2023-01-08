package me.joshh.rankedbedwars.shop;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public abstract class UpgradeShop {


    String name;
    HashMap<ItemStack, Integer> upgrades;


    public UpgradeShop(Player player) {
        Inventory gui = Bukkit.createInventory(player, 36, "Diamond Upgrades");
        upgrades = new HashMap<>();


    }




}
