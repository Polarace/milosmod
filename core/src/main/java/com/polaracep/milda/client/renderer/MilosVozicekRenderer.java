package com.polaracep.milda.client.renderer;

import com.polaracep.milda.MildaMod;
import com.polaracep.milda.client.model.MilosVozicekModel;
import com.polaracep.milda.entity.MilosVozicekEntity;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;

public class MilosVozicekRenderer <Type extends MilosVozicekEntity> extends MobRenderer<Type, MilosVozicekModel<Type>> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(MildaMod.MOD_ID, "textures/entity/milos_vozicek.png");
	
	public MilosVozicekRenderer(Context context) {
		super(context, new MilosVozicekModel<>(context.bakeLayer(MilosVozicekModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type pEntity) {
		return TEXTURE;
	}

}

