
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.wisedragoon.morecolor.init;

import net.wisedragoon.morecolor.block.YellowConcreteStairsBlock;
import net.wisedragoon.morecolor.block.YellowConcreteSlabBlock;
import net.wisedragoon.morecolor.block.YellowBrickStairsBlock;
import net.wisedragoon.morecolor.block.YellowBrickSlabBlock;
import net.wisedragoon.morecolor.block.YellowBrickBlock;
import net.wisedragoon.morecolor.block.RedConcreteStairsBlock;
import net.wisedragoon.morecolor.block.RedConcreteSlabBlock;
import net.wisedragoon.morecolor.block.OrangeConcreteStairsBlock;
import net.wisedragoon.morecolor.block.OrangeConcreteSlabBlock;
import net.wisedragoon.morecolor.block.OrangeBrickStairsBlock;
import net.wisedragoon.morecolor.block.OrangeBrickSlabBlock;
import net.wisedragoon.morecolor.block.OrangeBrickBlock;
import net.wisedragoon.morecolor.block.LimeConcreteStairsBlock;
import net.wisedragoon.morecolor.block.LimeConcreteSlabBlock;
import net.wisedragoon.morecolor.block.LimeBrickStairsBlock;
import net.wisedragoon.morecolor.block.LimeBrickSlabBlock;
import net.wisedragoon.morecolor.block.LimeBrickBlock;
import net.wisedragoon.morecolor.block.LightBlueConcreteStairsBlock;
import net.wisedragoon.morecolor.block.LightBlueConcreteSlabBlock;
import net.wisedragoon.morecolor.block.LightBlueBrickStairsBlock;
import net.wisedragoon.morecolor.block.LightBlueBrickSlabBlock;
import net.wisedragoon.morecolor.block.LightBlueBrickBlock;
import net.wisedragoon.morecolor.block.GreenConcreteStairsBlock;
import net.wisedragoon.morecolor.block.GreenConcreteSlabBlock;
import net.wisedragoon.morecolor.block.GreenBrickStairsBlock;
import net.wisedragoon.morecolor.block.GreenBrickSlabBlock;
import net.wisedragoon.morecolor.block.GreenBrickBlock;
import net.wisedragoon.morecolor.block.BlueConcreteStairsBlock;
import net.wisedragoon.morecolor.block.BlueConcreteSlabBlock;
import net.wisedragoon.morecolor.block.BlueBrickStairsBlock;
import net.wisedragoon.morecolor.block.BlueBrickSlabBlock;
import net.wisedragoon.morecolor.block.BlueBrickBlock;
import net.wisedragoon.morecolor.block.BlackConcreteStairsBlock;
import net.wisedragoon.morecolor.block.BlackConcreteSlabBlock;
import net.wisedragoon.morecolor.block.BlackBrickStairsBlock;
import net.wisedragoon.morecolor.block.BlackBrickSlabBlock;
import net.wisedragoon.morecolor.block.BlackBrickBlock;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreColorModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block BLUE_BRICK = register(new BlueBrickBlock());
	public static final Block GREEN_BRICK = register(new GreenBrickBlock());
	public static final Block LIME_BRICK = register(new LimeBrickBlock());
	public static final Block YELLOW_BRICK = register(new YellowBrickBlock());
	public static final Block RED_CONCRETE_SLAB = register(new RedConcreteSlabBlock());
	public static final Block BLUE_CONCRETE_SLAB = register(new BlueConcreteSlabBlock());
	public static final Block GREEN_CONCRETE_SLAB = register(new GreenConcreteSlabBlock());
	public static final Block RED_CONCRETE_STAIRS = register(new RedConcreteStairsBlock());
	public static final Block BLUE_CONCRETE_STAIRS = register(new BlueConcreteStairsBlock());
	public static final Block GREEN_CONCRETE_STAIRS = register(new GreenConcreteStairsBlock());
	public static final Block BLUE_BRICK_STAIRS = register(new BlueBrickStairsBlock());
	public static final Block GREEN_BRICK_STAIRS = register(new GreenBrickStairsBlock());
	public static final Block YELLOW_BRICK_STAIRS = register(new YellowBrickStairsBlock());
	public static final Block LIME_BRICK_STAIRS = register(new LimeBrickStairsBlock());
	public static final Block BLUE_BRICK_SLAB = register(new BlueBrickSlabBlock());
	public static final Block GREEN_BRICK_SLAB = register(new GreenBrickSlabBlock());
	public static final Block YELLOW_BRICK_SLAB = register(new YellowBrickSlabBlock());
	public static final Block LIME_BRICK_SLAB = register(new LimeBrickSlabBlock());
	public static final Block YELLOW_CONCRETE_SLAB = register(new YellowConcreteSlabBlock());
	public static final Block LIME_CONCRETE_SLAB = register(new LimeConcreteSlabBlock());
	public static final Block LIME_CONCRETE_STAIRS = register(new LimeConcreteStairsBlock());
	public static final Block YELLOW_CONCRETE_STAIRS = register(new YellowConcreteStairsBlock());
	public static final Block LIGHT_BLUE_CONCRETE_SLAB = register(new LightBlueConcreteSlabBlock());
	public static final Block LIGHT_BLUE_BRICK = register(new LightBlueBrickBlock());
	public static final Block LIGHT_BLUE_BRICK_STAIRS = register(new LightBlueBrickStairsBlock());
	public static final Block LIGHT_BLUE_BRICK_SLAB = register(new LightBlueBrickSlabBlock());
	public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register(new LightBlueConcreteStairsBlock());
	public static final Block ORANGE_CONCRETE_SLAB = register(new OrangeConcreteSlabBlock());
	public static final Block ORANGE_CONCRETE_STAIRS = register(new OrangeConcreteStairsBlock());
	public static final Block ORANGE_BRICK = register(new OrangeBrickBlock());
	public static final Block ORANGE_BRICK_STAIRS = register(new OrangeBrickStairsBlock());
	public static final Block ORANGE_BRICK_SLAB = register(new OrangeBrickSlabBlock());
	public static final Block BLACK_BRICK = register(new BlackBrickBlock());
	public static final Block BLACK_BRICK_STAIRS = register(new BlackBrickStairsBlock());
	public static final Block BLACK_BRICK_SLAB = register(new BlackBrickSlabBlock());
	public static final Block BLACK_CONCRETE_SLAB = register(new BlackConcreteSlabBlock());
	public static final Block BLACK_CONCRETE_STAIRS = register(new BlackConcreteStairsBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RedConcreteSlabBlock.registerRenderLayer();
			BlueConcreteSlabBlock.registerRenderLayer();
			GreenConcreteSlabBlock.registerRenderLayer();
			YellowConcreteSlabBlock.registerRenderLayer();
			LimeConcreteSlabBlock.registerRenderLayer();
			LightBlueConcreteSlabBlock.registerRenderLayer();
			OrangeConcreteSlabBlock.registerRenderLayer();
			BlackConcreteSlabBlock.registerRenderLayer();
		}
	}
}
