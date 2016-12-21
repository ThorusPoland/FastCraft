package net.benwoodworth.fastcraft.core.api.dependencies;

/**
 * Executes server tasks.
 */
public interface FcTaskScheduler {

    /**
     * Schedule a task to be run on the main server thread.
     *
     * @param task the task to run
     * @param delay the number of server ticks before the task is run. (20 ticks per second
     */
    void scheduleSync(Runnable task, long delay);

    /**
     * Schedule a task to be run asynchronously.
     *
     * @param task the task to run
     * @param delay the number of server ticks before the task is run. (20 ticks per second
     */
    void scheduleAsync(Runnable task, long delay);

    /**
     * Run a task on the main server thread.
     *
     * @param task the task to run
     */
    void runSync(Runnable task);

    /**
     * Run a task asynchronously.
     *
     * @param task the task to run
     */
    void runAsync(Runnable task);
}
