package diobeany.testmod.util.handlers;

import diobeany.testmod.Incl.ItemsInc;
import diobeany.testmod.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event ){
        event.getRegistry().registerAll(ItemsInc.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event ){

        for (Item item: ItemsInc.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }
    }
}
