package net.csstudios.skywars.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.csstudios.skywars.init.CsSkywarsModBlocks;

public class FreezedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 0, 0));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1, 0, false, false));
		entity.setSecondsOnFire(0);
		if ((world.getFluidState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).createLegacyBlock()).getBlock() == CsSkywarsModBlocks.SKY_LAVA.get()
				|| (world.getFluidState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).createLegacyBlock()).getBlock() == CsSkywarsModBlocks.CHAOS_LAVA.get()
				|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == CsSkywarsModBlocks.HEALER.get()
				|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() == CsSkywarsModBlocks.RND_EFFECT.get()) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "spreadplayers ~ ~ 1 7 false @s");
				}
			}
		}
	}
}
