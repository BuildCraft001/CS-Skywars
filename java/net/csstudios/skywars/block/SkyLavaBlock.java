
package net.csstudios.skywars.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.csstudios.skywars.procedures.InsideLavaProcedure;
import net.csstudios.skywars.init.CsSkywarsModFluids;

public class SkyLavaBlock extends LiquidBlock {
	public SkyLavaBlock() {
		super(() -> CsSkywarsModFluids.SKY_LAVA.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		InsideLavaProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
