package net.benwoodworth.fastcraft.sponge.dependencies.server

import net.benwoodworth.fastcraft.core.dependencies.server.Logger
import net.benwoodworth.fastcraft.core.dependencies.server.Plugin
import net.benwoodworth.fastcraft.core.util.Adapter
import org.spongepowered.api.plugin.PluginContainer
import java.nio.file.Path

/**
 * An adapter for Sponge plugins.
 */
class SpongePlugin(
        plugin: PluginContainer
) : Plugin, Adapter<PluginContainer>(plugin) {

    override val logger: Logger
        get() = SpongeLogger(base.logger)

    override val pluginDirectory: Path
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override val configFile: Path
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}