package com.bjmh.scivity.item;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.scivity.factory.IItemGenerator;
import com.bjmh.scivity.factory.ItemFactory;

import net.minecraft.item.Item;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item[][] CIRCUITS = ItemFactory.generate(5, 4, new IItemGenerator() {

        private int num2 = 0;
        private int num1 = 0;

        @Override
        public String name() {
            return "circuit";
        }

        @Override
        public String next() {
            String type = "";
            String level = "";

            if (num2 > 3) {
                num2 = 0;
                num1++;
            }

            switch (num1) {
                case 0:
                    level = "basic";
                    break;
                case 1:
                    level = "advanced";
                    break;
                case 2:
                    level = "elite";
                    break;
                case 3:
                    level = "ultimate";
                    break;
                case 4:
                    level = "board";
                    break;
                default:
                    break;
            }

            switch (num2++) {
                case 0:
                    type = "green";
                    break;
                case 1:
                    type = "red";
                    break;
                case 2:
                    type = "blue";
                    break;
                case 3:
                    type = "purple";
                    break;
                default:
                    break;
            }

            return level + "_" + type;
        }

    });

    private ModItems() {
    }
}
