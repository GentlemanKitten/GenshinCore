
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
import net.mcreator.genshincore.block.FirLogSlabBlock;
import net.mcreator.genshincore.block.FirLogBlock;
import net.mcreator.genshincore.block.FirLeavesBlock;
import net.mcreator.genshincore.block.FirLeafStairsBlock;
import net.mcreator.genshincore.block.FirLeafSlabBlock;
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
}
