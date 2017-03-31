package clamsiopl.clamsioworld.proxy;

import clamsiopl.clamsioworld.init.items.ClamsioWorld_Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		//ClamsioWorld_Blocks.init();
		//ClamsioWorld_Food.init();
		//ClamsioWorld_Items.init();
	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		ItemAndBlockReg.Client();
		/*
		ClamsioWorld_Blocks.registerRenders();
		ClamsioWorld_Food.registerRenders();
		ClamsioWorld_Items.registerRenders();
		ClamsioWorld_Recipes.addRecipes();
		*/
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}
}