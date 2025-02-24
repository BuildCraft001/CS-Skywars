package net.csstudios.skywars.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class RankDisplayProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @s [\"\",{\"text\":\"-----------------------------------------------------\",\"color\":\"green\"}]");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level.getServer(), _ent),
						"tellraw @s [\"\",{\"text\":\"Reward for the last match: \",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"rank_score_reward\"},\"color\":\"green\"},{\"text\":\" Rank Points\",\"color\":\"green\"}]");
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank", entity) == 1) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your current rank is \",\"color\":\"green\"},{\"text\":\"Iron\",\"color\":\"dark_gray\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"},{\"text\":\"\\n-----------------------------------------------------\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank", entity) == 2) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your current rank is \",\"color\":\"green\"},{\"text\":\"Bronze\",\"color\":\"gold\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"},{\"text\":\"\\n-----------------------------------------------------\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank", entity) == 3) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your current rank is \",\"color\":\"green\"},{\"text\":\"Silver\",\"color\":\"gray\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"},{\"text\":\"\\n-----------------------------------------------------\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank", entity) == 4) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your current rank is \",\"color\":\"green\"},{\"text\":\"Gold\",\"color\":\"yellow\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"},{\"text\":\"\\n-----------------------------------------------------\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank", entity) == 5) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your current rank is \",\"color\":\"green\"},{\"text\":\"Platinum\",\"color\":\"white\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"},{\"text\":\"\\n-----------------------------------------------------\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank", entity) == 6) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your current rank is \",\"color\":\"green\"},{\"text\":\"Diamond\",\"color\":\"aqua\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"},{\"text\":\"\\n-----------------------------------------------------\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank", entity) == 7) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your current rank is \",\"color\":\"green\"},{\"text\":\"Hyperiant\",\"color\":\"light_purple\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score\"},\"color\":\"green\"},{\"text\":\")\",\"color\":\"green\"},{\"text\":\"\\n-----------------------------------------------------\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) <= 99) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("partial_rank_score_peak");
				if (_so == null)
					_so = _sc.addObjective("partial_rank_score_peak", ObjectiveCriteria.DUMMY, Component.literal("partial_rank_score_peak"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("rank_score_peak", entity));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your highest peak was\",\"color\":\"green\"},{\"text\":\" Iron \",\"color\":\"dark_gray\"},{\"text\":\"(\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score_peak\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) >= 100 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) <= 199) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("partial_rank_score_peak");
				if (_so == null)
					_so = _sc.addObjective("partial_rank_score_peak", ObjectiveCriteria.DUMMY, Component.literal("partial_rank_score_peak"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("rank_score_peak", entity) - 100));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your highest peak was\",\"color\":\"green\"},{\"text\":\" Bronze\",\"color\":\"gold\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score_peak\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) >= 200 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) <= 299) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("partial_rank_score_peak");
				if (_so == null)
					_so = _sc.addObjective("partial_rank_score_peak", ObjectiveCriteria.DUMMY, Component.literal("partial_rank_score_peak"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("rank_score_peak", entity) - 200));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your highest peak was\",\"color\":\"green\"},{\"text\":\" Silver\",\"color\":\"gray\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score_peak\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) >= 300 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) <= 399) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("partial_rank_score_peak");
				if (_so == null)
					_so = _sc.addObjective("partial_rank_score_peak", ObjectiveCriteria.DUMMY, Component.literal("partial_rank_score_peak"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("rank_score_peak", entity) - 300));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your highest peak was\",\"color\":\"green\"},{\"text\":\" Gold\",\"color\":\"yellow\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score_peak\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) >= 400 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) <= 499) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("partial_rank_score_peak");
				if (_so == null)
					_so = _sc.addObjective("partial_rank_score_peak", ObjectiveCriteria.DUMMY, Component.literal("partial_rank_score_peak"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("rank_score_peak", entity) - 400));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your highest peak was\",\"color\":\"green\"},{\"text\":\" Platinum\",\"color\":\"white\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score_peak\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) >= 500 && new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) <= 599) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("partial_rank_score_peak");
				if (_so == null)
					_so = _sc.addObjective("partial_rank_score_peak", ObjectiveCriteria.DUMMY, Component.literal("partial_rank_score_peak"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("rank_score_peak", entity) - 500));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your highest peak was\",\"color\":\"green\"},{\"text\":\" Diamond\",\"color\":\"aqua\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score_peak\"},\"color\":\"green\"},{\"text\":\"/100)\",\"color\":\"green\"}]");
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("rank_score_peak", entity) >= 600) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective("partial_rank_score_peak");
				if (_so == null)
					_so = _sc.addObjective("partial_rank_score_peak", ObjectiveCriteria.DUMMY, Component.literal("partial_rank_score_peak"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.getLevel().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("rank_score_peak", entity) - 600));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @s [\"\",{\"text\":\"Your highest peak was\",\"color\":\"green\"},{\"text\":\" Hyperiant\",\"color\":\"light_purple\"},{\"text\":\" (\",\"color\":\"green\"},{\"score\":{\"name\":\"@s\",\"objective\":\"partial_rank_score_peak\"},\"color\":\"green\"},{\"text\":\")\",\"color\":\"green\"}]");
				}
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @s [\"\",{\"text\":\"-----------------------------------------------------\",\"color\":\"green\"}]");
			}
		}
	}
}
