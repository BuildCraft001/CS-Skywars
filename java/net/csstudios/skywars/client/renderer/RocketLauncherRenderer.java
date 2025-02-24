package net.csstudios.skywars.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.csstudios.skywars.entity.RocketLauncherEntity;
import net.csstudios.skywars.client.model.Modelskywars_rocketlauncher_projectile_Converted;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RocketLauncherRenderer extends EntityRenderer<RocketLauncherEntity> {
	private static final ResourceLocation texture = new ResourceLocation("cs_skywars:textures/entities/skywars_rocketlauncher_projectile.png");
	private final Modelskywars_rocketlauncher_projectile_Converted model;

	public RocketLauncherRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelskywars_rocketlauncher_projectile_Converted(context.bakeLayer(Modelskywars_rocketlauncher_projectile_Converted.LAYER_LOCATION));
	}

	@Override
	public void render(RocketLauncherEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(RocketLauncherEntity entity) {
		return texture;
	}
}
