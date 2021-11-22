package org.prog3.lab2.philosophers.model;

import java.util.Random;

import static java.lang.Thread.sleep;

/* A philosopher can only think and eat, using two chopsticks
 */
public class Philosopher implements Runnable {
    private final int ID;
    private final ChopStick leftChopStick;
    private final ChopStick rightChopStick;

    public Philosopher(int ID, ChopStick leftChopStick, ChopStick rightChopStick) {
        this.ID = ID;
        this.leftChopStick = leftChopStick;
        this.rightChopStick = rightChopStick;
    }

    /* Eating takes 1 to 3000 milliseconds, randomly
     */
    public void eat() throws InterruptedException {
        Random rnd = new Random();

        leftChopStick.takeChopStick();
        rightChopStick.takeChopStick();

        System.out.println("Philosopher "+ID+" eating");
        sleep(rnd.nextInt(3000));

        leftChopStick.releaseChopStick();
        rightChopStick.releaseChopStick();
    }

    /* Eating takes 1 to 10000 milliseconds, randomly
     */
    public void think() throws InterruptedException {
        Random rnd = new Random();
        System.out.println("Philosopher "+ID+" thinking");
        sleep(rnd.nextInt(10000));
    }

    /* Each philosopher think and eat for 1 to 5 times, randomly
     */
    @Override
    public void run() {
        Random rnd = new Random();
        int bound = rnd.nextInt(5);
        try{
            for(int i=0;i<bound;i++){
                this.think();
                this.eat();
            }
        }catch(Exception exc){
            exc.printStackTrace();
        }
    }
}
