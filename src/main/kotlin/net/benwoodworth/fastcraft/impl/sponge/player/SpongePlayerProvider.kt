package net.benwoodworth.fastcraft.impl.sponge.player

import net.benwoodworth.fastcraft.dependencies.player.Player
import net.benwoodworth.fastcraft.dependencies.player.PlayerProvider
import org.spongepowered.api.Sponge
import java.util.UUID

/**
 * Sponge implementation of [PlayerProvider].
 */
class SpongePlayerProvider : PlayerProvider {

    override fun getOnlinePlayers(): List<Player> {
        return Sponge.getServer().onlinePlayers
                .map(::SpongePlayer)
    }

    override fun getOnlinePlayer(uuid: UUID): Player? {
        return Sponge.getServer().getPlayer(uuid)
                .map(::SpongePlayer)
                .orElse(null)
    }
}