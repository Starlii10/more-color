
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.wisedragoon.morecolor.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreColorModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> COLORFULER = GameRules.register("colorfuler", GameRules.Category.MISC,
			GameRules.BooleanValue.create(true));
}
