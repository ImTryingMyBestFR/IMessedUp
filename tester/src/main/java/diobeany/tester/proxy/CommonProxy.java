package diobeany.tester.proxy;

import diobeany.tester.common.Blocks.BlockBaseWood;
import diobeany.tester.common.Blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;



@Mod.EventBusSubscriber
public class CommonProxy {

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event){
        event.getRegistry().register(new BlockBaseWood("painted_wood_purple_blinds"));
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.PURPLE_BLINDS).setRegistryName(ModBlocks.PURPLE_BLINDS.getRegistryName()));
    }
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {

    }
    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
