
package net.mcreator.genshincore.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.genshincore.procedures.GenshinCoreProcedureProcedure;

public class PrimogemItem extends Item {
	public PrimogemItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GenshinCoreProcedureProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
