package com.bjmh.scivity.block;

import com.bjmh.scivity.Scivity;
import com.bjmh.scivity.gui.ScivityTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ScivityBlock extends Block {

    public ScivityBlock(Material materialIn, String name, float hardness, float resistance, float light) {
        super(materialIn);
        setUnlocalizedName(Scivity.MODID + "." + name);
        setRegistryName(Scivity.MODID + ":" + name);
        setCreativeTab(ScivityTabs.ScivityConstructionTab);
        setHardness(hardness);
        setResistance(resistance);
        setLightLevel(light);
        ModBlocks.BLOCKS.add(this);
    }

    public ScivityBlock(Material materialIn, String name) {
        this(materialIn, name, 1.5F, 10F, 0F);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
