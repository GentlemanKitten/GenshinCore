
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshincore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.genshincore.block.WindwheelAsterBlock;
import net.mcreator.genshincore.block.SmallLampGrassBlock;
import net.mcreator.genshincore.block.MondstadtStoneStairsBlock;
import net.mcreator.genshincore.block.MondstadtStoneSlabBlock;
import net.mcreator.genshincore.block.MondstadtStonePressurePlateBlock;
import net.mcreator.genshincore.block.MondstadtStoneButtonBlock;
import net.mcreator.genshincore.block.MondstadtStoneBlock;
import net.mcreator.genshincore.block.MondstadtMountainGrassStairsBlock;
import net.mcreator.genshincore.block.MondstadtMountainGrassSlabBlock;
import net.mcreator.genshincore.block.MondstadtMountainGrassBlockBlock;
import net.mcreator.genshincore.block.MondstadtMountainGrassBlock;
import net.mcreator.genshincore.block.MondstadtMountainFullGrassStairsBlock;
import net.mcreator.genshincore.block.MondstadtMountainFullGrassSlabBlock;
import net.mcreator.genshincore.block.MondstadtMountainFullGrassBlockBlock;
import net.mcreator.genshincore.block.MondstadtMountainDirtStairsBlock;
import net.mcreator.genshincore.block.MondstadtMountainDirtSlabBlock;
import net.mcreator.genshincore.block.MondstadtMountainDirtBlockBlock;
import net.mcreator.genshincore.block.FirWoodStairsBlock;
import net.mcreator.genshincore.block.FirWoodSlabBlock;
import net.mcreator.genshincore.block.FirWoodBlock;
import net.mcreator.genshincore.block.FirStairsBlock;
import net.mcreator.genshincore.block.FirSlabBlock;
import net.mcreator.genshincore.block.FirPressurePlateBlock;
import net.mcreator.genshincore.block.FirPlanksBlock;
import net.mcreator.genshincore.block.FirLogSlabBlock;
import net.mcreator.genshincore.block.FirLogBlock;
import net.mcreator.genshincore.block.FirLeavesBlock;
import net.mcreator.genshincore.block.FirLeafStairsBlock;
import net.mcreator.genshincore.block.FirLeafSlabBlock;
import net.mcreator.genshincore.block.FirFenceGateBlock;
import net.mcreator.genshincore.block.FirFenceBlock;
import net.mcreator.genshincore.block.FirButtonBlock;
import net.mcreator.genshincore.GenshinCoreMod;

public class GenshinCoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GenshinCoreMod.MODID);
	public static final RegistryObject<Block> WINDWHEEL_ASTER = REGISTRY.register("windwheel_aster", () -> new WindwheelAsterBlock());
	public static final RegistryObject<Block> SMALL_LAMP_GRASS = REGISTRY.register("small_lamp_grass", () -> new SmallLampGrassBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_GRASS = REGISTRY.register("mondstadt_mountain_grass", () -> new MondstadtMountainGrassBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_FULL_GRASS_BLOCK = REGISTRY.register("mondstadt_mountain_full_grass_block", () -> new MondstadtMountainFullGrassBlockBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_FULL_GRASS_STAIRS = REGISTRY.register("mondstadt_mountain_full_grass_stairs", () -> new MondstadtMountainFullGrassStairsBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_FULL_GRASS_SLAB = REGISTRY.register("mondstadt_mountain_full_grass_slab", () -> new MondstadtMountainFullGrassSlabBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_GRASS_BLOCK = REGISTRY.register("mondstadt_mountain_grass_block", () -> new MondstadtMountainGrassBlockBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_GRASS_STAIRS = REGISTRY.register("mondstadt_mountain_grass_stairs", () -> new MondstadtMountainGrassStairsBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_GRASS_SLAB = REGISTRY.register("mondstadt_mountain_grass_slab", () -> new MondstadtMountainGrassSlabBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_DIRT_BLOCK = REGISTRY.register("mondstadt_mountain_dirt_block", () -> new MondstadtMountainDirtBlockBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_DIRT_STAIRS = REGISTRY.register("mondstadt_mountain_dirt_stairs", () -> new MondstadtMountainDirtStairsBlock());
	public static final RegistryObject<Block> MONDSTADT_MOUNTAIN_DIRT_SLAB = REGISTRY.register("mondstadt_mountain_dirt_slab", () -> new MondstadtMountainDirtSlabBlock());
	public static final RegistryObject<Block> FIR_LEAVES = REGISTRY.register("fir_leaves", () -> new FirLeavesBlock());
	public static final RegistryObject<Block> FIR_LEAF_STAIRS = REGISTRY.register("fir_leaf_stairs", () -> new FirLeafStairsBlock());
	public static final RegistryObject<Block> FIR_LEAF_SLAB = REGISTRY.register("fir_leaf_slab", () -> new FirLeafSlabBlock());
	public static final RegistryObject<Block> FIR_LOG = REGISTRY.register("fir_log", () -> new FirLogBlock());
	public static final RegistryObject<Block> FIR_LOG_SLAB = REGISTRY.register("fir_log_slab", () -> new FirLogSlabBlock());
	public static final RegistryObject<Block> FIR_WOOD = REGISTRY.register("fir_wood", () -> new FirWoodBlock());
	public static final RegistryObject<Block> FIR_WOOD_STAIRS = REGISTRY.register("fir_wood_stairs", () -> new FirWoodStairsBlock());
	public static final RegistryObject<Block> FIR_WOOD_SLAB = REGISTRY.register("fir_wood_slab", () -> new FirWoodSlabBlock());
	public static final RegistryObject<Block> FIR_PLANKS = REGISTRY.register("fir_planks", () -> new FirPlanksBlock());
	public static final RegistryObject<Block> FIR_STAIRS = REGISTRY.register("fir_stairs", () -> new FirStairsBlock());
	public static final RegistryObject<Block> FIR_SLAB = REGISTRY.register("fir_slab", () -> new FirSlabBlock());
	public static final RegistryObject<Block> FIR_FENCE = REGISTRY.register("fir_fence", () -> new FirFenceBlock());
	public static final RegistryObject<Block> FIR_FENCE_GATE = REGISTRY.register("fir_fence_gate", () -> new FirFenceGateBlock());
	public static final RegistryObject<Block> FIR_PRESSURE_PLATE = REGISTRY.register("fir_pressure_plate", () -> new FirPressurePlateBlock());
	public static final RegistryObject<Block> FIR_BUTTON = REGISTRY.register("fir_button", () -> new FirButtonBlock());
	public static final RegistryObject<Block> MONDSTADT_STONE = REGISTRY.register("mondstadt_stone", () -> new MondstadtStoneBlock());
	public static final RegistryObject<Block> MONDSTADT_STONE_STAIRS = REGISTRY.register("mondstadt_stone_stairs", () -> new MondstadtStoneStairsBlock());
	public static final RegistryObject<Block> MONDSTADT_STONE_SLAB = REGISTRY.register("mondstadt_stone_slab", () -> new MondstadtStoneSlabBlock());
	public static final RegistryObject<Block> MONDSTADT_STONE_PRESSURE_PLATE = REGISTRY.register("mondstadt_stone_pressure_plate", () -> new MondstadtStonePressurePlateBlock());
	public static final RegistryObject<Block> MONDSTADT_STONE_BUTTON = REGISTRY.register("mondstadt_stone_button", () -> new MondstadtStoneButtonBlock());
}
