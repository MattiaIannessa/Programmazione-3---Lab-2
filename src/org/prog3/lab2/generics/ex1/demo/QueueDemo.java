package org.prog3.lab2.generics.ex1.demo;
import org.prog3.lab2.generics.ex1.model.Queue;

import java.util.ArrayList;

public class QueueDemo {

    public static void main(String[]args){
        //create a double queue that uses an ArrayList
        Queue<Double> qd = new Queue<>(new ArrayList<Double>());

        System.out.println("qd empty: "+qd.empty());
        qd.enqueue(7.0);
        qd.enqueue(9.4);
        System.out.println("qd empty: "+qd.empty());
        System.out.println("qd enqueue: "+qd.dequeue());
        System.out.println("qd enqueue: "+qd.dequeue());
        System.out.println("qd empty: "+qd.empty());

    }
}