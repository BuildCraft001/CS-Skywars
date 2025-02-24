package net.csstudios.skywars.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class RndEffectActivatedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double effect = 0;
		effect = Mth.nextInt(RandomSource.create(), 1, 3);
		if (effect == 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound minecraft:entity.player.attack.sweep master @p");
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 0, true, false));
			if (entity instanceof Player) {
				if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.SLOW_FALLING)) {
					entity.setDeltaMovement(new Vec3(0, 5, 0));
				}
			} else {
				entity.setDeltaMovement(new Vec3(0, 5, 0));
			}
		}
		if (effect == 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 2, true, false));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound minecraft:entity.allay.item_thrown master @p");
			entity.setDeltaMovement(new Vec3((Mth.nextInt(RandomSource.create(), -1, 1)), 0.25, (Mth.nextInt(RandomSource.create(), -1, 1))));
		}
		if (effect == 3) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound minecraft:entity.enderman.teleport master @p");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"spreadplayers ~ ~ 0 50 false @e[distance=..2,limit=1]");
		}
	}
}
