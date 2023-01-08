package me.joshh.rankedbedwars.shop.impl;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ShopItem extends ItemStack {

    int amount;
    int cost;


    public ShopItem(Material m, int amount, int cost) {
        ItemStack item = new ItemStack(m, amount);
        this.amount = amount;
        this.cost = cost;
    }


    @Override
    public int getAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }


}
