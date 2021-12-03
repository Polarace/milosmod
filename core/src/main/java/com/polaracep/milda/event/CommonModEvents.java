package com.polaracep.milda.event;

import com.polaracep.milda.MildaMod;
import com.polaracep.milda.entity.MilosEntity;
import com.polaracep.milda.entity.MilosVozicekEntity;
import com.polaracep.milda.init.EntityInit;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MildaMod.MOD_ID, bus = Bus.MOD)
public class CommonModEvents {
	
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityInit.MILOS.get(), MilosEntity.createAttributes().build());
		event.put(EntityInit.MILOS_VOZICEK.get(), MilosVozicekEntity.createAttributes().build());
	}
}
