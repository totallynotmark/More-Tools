package com.minecraftpro941.moretools.init;

import com.minecraftpro941.moretools.enchantment.EnchantmentThunder;
import com.minecraftpro941.moretools.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class ModEnchantments
{
	
	public static final EnumEnchantmentType WEAPONS = EnumHelper.addEnchantmentType("weapons", (item)->(item instanceof ItemSword || item instanceof ItemBow));
	
	public static final Enchantment THUNDER = new EnchantmentThunder();
	
	@SubscribeEvent 
	public static void registerEnchantments(Register<Enchantment> event)
	{ 
		event.getRegistry().registerAll(THUNDER);
	}
}
