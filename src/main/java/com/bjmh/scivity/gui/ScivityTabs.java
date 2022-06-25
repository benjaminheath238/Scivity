package com.bjmh.scivity.gui;

import com.bjmh.scivity.block.ModBlocks;
import com.bjmh.scivity.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ScivityTabs {

    private ScivityTabs() {
    }

    public static final CreativeTabs ScivityConstructionTab = new CreativeTabs("scivity_construction_tab") {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.STRIPES_PANEL_BLACK_YELLOW);
        }
    };

    public static final CreativeTabs ScivityItemsTab = new CreativeTabs("scivity_items_tab") {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.CIRCUITS[0][0]);
        }
    };

}