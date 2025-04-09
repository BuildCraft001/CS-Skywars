package net.csstudios.skywars.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.csstudios.skywars.init.CsSkywarsModMobEffects;
import net.csstudios.skywars.CsSkywarsMod;

public class TurboCreeperChargeupProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("creeper_exploded");
			if (_so == null)
				_so = _sc.addObjective("creeper_exploded", ObjectiveCriteria.DUMMY, Component.literal("creeper_exploded"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(CsSkywarsModMobEffects.FREEZE.get(), 60, 0, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 4, false, false));
		CsSkywarsMod.queueServerWork(60, () -> {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("creeper_exploded");
				if (_so == null)
					_so = _sc.addObjective("creeper_exploded", ObjectiveCriteria.DUMMY, Component.literal("creeper_exploded"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
		});
	}
}
