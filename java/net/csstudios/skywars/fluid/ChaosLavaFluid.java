
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

public abstract class ChaosLavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CsSkywarsModFluidTypes.CHAOS_LAVA_TYPE.get(), () -> CsSkywarsModFluids.CHAOS_LAVA.get(), () -> CsSkywarsModFluids.FLOWING_CHAOS_LAVA.get())
			.explosionResistance(100f).bucket(() -> CsSkywarsModItems.CHAOS_LAVA_BUCKET.get()).block(() -> (LiquidBlock) CsSkywarsModBlocks.CHAOS_LAVA.get());

	private ChaosLavaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.ASH;
	}

	public static class Source extends ChaosLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ChaosLavaFluid {
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
