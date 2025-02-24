
package net.csstudios.skywars.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.csstudios.skywars.init.CsSkywarsModItems;
import net.csstudios.skywars.init.CsSkywarsModFluids;
import net.csstudios.skywars.init.CsSkywarsModFluidTypes;
import net.csstudios.skywars.init.CsSkywarsModBlocks;

public abstract class SkyLavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CsSkywarsModFluidTypes.SKY_LAVA_TYPE.get(), () -> CsSkywarsModFluids.SKY_LAVA.get(), () -> CsSkywarsModFluids.FLOWING_SKY_LAVA.get())
			.explosionResistance(100f).bucket(() -> CsSkywarsModItems.SKY_LAVA_BUCKET.get()).block(() -> (LiquidBlock) CsSkywarsModBlocks.SKY_LAVA.get());

	private SkyLavaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.ASH;
	}

	public static class Source extends SkyLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SkyLavaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
