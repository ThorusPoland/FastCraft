package net.benwoodworth.fastcraft.core.api.gui.layouts;

/**
 * The layout of a GUI.
 * Layouts are composite, so they're made up of other layouts.
 *
 * @param <TItem> The native item type.
 */
public class GuiLayoutBasic<TItem> extends GuiLayout {

    private int width, height;

    /**
     * Create a new GuiLayout.
     *
     * @param width The width of the layout.
     * @param height The height of the layout.
     */
    public GuiLayoutBasic(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Get the width of this layout.
     *
     * @return Returns the width of this layout.
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Get the height of this layout.
     *
     * @return Returns the height of this layout.
     */
    @Override
    public int getHeight() {
        return height;
    }
}
