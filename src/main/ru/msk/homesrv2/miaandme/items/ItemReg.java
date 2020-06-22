package ru.msk.homesrv2.miaandme.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import ru.msk.homesrv2.miaandme.basic.BasicFood;
import ru.msk.homesrv2.miaandme.basic.BasicItem;
import ru.msk.homesrv2.miaandme.basic.GlassCutter;

public class ItemReg {
    public static Item trubatus = new BasicItem("trubatus",64);
    public static Item miafood = new BasicFood(20, 4F, false, "miafood", Items.BONE);
    public static Item miatool = new GlassCutter("miatool",ToolMaterial.DIAMOND, 20);

    public static void register() {
        setRegister(miafood);
        setRegister(trubatus);
        setRegister(miatool);
    }
    public static void registerRender() {
        setRender(miafood);
        setRender(trubatus);
        setRender(miatool);
    }
    private static void registerItems(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }
    private static void registerItemsRender(Item item) {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
