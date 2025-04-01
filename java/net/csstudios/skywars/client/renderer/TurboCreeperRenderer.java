
package net.csstudios.skywars.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.csstudios.skywars.entity.TurboCreeperEntity;

public class TurboCreeperRenderer extends MobRenderer<TurboCreeperEntity, CreeperModel<TurboCreeperEntity>> {
	public TurboCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TurboCreeperEntity entity) {
		return new ResourceLocation("cs_skywars:textures/entities/turbo_creeper.png");
	}
}
