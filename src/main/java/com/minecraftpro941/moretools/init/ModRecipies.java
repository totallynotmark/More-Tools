package com.minecraftpro941.moretools.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipies
{
	
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.SAPPHIRE_IRON_BLEND, new ItemStack(ModItems.SAPPHIRE_INFUSED_INGOT, 1), 1.5F);
	}
	
}
