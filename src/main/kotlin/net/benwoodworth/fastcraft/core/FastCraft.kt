package net.benwoodworth.fastcraft.core

import net.benwoodworth.fastcraft.core.dependencies.Dependencies

/**
 * The core class of FastCraft.
 *
 * @param TItem The native item type
 * @param TInventory The native inventory type
 */
class FastCraft<TItem, in TInventory>(
        /** FastCraft dependencies. */
        val dependencies: Dependencies<TItem, TInventory>
)
