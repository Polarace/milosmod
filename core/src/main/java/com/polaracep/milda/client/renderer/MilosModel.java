package com.polaracep.milda.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.polaracep.milda.MildaMod;
import com.polaracep.milda.entity.MilosEntity;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

public class MilosModel extends EntityModel<MilosEntity> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(MildaMod.MOD_ID, "milos"), "main");
	private final ModelPart body;
	

	public MilosModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), 
				PartPose.offset(0.0F, 24.0F, 0.0F));

		body.addOrReplaceChild("LegR", CubeListBuilder.create().texOffs(16, 48)
				.addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(0.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(4.0F, 0.0F, 0.0F));

		body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(0.0F, -12.0F, 0.0F));

		body.addOrReplaceChild("ArmL", CubeListBuilder.create().texOffs(32, 48)
				.addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(8.0F, -12.0F, 0.0F));

		body.addOrReplaceChild("ArmLR", CubeListBuilder.create().texOffs(32, 48)
				.addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(-4.0F, -12.0F, 0.0F));

		body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
				.addBox(-2.0F, -24.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.body.render(poseStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setupAnim(MilosEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks,
			float pNetHeadYaw, float pHeadPitch) {
		// TODO Auto-generated method stub
		
	}
}