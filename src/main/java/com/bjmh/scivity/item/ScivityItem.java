package com.bjmh.scivity.item;

import com.bjmh.scivity.Scivity;
import com.bjmh.scivity.gui.ScivityTabs;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ScivityItem extends Item {
    public ScivityItem(String name) {
        setUnlocalizedName(Scivity.MODID + "." + name);
        setRegistryName(Scivity.MODID + ":" + name);
        setCreativeTab(ScivityTabs.ScivityItemsTab);
        ModItems.ITEMS.add(this);
    }
    
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
