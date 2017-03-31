package clamsiopl.clamsioworld.init.items;

import clamsiopl.clamsioworld.main.ClamsioWorld;
import clamsiopl.clamsioworld.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClamsioWorld_Items
{
	//Materials
	public static Item AMETHYST;
	public static Item BRONZE_INGOT;
	public static Item CITRINE_QUARTZ;
	public static Item COPPER_INGOT;
	public static Item SALT;
	public static Item SAPPHIRE;
	public static Item SILVER_INGOT;
	public static Item TOPAZ;
	
	public static void init()
	{
		//Materials
		AMETHYST = new MaterialItems("amethyst");
		BRONZE_INGOT = new MaterialItems("bronze_ingot");
		CITRINE_QUARTZ = new MaterialItems("citrine_quartz");
		COPPER_INGOT = new MaterialItems("copper_ingot");
		SALT = new MaterialItems("salt");
		SAPPHIRE = new MaterialItems("sapphire");
		SILVER_INGOT = new MaterialItems("silver_ingot");
		TOPAZ = new MaterialItems("topaz");
	}
	
	public static void register()
	{
		//Materials
		registerItem(AMETHYST);
		registerItem(BRONZE_INGOT);
		registerItem(CITRINE_QUARTZ);
		registerItem(COPPER_INGOT);
		registerItem(SALT);
		registerItem(SILVER_INGOT);
		registerItem(TOPAZ);
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getRegistryName(), "inventory"));
	}
}