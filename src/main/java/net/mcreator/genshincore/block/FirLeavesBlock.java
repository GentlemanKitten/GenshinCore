
package net.mcreator.genshincore.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class FirLeavesBlock extends LeavesBlock {
	public FirLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.VINE).strength(0.1f, 10f).requiresCorrectToolForDrops().noOcclusion().noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof HoeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}
}
