package com.bjmh.scivity.item;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.scivity.factory.ItemFactory;

import net.minecraft.item.Item;

public enum ModItems {
    PLATES() {
        private Item[] items;

        @Override
        public void load(ItemFactory factory) {
            items = factory.newItemGroup("plate")
                    .next("factory_clean")
                    .next("factory_dark")
                    .next("factory_rusty")
                    .next("factory_shiny")
                    .next("laboratory_clean")
                    .next("laboratory_shiny")
                    .next("stripes_black_white")
                    .next("stripes_black_yellow")
                    .next("stripes_red_white")
                    .build();
        }

        @Override
        public Item get(int index) {
            return items[index];
        }
    },
    
    OTHER() {
        private Item[] items;

        @Override
        public void load(ItemFactory factory) {
            items = factory.newItemGroup("cement_sack")
                    .next("25")
                    .next("50")
                    .build();
        }

        @Override
        public Item get(int index) {
            return items[index];
        }
    };

    public static final List<Item> ITEMS = new ArrayList<>();

    public void load(ItemFactory factory) {
    }

    public Item get(int index) {
        return null;
    }

    public static void init() {
        ItemFactory factory = new ItemFactory();
        for (ModItems item : values()) {
            item.load(factory);
        }
    }
}
