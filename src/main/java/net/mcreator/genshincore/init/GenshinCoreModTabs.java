
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshincore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshincore.GenshinCoreMod;

public class GenshinCoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GenshinCoreMod.MODID);
	public static final RegistryObject<CreativeModeTab> CURRENCY = REGISTRY.register("currency",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.genshin_core.currency")).icon(() -> new ItemStack(GenshinCoreModItems.PRIMOGEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GenshinCoreModItems.PRIMOGEM.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> NATURE = REGISTRY.register("nature",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.genshin_core.nature")).icon(() -> new ItemStack(GenshinCoreModBlocks.WINDWHEEL_ASTER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GenshinCoreModBlocks.WINDWHEEL_ASTER.get().asItem());
				tabData.accept(GenshinCoreModBlocks.SMALL_LAMP_GRASS.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> BLOCKS = REGISTRY.register("blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.genshin_core.blocks")).icon(() -> new ItemStack(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_FULL_GRASS_BLOCK.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_FULL_GRASS_STAIRS.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_FULL_GRASS_SLAB.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS_BLOCK.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS_STAIRS.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_GRASS_SLAB.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_DIRT_BLOCK.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_DIRT_STAIRS.get().asItem());
				tabData.accept(GenshinCoreModBlocks.MONDSTADT_MOUNTAIN_DIRT_SLAB.get().asItem());
				tabData.accept(GenshinCoreModBlocks.FIR_LEAVES.get().asItem());
				tabData.accept(GenshinCoreModBlocks.FIR_LEAF_STAIRS.get().asItem());
				tabData.accept(GenshinCoreModBlocks.FIR_LEAF_SLAB.get().asItem());
				tabData.accept(GenshinCoreModBlocks.FIR_LOG.get().asItem());
				tabData.accept(GenshinCoreModBlocks.FIR_LOG_SLAB.get().asItem());
				tabData.accept(GenshinCoreModBlocks.FIR_WOOD.get().asItem());
				tabData.accept(GenshinCoreModBlocks.FIR_WOOD_STAIRS.get().asItem());
				tabData.accept(GenshinCoreModBlocks.FIR_WOOD_SLAB.get().asItem());
			}).withSearchBar().build());
}
