package ru.msk.homesrv2.miaandme;
     
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInititalizationEvent;
import ru.msk.homesrv2.miaandme.creativetabs.TabMain;
import ru.msk.homesrv2.miaandme.proxy.CommonProxy;

@Mod(modid = MainClass.MODID, name = "Mia and me" version = MainClass.VERSION)
public class Mia
{
    public static final String MODID = "miaandme";
    public static final String VERSION = "0.0.1";
    public static CreativeTabs tabMain = new TabMain("tabMain");

    @SidedProxy( clientSide = "ru.msk.homesrv2.miaandme.proxy.ClientProxy", serverSide = "ru.msk.homesrv2.miaandme.proxy.CommonProxy" )
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInititalizationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting Mia and Me mod preInit]" + "\u001B[0m");
        proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInititalizationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting Mia and Me mod init]" + "\u001B[0m");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInititalizationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting Mia and Me mod postInit]" + "\u001B[0m");
        proxy.postInit(event);
    }
    
}
