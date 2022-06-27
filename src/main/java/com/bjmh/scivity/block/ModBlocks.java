package com.bjmh.scivity.block;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.scivity.factory.BlockFactory;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public enum ModBlocks {
    CONCRETE_DARK() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("concrete_dark", 5F, 50F, 0F, Material.ROCK, false)
                    .next()
                    .next("factory_clean_top")
                    .next("factory_dark_top")
                    .next("factory_rusty_top")
                    .next("factory_shiny_top")
                    .next("laboratory_clean_top")
                    .next("laboratory_shiny_top")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 50F, 1F, Material.ROCK, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    CONCRETE_LIGHT() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("concrete_light", 5F, 50F, 0F, Material.ROCK, false)
                    .next()
                    .next("factory_clean_top")
                    .next("factory_dark_top")
                    .next("factory_rusty_top")
                    .next("factory_shiny_top")
                    .next("laboratory_clean_top")
                    .next("laboratory_shiny_top")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 50F, 1F, Material.ROCK, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    CONCRETE_WHITE() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("concrete_white", 5F, 50F, 0F, Material.ROCK, false)
                    .next()
                    .next("factory_clean_top")
                    .next("factory_dark_top")
                    .next("factory_rusty_top")
                    .next("factory_shiny_top")
                    .next("laboratory_clean_top")
                    .next("laboratory_shiny_top")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 50F, 1F, Material.IRON, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    FACTORY_CLEAN() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("factory_clean", 5F, 25F, 0F, Material.IRON, false)
                    .next()
                    .next("panel")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 25F, 1F, Material.IRON, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    FACTORY_DARK() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("factory_dark", 5F, 30F, 0F, Material.IRON, false)
                    .next()
                    .next("panel")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 30F, 1F, Material.IRON, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    FACTORY_RUSTY() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("factory_rusty", 5F, 10F, 0F, Material.IRON, false)
                    .next()
                    .next("panel")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 10F, 1F, Material.IRON, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    FACTORY_SHINY() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("factory_shiny", 5F, 25F, 0F, Material.IRON, false)
                    .next()
                    .next("panel")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 25F, 1F, Material.IRON, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    LABORATORY_CLEAN() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("laboratory_clean", 5F, 15F, 0F, Material.IRON, false)
                    .next()
                    .next("panel")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 15F, 1F, Material.IRON, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    LABORATORY_SHINY() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("laboratory_shiny", 5F, 15F, 0F, Material.IRON, false)
                    .next()
                    .next("panel")
                    .next("stripes_black_white_bottom")
                    .next("stripes_black_yellow_bottom")
                    .next("stripes_red_white_bottom")
                    .next("lamp", 5F, 15F, 1F, Material.IRON, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    },

    STRIPES() {
        private Block[] blocks;

        @Override
        public void load(BlockFactory factory) {
            blocks = factory.newBlockGroup("stripes", 5F, 25F, 0F, Material.IRON, false)
                    .next("black_white")
                    .next("black_white_panel")
                    .next("black_yellow")
                    .next("black_yellow_panel")
                    .next("red_white")
                    .next("red_white_panel")
                    .next("black_white_lamp", 5F, 25F, 1F, Material.IRON, true)
                    .next("black_yellow_lamp", 5F, 25F, 1F, Material.IRON, true)
                    .next("red_white_lamp", 5F, 25F, 1F, Material.IRON, true)
                    .build();
        }

        @Override
        public Block get(int index) {
            return blocks[index];
        }
    };

    public static final List<Block> BLOCKS = new ArrayList<>();

    public void load(BlockFactory factory) {
    }

    public Block get(int index) {
        return null;
    }

    public static void init() {
        BlockFactory factory = new BlockFactory();
        for (ModBlocks block : values()) {
            block.load(factory);
        }
    }

}
