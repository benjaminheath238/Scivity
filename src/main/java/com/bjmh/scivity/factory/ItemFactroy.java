package com.bjmh.scivity.factory;

import com.bjmh.scivity.item.ScivityItem;

import net.minecraft.item.Item;

public class ItemFactroy {
    public static Item[] generate(int num, IItemGenerator generator) {
        Item[] out = new Item[num];

        for (int i = 0; i < num; i++) {
            out[i] = new ScivityItem(generator.name() + "_" + generator.next());
        }

        return out;
    }

    public static Item[][] generate(int num1, int num2, IItemGenerator generator) {
        Item[][] out = new Item[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                out[i][j] = new ScivityItem(generator.name() + "_" + generator.next());
            }
        }

        return out;
    }
}
