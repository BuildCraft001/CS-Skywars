
package net.csstudios.skywars.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.csstudios.skywars.entity.TurretEntity;
import net.csstudios.skywars.client.model.Modelskywars_turret;

public class TurretRenderer extends MobRenderer<TurretEntity, Modelskywars_turret<TurretEntity>> {
	public TurretRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelskywars_turret(context.bakeLayer(Modelskywars_turret.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TurretEntity entity) {
		return new ResourceLocation("cs_skywars:textures/entities/turret.png");
	}
}
