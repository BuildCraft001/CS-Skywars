package net.csstudios.skywars.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.csstudios.skywars.init.CsSkywarsModBlocks;
import net.csstudios.skywars.CsSkywarsMod;

public class InsideLavaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("inLava");
			if (_so == null)
				_so = _sc.addObjective("inLava", ObjectiveCriteria.DUMMY, Component.literal("inLava"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("inLava", entity) + 1));
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("inLava", entity) % 20 == 0) {
			{
				Entity _entToDamage = entity;
				_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LAVA)), (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 5));
			}
			entity.setSecondsOnFire((int) Math.min(new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("inLava", entity) / 15, 10));
			if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.FIRE_RESISTANCE)) {
				if ((world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == CsSkywarsModBlocks.SKY_LAVA.get()
						&& (world.getFluidState(BlockPos.containing(x, y - 2, z)).createLegacyBlock()).getBlock() == CsSkywarsModBlocks.SKY_LAVA.get()
						|| (world.getFluidState(BlockPos.containing(x, y - 1, z)).createLegacyBlock()).getBlock() == CsSkywarsModBlocks.CHAOS_LAVA.get()
								&& (world.getFluidState(BlockPos.containing(x, y - 2, z)).createLegacyBlock()).getBlock() == CsSkywarsModBlocks.CHAOS_LAVA.get()) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
								return Component.translatable("death.attack." + "totemcounter");
							}
						}, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 5));
				}
			}
			CsSkywarsMod.queueServerWork(20, () -> {
				if (!((world.getFluidState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).createLegacyBlock()).getBlock() == CsSkywarsModBlocks.SKY_LAVA.get()
						|| (world.getFluidState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).createLegacyBlock()).getBlock() == CsSkywarsModBlocks.CHAOS_LAVA.get())) {
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective("inLava");
						if (_so == null)
							_so = _sc.addObjective("inLava", ObjectiveCriteria.DUMMY, Component.literal("inLava"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
					}
				}
			});
		}
	}
}
