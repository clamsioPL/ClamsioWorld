package clamsiopl.clamsioworld.proxy;

import clamsiopl.clamsioworld.init.items.ClamsioWorld_Items;

public class ItemAndBlockReg
{
	public static void Client()
	{
		ClamsioWorld_Items.register();
	}
	
	public static void Common()
	{
		ClamsioWorld_Items.init();
	}
}