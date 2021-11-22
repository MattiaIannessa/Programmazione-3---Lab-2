package org.prog3.lab2.philosophers.model;

import java.util.concurrent.Semaphore;

/* A ChopStick is a semaphore that can be acquired or released
 */
public class ChopStick {

    private final Semaphore taken;

    public ChopStick() {
        this.taken = new Semaphore(1);
    }

    public void takeChopStick() throws InterruptedException {
        taken.acquire();
    }

    public void releaseChopStick(){
        taken.release();
    }
}
