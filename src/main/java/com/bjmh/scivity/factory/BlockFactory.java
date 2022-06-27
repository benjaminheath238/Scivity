package com.bjmh.scivity.factory;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.scivity.block.ScivityBlock;
import com.bjmh.scivity.block.ScivityBlockRotatable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFactory {
    private String baseName;
    private float hardness;
    private float resistance;
    private float light;
    private Material material;
    private boolean rotates;
    private List<Block> blocks;

    public BlockFactory() {}

    public BlockFactory newBlockGroup(String baseName, float hardness, float resistance, float light, Material material, boolean rotates) {
        this.baseName = baseName;
        this.hardness = hardness;
        this.resistance = resistance;
        this.light = light;
        this.material = material;
        this.rotates = rotates;
        this.blocks = new ArrayList<>();
        return this;
    }

    public BlockFactory next(String name, float hardness, float resistance, float light, Material material, boolean rotates) {
        if (rotates) {
            blocks.add(new ScivityBlockRotatable(material, baseName + "_" + name, hardness, resistance, light));
        } else {
            blocks.add(new ScivityBlock(material, baseName + "_" + name, hardness, resistance, light));
        }
        return this;
    }

    public BlockFactory next(String name) {
        return next(name, hardness, resistance, light, material, rotates);
    }

    public BlockFactory next() {
        if (rotates) {
            blocks.add(new ScivityBlockRotatable(material, baseName, hardness, resistance, light));
        } else {
            blocks.add(new ScivityBlock(material, baseName, hardness, resistance, light));
        }
        return this;
    }

    public Block[] build() {
        return blocks.toArray(new Block[0]);
    }
}
