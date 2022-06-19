package com.bjmh.scivity.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block CEMENT = new ScivityBlock(Material.IRON, "cement");
    public static final Block ASPHALT = new ScivityBlock(Material.IRON, "asphalt");

    public static final Block STRIPES_PANEL_BLACK_WHITE = new ScivityBlock(Material.IRON, "stripes_panel_black_white", 2.5F, 10F, 0F);
    public static final Block STRIPES_PANEL_BLACK_YELLOW = new ScivityBlock(Material.IRON, "stripes_panel_black_yellow", 2.5F, 10F, 0F);
    public static final Block STRIPES_PANEL_RED_WHITE = new ScivityBlock(Material.IRON, "stripes_panel_red_white", 2.5F, 10F, 0F);
    
    public static final Block STRIPES_SMOOTH_BLACK_WHITE = new ScivityBlock(Material.IRON, "stripes_smooth_black_white", 2.5F, 10F, 0F);
    public static final Block STRIPES_SMOOTH_BLACK_YELLOW = new ScivityBlock(Material.IRON, "stripes_smooth_black_yellow", 2.5F, 10F, 0F);
    public static final Block STRIPES_SMOOTH_RED_WHITE = new ScivityBlock(Material.IRON, "stripes_smooth_red_white", 2.5F, 10F, 0F);
    
    public static final Block CONCRETE_DARK_FACTORY_PANEL_CLEAN_TOP = new ScivityBlock(Material.IRON, "concrete_dark_factory_panel_clean_top", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_FACTORY_PANEL_RUSTY_TOP = new ScivityBlock(Material.IRON, "concrete_dark_factory_panel_rusty_top", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_FACTORY_PANEL_SHINY_TOP = new ScivityBlock(Material.IRON, "concrete_dark_factory_panel_shiny_top", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_LABORATORY_PANEL_CLEAN_TOP = new ScivityBlock(Material.IRON, "concrete_dark_laboratory_panel_clean_top", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_LABORATORY_PANEL_SHINY_TOP = new ScivityBlock(Material.IRON, "concrete_dark_laboratory_panel_shiny_top", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_LAMP = new ScivityBlockRotatable(Material.IRON, "concrete_dark_lamp", 5F, 50F, 1F);
    public static final Block CONCRETE_DARK = new ScivityBlock(Material.IRON, "concrete_dark", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_REBAR = new ScivityBlockRotatable(Material.IRON, "concrete_dark_rebar", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "concrete_dark_stripes_black_white", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "concrete_dark_stripes_black_yellow", 5F, 50F, 0F);
    public static final Block CONCRETE_DARK_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "concrete_dark_stripes_red_white", 5F, 50F, 0F);
    
    public static final Block CONCRETE_LIGHT_FACTORY_PANEL_CLEAN_TOP = new ScivityBlock(Material.IRON, "concrete_light_factory_panel_clean_top", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_FACTORY_PANEL_RUSTY_TOP = new ScivityBlock(Material.IRON, "concrete_light_factory_panel_rusty_top", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_FACTORY_PANEL_SHINY_TOP = new ScivityBlock(Material.IRON, "concrete_light_factory_panel_shiny_top", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_LABORATORY_PANEL_CLEAN_TOP = new ScivityBlock(Material.IRON, "concrete_light_laboratory_panel_clean_top", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_LABORATORY_PANEL_SHINY_TOP = new ScivityBlock(Material.IRON, "concrete_light_laboratory_panel_shiny_top", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_LAMP = new ScivityBlockRotatable(Material.IRON, "concrete_light_lamp", 5F, 50F, 1F);
    public static final Block CONCRETE_LIGHT = new ScivityBlock(Material.IRON, "concrete_light", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_REBAR = new ScivityBlockRotatable(Material.IRON, "concrete_light_rebar", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "concrete_light_stripes_black_white", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "concrete_light_stripes_black_yellow", 5F, 50F, 0F);
    public static final Block CONCRETE_LIGHT_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "concrete_light_stripes_red_white", 5F, 50F, 0F);
    
    public static final Block CONCRETE_WHITE_FACTORY_PANEL_CLEAN_TOP = new ScivityBlock(Material.IRON, "concrete_white_factory_panel_clean_top", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_FACTORY_PANEL_RUSTY_TOP = new ScivityBlock(Material.IRON, "concrete_white_factory_panel_rusty_top", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_FACTORY_PANEL_SHINY_TOP = new ScivityBlock(Material.IRON, "concrete_white_factory_panel_shiny_top", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_LABORATORY_PANEL_CLEAN_TOP = new ScivityBlock(Material.IRON, "concrete_white_laboratory_panel_clean_top", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_LABORATORY_PANEL_SHINY_TOP = new ScivityBlock(Material.IRON, "concrete_white_laboratory_panel_shiny_top", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_LAMP = new ScivityBlockRotatable(Material.IRON, "concrete_white_lamp", 5F, 50F, 1F);
    public static final Block CONCRETE_WHITE = new ScivityBlock(Material.IRON, "concrete_white", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_REBAR = new ScivityBlockRotatable(Material.IRON, "concrete_white_rebar", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "concrete_white_stripes_black_white", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "concrete_white_stripes_black_yellow", 5F, 50F, 0F);
    public static final Block CONCRETE_WHITE_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "concrete_white_stripes_red_white", 5F, 50F, 0F);
    
    public static final Block FACTORY_PANEL_CLEAN_LAMP = new ScivityBlockRotatable(Material.IRON, "factory_panel_clean_lamp", 2.5F, 30F, 1F);
    public static final Block FACTORY_PANEL_CLEAN = new ScivityBlock(Material.IRON, "factory_panel_clean", 2.5F, 30F, 0F);
    public static final Block FACTORY_PANEL_CLEAN_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "factory_panel_clean_stripes_black_white", 2.5F, 30F, 0F);
    public static final Block FACTORY_PANEL_CLEAN_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "factory_panel_clean_stripes_black_yellow", 2.5F, 30F, 0F);
    public static final Block FACTORY_PANEL_CLEAN_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "factory_panel_clean_stripes_red_white", 2.5F, 30F, 0F);
    public static final Block FACTORY_PLATES_CLEAN = new ScivityBlock(Material.IRON, "factory_plates_clean", 2.5F, 30F, 0F);
    
    public static final Block FACTORY_PANEL_RUSTY_LAMP = new ScivityBlockRotatable(Material.IRON, "factory_panel_rusty_lamp", 2.5F, 20F, 1F);
    public static final Block FACTORY_PANEL_RUSTY = new ScivityBlock(Material.IRON, "factory_panel_rusty", 2.5F, 20F, 0F);
    public static final Block FACTORY_PANEL_RUSTY_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "factory_panel_rusty_stripes_black_white", 2.5F, 20F, 0F);
    public static final Block FACTORY_PANEL_RUSTY_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "factory_panel_rusty_stripes_black_yellow", 2.5F, 20F, 0F);
    public static final Block FACTORY_PANEL_RUSTY_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "factory_panel_rusty_stripes_red_white", 2.5F, 20F, 0F);
    public static final Block FACTORY_PLATES_RUSTY = new ScivityBlock(Material.IRON, "factory_plates_rusty", 2.5F, 20F, 0F);
    
    public static final Block FACTORY_PANEL_SHINY_LAMP = new ScivityBlockRotatable(Material.IRON, "factory_panel_shiny_lamp", 2.5F, 30F, 1F);
    public static final Block FACTORY_PANEL_SHINY = new ScivityBlock(Material.IRON, "factory_panel_shiny", 2.5F, 30F, 0F);
    public static final Block FACTORY_PANEL_SHINY_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "factory_panel_shiny_stripes_black_white", 2.5F, 30F, 0F);
    public static final Block FACTORY_PANEL_SHINY_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "factory_panel_shiny_stripes_black_yellow", 2.5F, 30F, 0F);
    public static final Block FACTORY_PANEL_SHINY_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "factory_panel_shiny_stripes_red_white", 2.5F, 30F, 0F);
    public static final Block FACTORY_PLATES_SHINY = new ScivityBlock(Material.IRON, "factory_plates_shiny", 2.5F, 30F, 0F);
    
    public static final Block LABORATORY_PANEL_CLEAN_LAMP = new ScivityBlockRotatable(Material.IRON, "laboratory_panel_clean_lamp", 2.5F, 30F, 1F);
    public static final Block LABORATORY_PANEL_CLEAN = new ScivityBlock(Material.IRON, "laboratory_panel_clean", 2.5F, 30F, 0F);
    public static final Block LABORATORY_PANEL_CLEAN_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "laboratory_panel_clean_stripes_black_white", 2.5F, 30F, 0F);
    public static final Block LABORATORY_PANEL_CLEAN_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "laboratory_panel_clean_stripes_black_yellow", 2.5F, 30F, 0F);
    public static final Block LABORATORY_PANEL_CLEAN_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "laboratory_panel_clean_stripes_red_white", 2.5F, 30F, 0F);
    
    public static final Block LABORATORY_PANEL_SHINY_LAMP = new ScivityBlockRotatable(Material.IRON, "laboratory_panel_shiny_lamp", 2.5F, 30F, 1F);
    public static final Block LABORATORY_PANEL_SHINY = new ScivityBlock(Material.IRON, "laboratory_panel_shiny", 2.5F, 30F, 0F);
    public static final Block LABORATORY_PANEL_SHINY_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "laboratory_panel_shiny_stripes_black_white", 2.5F, 30F, 0F);
    public static final Block LABORATORY_PANEL_SHINY_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "laboratory_panel_shiny_stripes_black_yellow", 2.5F, 30F, 0F);
    public static final Block LABORATORY_PANEL_SHINY_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "laboratory_panel_shiny_stripes_red_white", 2.5F, 30F, 0F);

    public static final Block LABORATORY_PANEL_OVERGROWN_LAMP = new ScivityBlockRotatable(Material.IRON, "laboratory_panel_overgrown_lamp", 2.5F, 20F, 0F);
    public static final Block LABORATORY_PANEL_OVERGROWN = new ScivityBlock(Material.IRON, "laboratory_panel_overgrown", 2.5F, 20F, 0F);
    public static final Block LABORATORY_PANEL_OVERGROWN_STRIPES_BLACK_WHITE = new ScivityBlock(Material.IRON, "laboratory_panel_overgrown_stripes_black_white", 2.5F, 20F, 0F);
    public static final Block LABORATORY_PANEL_OVERGROWN_STRIPES_BLACK_YELLOW = new ScivityBlock(Material.IRON, "laboratory_panel_overgrown_stripes_black_yellow", 2.5F, 20F, 0F);
    public static final Block LABORATORY_PANEL_OVERGROWN_STRIPES_RED_WHITE = new ScivityBlock(Material.IRON, "laboratory_panel_overgrown_stripes_red_white", 2.5F, 20F, 0F);


    private ModBlocks() {
    }

}
