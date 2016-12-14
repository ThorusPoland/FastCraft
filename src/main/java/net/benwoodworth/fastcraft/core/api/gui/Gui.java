package net.benwoodworth.fastcraft.core.api.gui;

import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcInventory;

/**
 * A user interface for
 * @param <TItem>
 */
public class Gui<TItem> extends GuiLayoutAbstract<TItem> {

    private GuiApi<TItem> guiApi;
    private FcInventory<TItem> inventory;

    /**
     * Create a new GUI.
     *
     * @param guiApi The GUI API.
     * @param inventory The inventory representing this GUI.
     */
    public Gui(GuiApi<TItem> guiApi, FcInventory<TItem> inventory) {
        this.guiApi = guiApi;
        this.inventory = inventory;
    }

    @Override
    public int getWidth() {
        return inventory.getItemGrid().getWidth();
    }

    @Override
    public int getHeight() {
        return inventory.getItemGrid().getHeight();
    }
}
