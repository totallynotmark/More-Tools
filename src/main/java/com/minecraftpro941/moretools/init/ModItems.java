package com.minecraftpro941.moretools.init;

import java.util.ArrayList;
import java.util.List;

import com.minecraftpro941.moretools.items.ItemBase;
import com.minecraftpro941.moretools.items.tools.ToolPickaxe;
import com.minecraftpro941.moretools.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_DRAGONS_BREATH = EnumHelper.addToolMaterial("material_dragons_breath", 0, 1031, 0.0F, 5.0F, 15); //should have 9atk
	
	//Items
	//N/A
	
	//Tools
	public static final ItemSword DRAGONS_BREATH_SWORD = new ToolSword("dragons_breath_sword", MATERIAL_DRAGONS_BREATH);
}
