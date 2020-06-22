package ru.msk.homesrv2.miaandme;

import net.minecraftforge.common.MinecraftForge;
import ru.msk.homesrv2.miaandme.event.EventBlock;
import ru.msk.homesrv2.miaandme.event.BreakGlass;

public class RegListEvent {
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new BreakGlass());
		MinecraftForge.EVENT_BUS.register(new EventBlock());
	}
}
