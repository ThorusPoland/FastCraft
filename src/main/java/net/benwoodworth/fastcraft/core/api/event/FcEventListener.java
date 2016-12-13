package net.benwoodworth.fastcraft.core.api.event;

import java.util.ArrayList;

/**
 * Listens to events, and notifies event handlers when events occur.
 */
public class FcEventListener<TEvent extends FcEvent<?>> {

    /**
     * This listener's event handlers.
     */
    private ArrayList<FcEventHandler<TEvent>> handlers = new ArrayList<>();

    /**
     * Raise an event.
     *
     * @param event The event to handle.
     */
    public void notifyHandlers(TEvent event) {
        handlers.forEach(handler -> handler.handleEvent(event));
    }

    /**
     * Add an event handler to this listener.
     *
     * @param handler The event handler to add to this event.
     */
    public void addHandler(FcEventHandler<TEvent> handler) {
        handlers.add(handler);
    }

    /**
     * Remove an event handler from this listener.
     *
     * @param handler The event handler to remove from this listener.
     */
    public void removeHandler(FcEventHandler<TEvent> handler) {
        handlers.remove(handler);
    }
}
