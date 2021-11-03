package org.prog3.lab2.observer_observable_pattern.demo;

import org.prog3.lab2.observer_observable_pattern.model.*;

/* This is a simple main used for testing working of the classes Counter, Filter, Visualizer
 */
public class Demo {

    public static void main(String[] args) {

        Visualizer v = new Visualizer();
        Filter f = new Filter(v);
        Counter c = new Counter();
        c.addObserver(f);
        f.addObserver(v);
        c.start();
    }
}