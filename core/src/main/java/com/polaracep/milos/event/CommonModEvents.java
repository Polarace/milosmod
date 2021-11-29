package com.polaracep.milos.event;

import com.polaracep.milos.MilosMod;
import com.polaracep.milos.entity.MilosVozicekEntity;
import com.polaracep.milos.init.EntityInit;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MilosMod.MOD_ID, bus = Bus.MOD)
public class CommonModEvents {
	
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityInit.MILOS_VOZICEK.get(), MilosVozicekEntity.createAttributes().build());
	}
}
