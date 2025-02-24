
package net.csstudios.skywars.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.csstudios.skywars.entity.TurboGoatEntity;
import net.csstudios.skywars.client.model.Modelgoat;

public class TurboGoatRenderer extends MobRenderer<TurboGoatEntity, Modelgoat<TurboGoatEntity>> {
	public TurboGoatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgoat(context.bakeLayer(Modelgoat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TurboGoatEntity entity) {
		return new ResourceLocation("cs_skywars:textures/entities/goat.png");
	}
}
