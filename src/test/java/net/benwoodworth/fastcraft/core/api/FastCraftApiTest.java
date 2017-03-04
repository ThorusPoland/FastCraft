package net.benwoodworth.fastcraft.core.api;

import net.benwoodworth.fastcraft.core.FastCraft;
import net.benwoodworth.fastcraft.core.api.gui.Gui;
import net.benwoodworth.fastcraft.core.dependencies.FileProvider;
import net.benwoodworth.fastcraft.core.dependencies.TaskScheduler;
import net.benwoodworth.fastcraft.core.dependencies.config.ConfigFactory;
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcInventory;
import net.benwoodworth.fastcraft.core.dependencies.inventory.InventoryFactory;
import net.benwoodworth.fastcraft.core.dependencies.permissions.PermissionService;
import net.benwoodworth.fastcraft.core.dependencies.player.PlayerProvider;
import net.benwoodworth.fastcraft.core.dependencies.recipes.RecipeService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Unit tests for the `Gui` class.
 */
public class FastCraftApiTest {

    private class ItemT {
    }

    private class InvT {
    }

    private InvT guiInventory = new InvT();
    private InvT nonGuiInventory = new InvT();

    private FastCraft<ItemT, InvT> fastCraft;
    private FastCraftApi<ItemT, InvT> api;

    @Before
    @SuppressWarnings("unchecked")
    public void setup() {
        // Mock inventory adapters
        FcInventory<ItemT> guiInvAdapter = mock(FcInventory.class);
        when(guiInvAdapter.getCarrier()).thenReturn(mock(Gui.class));

        FcInventory<ItemT> nonGuiInvAdapter = mock(FcInventory.class);
        when(nonGuiInvAdapter.getCarrier()).thenReturn(null);

        // Mock an inventory provider
        InventoryFactory<ItemT, InvT> invProvider = mock(InventoryFactory.class);
        when(invProvider.adaptInventory(guiInventory)).thenReturn(guiInvAdapter);
        when(invProvider.adaptInventory(nonGuiInventory)).thenReturn(nonGuiInvAdapter);

        // Mock dependencies
        Dependencies<ItemT, InvT> dependencies = new Dependencies<>(
                invProvider,
                mock(PlayerProvider.class),
                mock(RecipeService.class),
                mock(PermissionService.class),
                mock(ConfigFactory.class),
                mock(TaskScheduler.class),
                mock(FileProvider.class)
        );

        // Create FastCraft instance
        fastCraft = new FastCraft<>(dependencies);

        // Create API
        api = new FastCraftApi<>(fastCraft);
    }

    @Test
    public void testIsGuiInventory() {
        assertTrue(
                "When passed a GUI inventory, isGuiInventory() should return true.",
                api.isGuiInventory(guiInventory)
        );

        assertFalse(
                "When passed a non-GUI inventory, isGuiInventory() should return false.",
                api.isGuiInventory(nonGuiInventory)
        );
    }
}
