package org.prog3.lab2.thread.demo;

import org.prog3.lab2.thread.model.ActivityCounter;
import org.prog3.lab2.thread.model.MyThread;
import java.util.ArrayList;

/* Main: creation of ActivityCounter and Threads.
 *       Start of the Threads.
 */
public class ThreadDemo {

    public static void main(String[]args){
        ActivityCounter counter = new ActivityCounter(0);
        ArrayList<Thread> waitingList = new ArrayList<>();
        ArrayList<Thread> threadList = new ArrayList<>();


        /* Action 0. It waits no one, it sleeps 5 seconds long.
         */
        Thread action0 = new Thread(new MyThread(0,waitingList, 5000, counter));
        threadList.add(action0);
        waitingList.add(action0);

        /* Action 1. It waits action 1, it sleeps 15 seconds long.
         */
        Thread action1 = new Thread(new MyThread(1,waitingList, 15000, counter));
        threadList.add(action1);

        /* Action 2. It waits action 1, it sleeps 5 seconds long.
         */
        Thread action2 = new Thread(new MyThread(2,waitingList,5000, counter));
        threadList.add(action2);

        /* Action 3. It waits action 1, it sleeps 10 seconds long.
         */
        Thread action3 = new Thread(new MyThread(3,waitingList, 10000, counter));
        threadList.add(action3);

        waitingList.clear();
        waitingList.add(action1);
        waitingList.add(action2);
        waitingList.add(action3);

        /* Action 4. It waits action 1, 2, 3, it sleeps 4 seconds long.
         */
        Thread action4 = new Thread(new MyThread(4,waitingList, 4000, counter));
        threadList.add(action4);

        waitingList.clear();
        waitingList.add(action4);
        /* Action 5. It waits action 4, it sleeps 3 seconds long.
         */
        Thread action5;
        for(int i=0;i<5;i++){
            action5 = new Thread(new MyThread(5,waitingList, 3000, counter));
            threadList.add(action5);
        }

        /* Threads start and wait
         */
        for(Thread t:threadList){
            t.start();
            try{
                t.join();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("MAIN FINISHED");
    }
}
