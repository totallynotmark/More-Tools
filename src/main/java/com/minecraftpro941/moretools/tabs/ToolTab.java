package com.minecraftpro941.moretools.tabs;

import com.minecraftpro941.moretools.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ToolTab extends CreativeTabs
{
	public ToolTab(String label)
	{
		super("tooltab");
		this.setBackgroundImageName("tooltab.png");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.DRAGONS_BREATH_SWORD);
	}
	
}
