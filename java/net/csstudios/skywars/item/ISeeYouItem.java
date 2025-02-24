
package net.csstudios.skywars.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.csstudios.skywars.procedures.ISeeYouActiveProcedure;

public class ISeeYouItem extends Item {
	public ISeeYouItem() {
		super(new Item.Properties().durability(600).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ISeeYouActiveProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), itemstack);
	}
}
