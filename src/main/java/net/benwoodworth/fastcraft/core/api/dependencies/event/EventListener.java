package net.benwoodworth.fastcraft.core.api.dependencies.event;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Listens to events, and notifies event handlers when events occur.
 *
 * @param <TEvent> the type of event being listened for
 */
public class EventListener<TEvent> {

    /**
     * This listener's event handlers.
     */
    @NotNull
    private ArrayList<Consumer<TEvent>> handlers = new ArrayList<>();

    /**
     * Raise an event.
     *
     * @param event the event to handle
     */
    public void notifyHandlers(@NotNull TEvent event) {
        handlers.forEach(handler -> handler.accept(event));
    }

    /**
     * Add an event handler to this listener.
     *
     * @param handler the event handler to add to this event
     */
    public void addHandler(@NotNull Consumer<TEvent> handler) {
        handlers.add(handler);
    }

    /**
     * Remove an event handler from this listener.
     *
     * @param handler the event handler to remove from this listener
     */
    public void removeHandler(@NotNull Consumer<TEvent> handler) {
        handlers.remove(handler);
    }
}
