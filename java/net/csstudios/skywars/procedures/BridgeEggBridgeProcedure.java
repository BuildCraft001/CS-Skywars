package net.csstudios.skywars.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.csstudios.skywars.CsSkywarsMod;

public class BridgeEggBridgeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xold = 0;
		double yold = 0;
		double zold = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
			CsSkywarsMod.queueServerWork(3, () -> {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.LIME_WOOL.defaultBlockState(), 3);
			});
		}
	}
}
