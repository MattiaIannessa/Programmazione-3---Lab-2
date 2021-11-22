package org.prog3.lab2.thread.model;

/* Simple class containing a counter that will be incremented by threads.
 */

public class ActivityCounter {
    private int activityCounter;

    public ActivityCounter(int activityCounter) {
        this.activityCounter = activityCounter;
    }

    public synchronized void incr(){
        activityCounter++;
        System.out.println("counter incremented to "+activityCounter);
    }
}
