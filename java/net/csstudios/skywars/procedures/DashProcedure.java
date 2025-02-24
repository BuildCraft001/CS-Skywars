package net.csstudios.skywars.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

public class DashProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getDamageValue() < 3) {
			entity.setDeltaMovement(new Vec3((2 * Math.cos((entity.getYRot() + 90) * (Math.PI / 180))), ((-1.5) * Math.sin(entity.getXRot() * (Math.PI / 180))), (2 * Math.sin((entity.getYRot() + 90) * (Math.PI / 180)))));
			entity.getPersistentData().putBoolean("dashed", true);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
		}
	}
}
