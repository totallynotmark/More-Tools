package com.minecraftpro941.moretools.items.tools;

import com.minecraftpro941.moretools.Main;
import com.minecraftpro941.moretools.init.ModItems;
import com.minecraftpro941.moretools.util.IHasModels;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModels {

	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
