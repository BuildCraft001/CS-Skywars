package net.csstudios.skywars.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.csstudios.skywars.CsSkywarsMod;

public class RocketExplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		String block = "";
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		double xCord = 0;
		double yCord = 0;
		double zCord = 0;
		while (i < 14) {
		    i++;
		    xCord = x - 7 + i;
		    
		    j = 0;
		    while (j < 14) {
		        j++;
		        yCord = y - 7 + j;
		        
		        k = 0;
		        while (k < 14) {
		            k++;
		            zCord = z - 7 + k;

		            double distance = Math.sqrt(Math.pow(xCord - x, 2) + Math.pow(yCord - y, 2) + Math.pow(zCord - z, 2));

		            if (distance <= 7) {
		            
			            block = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(xCord, yCord, zCord))).getBlock()).toString();
			            
			            if (world instanceof ServerLevel _level)
			                _level.getServer().getCommands().performPrefixedCommand(
			                    new CommandSourceStack(CommandSource.NULL, new Vec3(xCord, yCord, zCord), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), 
			                    "setblock ~ ~ ~ air");
			            
			            if (world instanceof ServerLevel _level && block != "minecraft:air")
			                _level.getServer().getCommands().performPrefixedCommand(
			                    new CommandSourceStack(CommandSource.NULL, new Vec3(xCord, yCord, zCord), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
			                    "summon minecraft:falling_block ~ ~ ~ {BlockState:{Name:\"" + block + "\"},Time:-2000}");

	                    if (world instanceof ServerLevel _level)
			                _level.getServer().getCommands().performPrefixedCommand(
			                    new CommandSourceStack(CommandSource.NULL, new Vec3(xCord, yCord, zCord), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), 
			                    "kill @e[type=minecraft:falling_block,nbt={BlockState:{Name:\"minecraft:sand\"}}]");

			            if (world instanceof ServerLevel _level)
			                _level.getServer().getCommands().performPrefixedCommand(
			                    new CommandSourceStack(CommandSource.NULL, new Vec3(xCord, yCord, zCord), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), 
			                    "particle minecraft:sonic_boom ~ ~ ~");
			                    
		            }
		        }
		    }
		}


		CsSkywarsMod.queueServerWork(1, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[distance=..5] run damage @s 45 minecraft:player_explosion by @p[tag=rocket]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[distance=5..7] run damage @s 35 minecraft:player_explosion by @p[tag=rocket]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[distance=7..8] run damage @s 25 minecraft:player_explosion by @p[tag=rocket]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[distance=8..9] run damage @s 15 minecraft:player_explosion by @p[tag=rocket]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute as @e[distance=9..13] run damage @s 5 minecraft:player_explosion by @p[tag=rocket]");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"effect give @a[distance=..10] resistance 1 4 true");
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.TNT);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"tag @p[tag=rocket] remove rocket");
		});
	}
}
