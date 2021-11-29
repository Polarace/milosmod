package com.polaracep.milos.client.renderer;

import com.polaracep.milos.MilosMod;
import com.polaracep.milos.entity.MilosVozicekEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MilosVozicekRenderer <Type extends MilosVozicekEntity> extends MobRenderer<Type, MilosVozicekModel<Type>> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(MilosMod.MOD_ID, "textures/entities/milos_vozicek.png");
	
	public MilosVozicekRenderer(Context context) {
		super(context, new MilosVozicekModel<>(), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type pEntity) {
		return TEXTURE;
	}

}
