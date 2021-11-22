package org.prog3.lab2.thread.model;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

/* Definition of threads that will increment the counter in ActivityCounter
 */
public class MyThread implements Runnable{
    //threads to be waited
    private final ArrayList<Thread> list;
    private final int threadNumber;
    private final int timeToSleep;
    private final ActivityCounter counter;

    public MyThread(int threadNumber, ArrayList<Thread> list, int timeToSleep, ActivityCounter counter){
        this.threadNumber = threadNumber;
        this.list = new ArrayList<>(list);
        this.timeToSleep = timeToSleep;
        this.counter = counter;
    }

    @Override
    public void run() {

        if(!list.isEmpty())
            for(Thread t:list){
                try{
                    t.join();
                }catch(Exception exc){
                    exc.printStackTrace();
                }
            }
        System.out.println("Thread "+threadNumber+" started");

        try {
            sleep(timeToSleep);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
        counter.incr();

        System.out.println("Thread "+threadNumber+" finished");

    }
}
