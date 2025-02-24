package net.csstudios.skywars.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.csstudios.skywars.init.CsSkywarsModMobEffects;

public class Boohoo2DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CsSkywarsModMobEffects.BOOHOO_2_EFFECT.get())) {
			return true;
		}
		return false;
	}
}
