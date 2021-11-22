package org.prog3.lab2.philosophers.demo;

import org.prog3.lab2.philosophers.model.ChopStick;
import org.prog3.lab2.philosophers.model.Philosopher;

import java.util.ArrayList;

public class PhilosophersDemo {
    public static void main(String[]args){

        final int n = 10;
        // ArrayList containing philosophers
        ArrayList<Runnable> philosophers = new ArrayList<>();

        // ArrayList containing chopsticks
        ArrayList<ChopStick> chopsticks = new ArrayList<>();

        // Creation of n chopsticks
        for(int i=0;i<n;i++){
            chopsticks.add(new ChopStick());
        }

        // Creation of philosophers and allocation of chopsticks
        int i = 0;
        for(;i<n-1;i++){
            philosophers.add( new Philosopher(i, chopsticks.get(i), chopsticks.get(i+1)) );
        }
        philosophers.add( new Philosopher(i, chopsticks.get(i), chopsticks.get(i-1)) );

        for(Runnable p:philosophers){
            new Thread(p).start();
        }

    }
}
