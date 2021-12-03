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
import net.minecraft.world.entity.Entity;

public class MilosVozicekModel<Type extends Entity> extends EntityModel<Type> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(MildaMod.MOD_ID, "milos_vozicek"), "main");
	
	private final ModelPart chair;
	private final ModelPart leftWheel;
	private final ModelPart rightWheel;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart head;
	
	public MilosVozicekModel(ModelPart root) {
		super();
		this.chair = root.getChild("chair");
		this.leftWheel = root.getChild("leftWheel");
		this.rightWheel = root.getChild("rightWheel");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
		this.head = root.getChild("hlava");
	}

	@SuppressWarnings("unused")
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chair = partdefinition.addOrReplaceChild("chair", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition vozicek = chair.addOrReplaceChild("vozicek", CubeListBuilder.create().texOffs(0, 36).addBox(-6.0F, -12.0F, -9.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -12.0F, -9.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -12.0F, -10.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -12.0F, -10.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -14.0F, -6.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-6.0F, -8.0F, -15.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-6.0F, -9.0F, -17.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -14.0F, -10.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -12.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -13.0F, -12.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -12.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -11.0F, -14.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -11.0F, -14.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -12.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -12.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -13.0F, -12.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -14.0F, -10.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-5.0F, -23.0F, 7.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -23.0F, 7.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -23.0F, 7.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -17.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -17.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -18.0F, -5.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -18.0F, -5.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(5.0F, -24.0F, 7.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-6.0F, -24.0F, 7.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 33).addBox(-6.0F, -11.0F, 1.0F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition trup = chair.addOrReplaceChild("trup", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -27.0F, 0.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = trup.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -13.0F, -7.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r2 = trup.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -13.0F, -7.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition leftSmall = chair.addOrReplaceChild("leftSmall", CubeListBuilder.create().texOffs(0, 60).addBox(6.0F, -1.0F, -11.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -5.0F, -11.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -2.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -4.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -3.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -3.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -4.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -2.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightSmall = chair.addOrReplaceChild("rightSmall", CubeListBuilder.create().texOffs(0, 60).addBox(6.0F, -1.0F, -11.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -5.0F, -11.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -2.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -4.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -3.0F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -3.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -4.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(6.0F, -2.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-13.0F, 0.0F, 0.0F));

		PartDefinition leftWheel = partdefinition.addOrReplaceChild("leftWheel", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, 7.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 6.0F, -5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 6.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -7.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -7.0F, -5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 5.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 5.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 4.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 4.0F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -5.0F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -5.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -6.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -6.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 2.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -4.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -4.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 2.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -3.0F, -8.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -3.0F, 7.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 46).addBox(-1.0F, -7.0F, 1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 46).addBox(-1.0F, -7.0F, -2.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-1.0F, -2.0F, -7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-1.0F, 1.0F, -7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-1.0F, 1.0F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 16.0F, 2.0F));

		PartDefinition rightWheel = partdefinition.addOrReplaceChild("rightWheel", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, 7.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 6.0F, -5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 6.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -7.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -7.0F, -5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 5.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 5.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 4.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 4.0F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -5.0F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -5.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -6.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -6.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 2.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -4.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -4.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, 2.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -3.0F, -8.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(-1.0F, -3.0F, 7.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 46).addBox(-1.0F, -7.0F, 1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 46).addBox(-1.0F, -7.0F, -2.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 46).addBox(-1.0F, -2.0F, -7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 46).addBox(-1.0F, 1.0F, -7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 46).addBox(-1.0F, 1.0F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 46).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(57, 52).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 16.0F, 2.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-8.0F, -27.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(40, 16).addBox(4.0F, -27.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hlava = partdefinition.addOrReplaceChild("hlava", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -35.0F, -2.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
				.addBox(-2.0F, -30.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Type pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw,
			float pHeadPitch) {
	      this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.chair.render(poseStack, buffer, packedLight, packedOverlay);
		this.leftWheel.render(poseStack, buffer, packedLight, packedOverlay);
		this.rightWheel.render(poseStack, buffer, packedLight, packedOverlay);
		this.leftArm.render(poseStack, buffer, packedLight, packedOverlay);
		this.rightArm.render(poseStack, buffer, packedLight, packedOverlay);
		this.head.render(poseStack, buffer, packedLight, packedOverlay);

	}
	
}

