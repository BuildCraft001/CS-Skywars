package net.csstudios.skywars.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

public class NoFallDamageAfterDashProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("dashed") == true) {
			entity.fallDistance = 0;
			if (entity.isOnGround()) {
				entity.getPersistentData().putBoolean("dashed", false);
				if (itemstack.getDamageValue() == 3) {
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
			}
		}
	}
}
