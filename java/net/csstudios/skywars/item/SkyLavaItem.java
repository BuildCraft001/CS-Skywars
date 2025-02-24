
package net.csstudios.skywars.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.csstudios.skywars.init.CsSkywarsModFluids;

public class SkyLavaItem extends BucketItem {
	public SkyLavaItem() {
		super(CsSkywarsModFluids.SKY_LAVA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
