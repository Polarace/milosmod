package com.polaracep.milda.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.polaracep.milda.MildaMod;

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
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class MilosModel<Type extends Entity> extends EntityModel<Type> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(MildaMod.MOD_ID, "milos"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	
	public MilosModel(ModelPart root) {
		super();
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leftLeg= root.getChild("LegL");
		this.rightLeg = root.getChild("LegR");
	}

	@SuppressWarnings("unused")
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), 
				PartPose.offset(0.0F, 24.0F, 0.0F));
		
		//PartDefinition rightLeg = partdefinition.addOrReplaceChild("LegR", CubeListBuilder.create().texOffs(16, 48)
		//		.addBox(-4.0F, 12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
		//		PartPose.offset(0.0F, 0.0F, 0.0F));
		
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("LegR", CubeListBuilder.create().texOffs(16, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		//PartDefinition leftLeg = partdefinition.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(0, 16)
		//		.addBox(-4.0F, 12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
		//		PartPose.offset(4.0F, 0.0F, 0.0F));
		
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 
				new CubeDeformation(0.0F)), 
				PartPose.offset(2.0F, 12.0F, 0.0F));

		body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(0.0F, -12.0F, 0.0F));

		body.addOrReplaceChild("ArmL", CubeListBuilder.create().texOffs(32, 48)
				.addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(8.0F, -12.0F, 0.0F));

		body.addOrReplaceChild("ArmR", CubeListBuilder.create().texOffs(32, 48)
				.addBox(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(-4.0F, -12.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
				.addBox(-2.0F, -0.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Type Entity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
	      this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
	      
	      this.rightLeg.xRot = Mth.cos(pLimbSwing * 0.6662F) * 1.4F * pLimbSwingAmount;
	      this.leftLeg.xRot = Mth.cos(pLimbSwing * 0.6662F + (float)Math.PI) * 1.4F * pLimbSwingAmount;

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.body.render(poseStack, buffer, packedLight, packedOverlay);
		this.head.render(poseStack, buffer, packedLight, packedOverlay);
		this.leftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		this.rightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		
	}
	
	
}