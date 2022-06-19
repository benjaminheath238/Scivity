package com.bjmh.scivity.item;

import com.bjmh.scivity.Scivity;
import com.bjmh.scivity.gui.ScivityTabs;

import net.minecraft.item.Item;

public class ScivityItem extends Item {
    public ScivityItem(String name) {
        setUnlocalizedName(Scivity.MODID + "." + name);
        setRegistryName(Scivity.MODID + ":" + name);
        setCreativeTab(ScivityTabs.ScivityItemsTab);
        ModItems.ITEMS.add(this);
    }
}
