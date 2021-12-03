package com.polaracep.milda.init;

import com.polaracep.milda.MildaMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MildaMod.MOD_ID);
	
	public static final RegistryObject<Item> STOVKA_ITEM = ITEMS.register("stokoruna", 
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<Item> CIGO_ITEM = ITEMS.register("cigareta", 
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	public static final RegistryObject<ForgeSpawnEggItem> MILOS_SPAWN_EGG = ITEMS.register("milos_spawn_egg", 
			() -> new ForgeSpawnEggItem(EntityInit.MILOS, 0xd9a577, 0xf0c6a1, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
	
	public static final RegistryObject<ForgeSpawnEggItem> MILOS_VOZICEK_SPAWN_EGG = ITEMS.register("milos_vozicek_spawn_egg", 
			() -> new ForgeSpawnEggItem(EntityInit.MILOS_VOZICEK, 0xd9a477, 0xf6c6a1, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));

	
	public static void register(IEventBus eventBus) {
	    ITEMS.register(eventBus);
	}
	
}

