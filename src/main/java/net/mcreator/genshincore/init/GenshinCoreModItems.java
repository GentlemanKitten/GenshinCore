
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshincore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.genshincore.item.PrimogemItem;
import net.mcreator.genshincore.GenshinCoreMod;

public class GenshinCoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GenshinCoreMod.MODID);
	public static final RegistryObject<Item> PRIMOGEM = REGISTRY.register("primogem", () -> new PrimogemItem());
	public static final RegistryObject<Item> WINDWHEEL_ASTER = block(GenshinCoreModBlocks.WINDWHEEL_ASTER);
	public static final RegistryObject<Item> SMALL_LAMP_GRASS = block(GenshinCoreModBlocks.SMALL_LAMP_GRASS);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_GRASS = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_FULL_GRASS_BLOCK = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_FULL_GRASS_BLOCK);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_FULL_GRASS_STAIRS = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_FULL_GRASS_STAIRS);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_FULL_GRASS_SLAB = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_FULL_GRASS_SLAB);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_GRASS_BLOCK = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS_BLOCK);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_GRASS_STAIRS = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS_STAIRS);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_GRASS_SLAB = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS_SLAB);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_DIRT_BLOCK = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_DIRT_BLOCK);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_DIRT_STAIRS = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_DIRT_STAIRS);
	public static final RegistryObject<Item> MONDSTADT_MOUNTAIN_DIRT_SLAB = block(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_DIRT_SLAB);
	public static final RegistryObject<Item> FIR_LEAVES = block(GenshinCoreModBlocks.FIR_LEAVES);
	public static final RegistryObject<Item> FIR_LEAF_STAIRS = block(GenshinCoreModBlocks.FIR_LEAF_STAIRS);
	public static final RegistryObject<Item> FIR_LEAF_SLAB = block(GenshinCoreModBlocks.FIR_LEAF_SLAB);
	public static final RegistryObject<Item> FIR_LOG = block(GenshinCoreModBlocks.FIR_LOG);
	public static final RegistryObject<Item> FIR_LOG_SLAB = block(GenshinCoreModBlocks.FIR_LOG_SLAB);
	public static final RegistryObject<Item> FIR_WOOD = block(GenshinCoreModBlocks.FIR_WOOD);
	public static final RegistryObject<Item> FIR_WOOD_STAIRS = block(GenshinCoreModBlocks.FIR_WOOD_STAIRS);
	public static final RegistryObject<Item> FIR_WOOD_SLAB = block(GenshinCoreModBlocks.FIR_WOOD_SLAB);
	public static final RegistryObject<Item> FIR_PLANKS = block(GenshinCoreModBlocks.FIR_PLANKS);
	public static final RegistryObject<Item> FIR_STAIRS = block(GenshinCoreModBlocks.FIR_STAIRS);
	public static final RegistryObject<Item> FIR_SLAB = block(GenshinCoreModBlocks.FIR_SLAB);
	public static final RegistryObject<Item> FIR_FENCE = block(GenshinCoreModBlocks.FIR_FENCE);
	public static final RegistryObject<Item> FIR_FENCE_GATE = block(GenshinCoreModBlocks.FIR_FENCE_GATE);
	public static final RegistryObject<Item> FIR_PRESSURE_PLATE = block(GenshinCoreModBlocks.FIR_PRESSURE_PLATE);
	public static final RegistryObject<Item> FIR_BUTTON = block(GenshinCoreModBlocks.FIR_BUTTON);
	public static final RegistryObject<Item> MONDSTADT_STONE = block(GenshinCoreModBlocks.MONDSTADT_STONE);
	public static final RegistryObject<Item> MONDSTADT_STONE_STAIRS = block(GenshinCoreModBlocks.MONDSTADT_STONE_STAIRS);
	public static final RegistryObject<Item> MONDSTADT_STONE_SLAB = block(GenshinCoreModBlocks.MONDSTADT_STONE_SLAB);
	public static final RegistryObject<Item> MONDSTADT_STONE_PRESSURE_PLATE = block(GenshinCoreModBlocks.MONDSTADT_STONE_PRESSURE_PLATE);
	public static final RegistryObject<Item> MONDSTADT_STONE_BUTTON = block(GenshinCoreModBlocks.MONDSTADT_STONE_BUTTON);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
