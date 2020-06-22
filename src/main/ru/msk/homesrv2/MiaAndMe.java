package ru.msk.homesrv2.miaandme;
     
import ru.msk.homesrv2.mia.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInititalizationEvent;

@Mod(modid = Mia.MODID, version = Mia.VERSION)
public class Mia
{
    public static final String MODID = "mia";
    public static final String VERSION = "0.0.1";

    @SidedProxy( clientSide = "ru.msk.homesrv2.mia.proxy.ClientProxy", serverSide = "ru.msk.homesrv2.mia.proxy.CommonProxy" )
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
