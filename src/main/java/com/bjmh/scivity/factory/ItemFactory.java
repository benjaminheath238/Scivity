package com.bjmh.scivity.factory;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.scivity.item.ScivityItem;

import net.minecraft.item.Item;

public class ItemFactory {
    private String baseName;
    private List<Item> items;

    public ItemFactory() {
    }

    public ItemFactory newItemGroup(String baseName) {
        this.baseName = baseName;
        this.items = new ArrayList<>();
        return this;
    }

    public ItemFactory next(String name) {
        items.add(new ScivityItem(baseName + "_" + name));
        return this;
    }

    public ItemFactory next() {
        items.add(new ScivityItem(baseName));
        return this;
    }

    public Item[] build() {
        return items.toArray(new Item[0]);
    }

    /**
     * Generates groups of items using a user defined generator.
     * 
     * @param num       the number of types
     * @param generator the generator to use
     * @return the generated items
     */
    public static Item[] generate(int num, ItemGenerator generator) {
        Item[] out = new Item[num];

        for (int i = 0; i < num; i++) {
            out[i] = new ScivityItem(generator.name() + "_" + generator.next());
        }

        return out;
    }

    /**
     * Generates groups with sub-groups of items using a user defined generator.
     * 
     * @param num1      the number of main types
     * @param num2      the number of sub types
     * @param generator the generator to use
     * @return the generated items
     */
    public static Item[][] generate(int num1, int num2, ItemGenerator generator) {
        Item[][] out = new Item[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                out[i][j] = new ScivityItem(generator.name() + "_" + generator.next());
            }
        }

        return out;
    }
}
