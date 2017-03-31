package clamsiopl.clamsioworld.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MaterialItems extends Item
{
	public MaterialItems(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS); //setCreativeTab(ClamsioWorld_CreativeTabs.null);
	}
}