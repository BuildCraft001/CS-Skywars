package net.csstudios.skywars.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.csstudios.skywars.init.CsSkywarsModItems;

public class CreatorsGauntletUseProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CsSkywarsModItems.CREATORS_GAUNTLET.get()) {
			entity.setDeltaMovement(new Vec3((2 * Math.cos((entity.getYRot() + 90) * (Math.PI / 180))), ((-1.5) * Math.sin(entity.getXRot() * (Math.PI / 180))), (2 * Math.sin((entity.getYRot() + 90) * (Math.PI / 180)))));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(50, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			entity.getPersistentData().putBoolean("dashed", true);
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
							"title @p actionbar {\"text\":\"The Creators' Gauntlet must be in your offhand for it to unleash its power\",\"bold\":true,\"color\":\"red\"}");
				}
			}
		}
	}
}
