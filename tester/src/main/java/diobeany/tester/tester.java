package diobeany.tester;

import diobeany.tester.proxy.CommonProxy;
import diobeany.tester.common.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid= Reference.MODID,name=Reference.MODNAME,version=Reference.VERSION,useMetadata = true)
public class tester {
    @SidedProxy(clientSide = "diobeany.tester.proxy.ClientProxy", serverSide = "diobeany.tester.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static tester instance;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        proxy.postInit(e);
    }
}
