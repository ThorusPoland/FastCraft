package net.benwoodworth.fastcraft.core.api.gui;

import net.benwoodworth.fastcraft.core.api.FastCraftApi;

/**
 * Created by bwoodworth on 12/13/2016.
 */
public class GuiApi<TItem> {

    private final FastCraftApi<TItem> fastCraftApi;

    public GuiApi(FastCraftApi<TItem> fastCraftApi) {
        this.fastCraftApi = fastCraftApi;
    }
}
