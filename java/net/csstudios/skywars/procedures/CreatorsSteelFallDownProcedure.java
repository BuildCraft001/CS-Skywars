package net.csstudios.skywars.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.csstudios.skywars.init.CsSkywarsModBlocks;

public class CreatorsSteelFallDownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), CsSkywarsModBlocks.CREATORS_STEEL.get().defaultBlockState(), 3);
	}
}
