package com.polaracep.milda.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

import com.polaracep.milda.MildaMod;
import com.polaracep.milda.client.model.MilosModel;
import com.polaracep.milda.entity.MilosEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MilosRenderer <Type extends MilosEntity> extends MobRenderer<Type, MilosModel<Type>> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(MildaMod.MOD_ID, "textures/entity/milos.png");
	
	public MilosRenderer(Context context) {
		super(context, new MilosModel<>(context.bakeLayer(MilosModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type pEntity) {
		return TEXTURE;
	}

}
