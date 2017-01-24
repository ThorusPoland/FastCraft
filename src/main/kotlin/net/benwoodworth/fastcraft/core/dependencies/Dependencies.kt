package net.benwoodworth.fastcraft.core.dependencies

import net.benwoodworth.fastcraft.core.dependencies.config.FcConfigProvider
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcInventoryProvider
import net.benwoodworth.fastcraft.core.dependencies.permissions.FcPermissionService
import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayerProvider
import net.benwoodworth.fastcraft.core.dependencies.recipes.FcRecipeService

/**
 * Provides dependencies for FastCraft.
 *
 * @param TItem the native item type.
 */
class Dependencies<TItem>(
        /** Provides new instances of inventories */
        val inventoryProvider: FcInventoryProvider<TItem>,

        /** Provides server players */
        val playerProvider: FcPlayerProvider<TItem>,

        /** Manages server recipes */
        val recipeService: FcRecipeService<TItem>,

        /** Manages server permissions */
        val permissionService: FcPermissionService,

        /** Provides configurations */
        val configProvider: FcConfigProvider,

        /** Schedules tasks */
        val taskScheduler: FcTaskScheduler
)
