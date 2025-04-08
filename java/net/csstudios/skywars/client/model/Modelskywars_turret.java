package net.csstudios.skywars.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelskywars_turret<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cs_skywars", "modelskywars_turret"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart turret;

	public Modelskywars_turret(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = root.getChild("head");
		this.turret = this.head.getChild("turret");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, -4.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-7.0F, -2.0F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(40, 16).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(34, 47).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition turret = head.addOrReplaceChild("turret",
				CubeListBuilder.create().texOffs(24, 38).addBox(-8.0F, -15.0F, 9.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-10.0F, -15.0F, 9.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(-11.0F, -15.0F, 9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(42, 48).addBox(-18.0F, -15.0F, 17.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 43)
						.addBox(-22.0F, -15.0F, 15.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 51).addBox(-18.0F, -15.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 53)
						.addBox(-20.0F, -15.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 49).addBox(-11.0F, -15.0F, 4.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 38)
						.addBox(-12.0F, -15.0F, 5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 50).addBox(-12.0F, -15.0F, 9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 51)
						.addBox(-13.0F, -15.0F, 9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 42).addBox(-12.0F, -15.0F, 11.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-13.0F, -15.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(-17.0F, -15.0F, 8.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 50)
						.addBox(-16.0F, -15.0F, 9.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 28).addBox(-17.0F, -15.0F, 10.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 52)
						.addBox(-18.0F, -15.0F, 12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 52).addBox(-19.0F, -15.0F, 13.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 53)
						.addBox(-18.0F, -15.0F, 15.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 50).addBox(-18.0F, -15.0F, 14.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 53)
						.addBox(-14.0F, -15.0F, 8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 47).addBox(-20.0F, -15.0F, 4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-22.0F, -15.0F, 5.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 26).addBox(-21.0F, -15.0F, 7.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-21.0F, -15.0F, 8.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 49).addBox(-8.0F, -15.0F, 5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 33)
						.addBox(-12.0F, -15.0F, 5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, -1.0F, -12.0F, -0.0865F, -0.0114F, -0.1304F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.turret.yRot = netHeadYaw / (180F / (float) Math.PI);
	}
}
