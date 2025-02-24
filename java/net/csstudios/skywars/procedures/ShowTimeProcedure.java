package net.csstudios.skywars.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.Calendar;

public class ShowTimeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Calendar.getInstance().get(Calendar.MINUTE) < 10) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("The current time is \u00A76\u00A7l" + Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":0" + Calendar.getInstance().get(Calendar.MINUTE) + " \u00A7ron \u00A76\u00A7l"
						+ (Calendar.getInstance().get(Calendar.MONTH) + 1) + "/" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/" + Calendar.getInstance().get(Calendar.YEAR))), false);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("The current time is \u00A76\u00A7l" + Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":" + Calendar.getInstance().get(Calendar.MINUTE) + " \u00A7ron \u00A76\u00A7l"
						+ (Calendar.getInstance().get(Calendar.MONTH) + 1) + "/" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/" + Calendar.getInstance().get(Calendar.YEAR))), false);
		}
	}
}
