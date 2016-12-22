package net.benwoodworth.fastcraft.core.api.gui.layouts;

/**
 * The layout of a GUI.
 * Layouts are composite, so they're made up of other layouts.
 *
 * @param <TItem> the native item type
 */
public class GuiLayoutBasic<TItem> extends GuiLayout {

    private int width, height;

    /**
     * Create a new GuiLayout.
     *
     * @param width the width of the layout
     * @param height the height of the layout
     */
    public GuiLayoutBasic(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Get the width of this layout.
     *
     * @return the width of this layout
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Get the height of this layout.
     *
     * @return the height of this layout
     */
    @Override
    public int getHeight() {
        return height;
    }
}
