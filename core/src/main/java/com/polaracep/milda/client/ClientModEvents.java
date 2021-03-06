package com.polaracep.milda.client;

import com.polaracep.milda.MildaMod;
import com.polaracep.milda.client.model.MilosModel;
import com.polaracep.milda.client.model.MilosVozicekModel;
import com.polaracep.milda.client.renderer.MilosVozicekRenderer;
import com.polaracep.milda.client.renderer.MilosRenderer;
import com.polaracep.milda.init.EntityInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MildaMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {
	
	private ClientModEvents() {
		
	}
	
	@SubscribeEvent
	public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(MilosModel.LAYER_LOCATION, MilosModel::createBodyLayer);
		event.registerLayerDefinition(MilosVozicekModel.LAYER_LOCATION, MilosVozicekModel::createBodyLayer);
	}
	
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EntityInit.MILOS.get(), MilosRenderer::new);
		event.registerEntityRenderer(EntityInit.MILOS_VOZICEK.get(), MilosVozicekRenderer::new);
	}
	
}
