
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshincore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.genshincore.world.features.plants.WindwheelAsterFeature;
import net.mcreator.genshincore.world.features.plants.SmallLampGrassFeature;
import net.mcreator.genshincore.world.features.plants.MondstadtMountainGrassFeature;
import net.mcreator.genshincore.world.features.ores.MondstadtStoneFeature;
import net.mcreator.genshincore.GenshinCoreMod;

@Mod.EventBusSubscriber
public class GenshinCoreModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, GenshinCoreMod.MODID);
	public static final RegistryObject<Feature<?>> WINDWHEEL_ASTER = REGISTRY.register("windwheel_aster", WindwheelAsterFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_LAMP_GRASS = REGISTRY.register("small_lamp_grass", SmallLampGrassFeature::new);
	public static final RegistryObject<Feature<?>> MONDSTADT_MOUNTAIN_GRASS = REGISTRY.register("mondstadt_mountain_grass", MondstadtMountainGrassFeature::new);
	public static final RegistryObject<Feature<?>> MONDSTADT_STONE = REGISTRY.register("mondstadt_stone", MondstadtStoneFeature::new);
}
