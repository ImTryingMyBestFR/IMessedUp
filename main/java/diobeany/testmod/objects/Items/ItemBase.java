package diobeany.testmod.objects.Items;

import diobeany.testmod.Main;
import diobeany.testmod.Incl.ItemsInc;
import diobeany.testmod.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemsInc.ITEMS.add(this);
    }

    @Override
    public void registerModels(){

        Main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
