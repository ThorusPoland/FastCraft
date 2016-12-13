package net.benwoodworth.fastcraft.core.api.dependencies.event;

import org.jetbrains.annotations.NotNull;

/**
 * Created by bwoodworth on 12/13/2016.
 */
public interface FcEventWrapper<TBase> {

    /**
     * The base of this event.
     */
    @NotNull
    TBase getBaseEvent();
}
