
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.wisedragoon.morecolor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreColorModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item BLUE_BRICK = register(MoreColorModBlocks.BLUE_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GREEN_BRICK = register(MoreColorModBlocks.GREEN_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIME_BRICK = register(MoreColorModBlocks.LIME_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item YELLOW_BRICK = register(MoreColorModBlocks.YELLOW_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item RED_CONCRETE_SLAB = register(MoreColorModBlocks.RED_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLUE_CONCRETE_SLAB = register(MoreColorModBlocks.BLUE_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GREEN_CONCRETE_SLAB = register(MoreColorModBlocks.GREEN_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item RED_CONCRETE_STAIRS = register(MoreColorModBlocks.RED_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLUE_CONCRETE_STAIRS = register(MoreColorModBlocks.BLUE_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GREEN_CONCRETE_STAIRS = register(MoreColorModBlocks.GREEN_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLUE_BRICK_STAIRS = register(MoreColorModBlocks.BLUE_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GREEN_BRICK_STAIRS = register(MoreColorModBlocks.GREEN_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item YELLOW_BRICK_STAIRS = register(MoreColorModBlocks.YELLOW_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIME_BRICK_STAIRS = register(MoreColorModBlocks.LIME_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLUE_BRICK_SLAB = register(MoreColorModBlocks.BLUE_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item GREEN_BRICK_SLAB = register(MoreColorModBlocks.GREEN_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item YELLOW_BRICK_SLAB = register(MoreColorModBlocks.YELLOW_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIME_BRICK_SLAB = register(MoreColorModBlocks.LIME_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item YELLOW_CONCRETE_SLAB = register(MoreColorModBlocks.YELLOW_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIME_CONCRETE_SLAB = register(MoreColorModBlocks.LIME_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIME_CONCRETE_STAIRS = register(MoreColorModBlocks.LIME_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item YELLOW_CONCRETE_STAIRS = register(MoreColorModBlocks.YELLOW_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIGHT_BLUE_CONCRETE_SLAB = register(MoreColorModBlocks.LIGHT_BLUE_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIGHT_BLUE_BRICK = register(MoreColorModBlocks.LIGHT_BLUE_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIGHT_BLUE_BRICK_STAIRS = register(MoreColorModBlocks.LIGHT_BLUE_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIGHT_BLUE_BRICK_SLAB = register(MoreColorModBlocks.LIGHT_BLUE_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item LIGHT_BLUE_CONCRETE_STAIRS = register(MoreColorModBlocks.LIGHT_BLUE_CONCRETE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ORANGE_CONCRETE_SLAB = register(MoreColorModBlocks.ORANGE_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ORANGE_CONCRETE_STAIRS = register(MoreColorModBlocks.ORANGE_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ORANGE_BRICK = register(MoreColorModBlocks.ORANGE_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ORANGE_BRICK_STAIRS = register(MoreColorModBlocks.ORANGE_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ORANGE_BRICK_SLAB = register(MoreColorModBlocks.ORANGE_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLACK_BRICK = register(MoreColorModBlocks.BLACK_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLACK_BRICK_STAIRS = register(MoreColorModBlocks.BLACK_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLACK_BRICK_SLAB = register(MoreColorModBlocks.BLACK_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLACK_CONCRETE_SLAB = register(MoreColorModBlocks.BLACK_CONCRETE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLACK_CONCRETE_STAIRS = register(MoreColorModBlocks.BLACK_CONCRETE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
