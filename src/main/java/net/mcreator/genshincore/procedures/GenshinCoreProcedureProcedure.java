package net.mcreator.genshincore.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class GenshinCoreProcedureProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean GenshinCore = false;
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
				ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("genshin_core:genshin_core"));
				if (_player.level().dimension() == destinationType)
					return;
				ServerLevel nextLevel = _player.server.getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x, y, z), _serverPlayer.getYRot(), true, false);
		}
	}
}
