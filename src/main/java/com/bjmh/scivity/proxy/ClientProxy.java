package com.bjmh.scivity.proxy;

import com.bjmh.scivity.block.ModBlocks;
import com.bjmh.scivity.block.ScivityBlock;
import com.bjmh.scivity.item.ModItems;
import com.bjmh.scivity.item.ScivityItem;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (Block block : ModBlocks.BLOCKS) {
            ((ScivityBlock) block).initModel();
        }

        for (Item item : ModItems.ITEMS) {
            ((ScivityItem) item).initModel();
        }
    }
}
