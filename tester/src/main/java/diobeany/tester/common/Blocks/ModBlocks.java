package diobeany.tester.common.Blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("tester:painted_wood_purple_blinds")
    public static BlockBaseWood PURPLE_BLINDS=new BlockBaseWood("painted_wood_purple_blinds");

    @SideOnly(Side.CLIENT)
    public static void initModels(){

        PURPLE_BLINDS.initModel();
    }
}
