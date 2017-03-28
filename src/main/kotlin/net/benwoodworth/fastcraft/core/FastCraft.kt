package net.benwoodworth.fastcraft.core

import net.benwoodworth.fastcraft.core.dependencies.event.EventListener
import net.benwoodworth.fastcraft.core.dependencies.server.EventServerStart
import javax.inject.Inject

/**
 * The core class of FastCraft.
 *
 * @param TFcItem The item type
 */
class FastCraft<TFcItem> @Inject constructor(
        serverStartEventListener: EventListener<EventServerStart>
) {



}
