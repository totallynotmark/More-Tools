package com.minecraftpro941.moretools.init;

import java.util.ArrayList;
import java.util.List;

import com.minecraftpro941.moretools.items.ItemBase;
import com.minecraftpro941.moretools.items.tools.ToolAxe;
import com.minecraftpro941.moretools.items.tools.ToolHoe;
import com.minecraftpro941.moretools.items.tools.ToolPickaxe;
import com.minecraftpro941.moretools.items.tools.ToolSpade;
import com.minecraftpro941.moretools.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Materials
	public static final ToolMaterial MATERIAL_DRAGONS_BREATH = EnumHelper.addToolMaterial("material_dragons_breath", 2, 1031, 2.0F, 5.0F, 15);
	public static final ToolMaterial MATERIAL_STRUCTURE_VOID = EnumHelper.addToolMaterial("material_structure_void", 3, -1, 32.0F, 38.0F, 22);
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire", 0, 0, 0.0F, 0.0F, 0); //TODO: add values

	//Items
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item IRON_ROD = new ItemBase("iron_rod");

	//Tools

	//Dragon's Breath
	public static final ItemSword DRAGONS_BREATH_SWORD = new ToolSword("dragons_breath_sword", MATERIAL_DRAGONS_BREATH);

	//Structure Void
	public static final ItemSword STRUCTURE_VOID_SWORD = new ToolSword("structure_void_sword", MATERIAL_STRUCTURE_VOID);
	public static final ItemPickaxe STRUCTURE_VOID_PICKAXE = new ToolPickaxe("structure_void_pickaxe", MATERIAL_STRUCTURE_VOID);
	public static final ItemSpade STRUCTURE_VOID_SPADE = new ToolSpade("structure_void_spade", MATERIAL_STRUCTURE_VOID);
	public static final ItemAxe STRUCTURE_VOID_AXE = new ToolAxe("structure_void_axe", MATERIAL_STRUCTURE_VOID);
	public static final ItemHoe STRUCTURE_VOID_HOE = new ToolHoe("structure_void_hoe", MATERIAL_STRUCTURE_VOID);

	//Sapphire
	/*
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("structure_void_sword", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("structure_void_pickaxe", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SPADE = new ToolSpade("structure_void_spade", MATERIAL_SAPPHIRE);
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("structure_void_axe", MATERIAL_SAPPHIRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("structure_void_hoe", MATERIAL_SAPPHIRE);
	*/




}
