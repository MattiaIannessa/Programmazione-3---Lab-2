package org.prog3.lab2.observer_observable_pattern.model;

import java.util.Observable;
import java.util.Observer;

/* This class is the Observer of Filter. When it gets notified, it gets list from Filter and prints it.
 *
 */
public class Visualizer implements Observer {

    public void update(Observable ob, Object extra_args){
        if(ob instanceof Filter){
            for (Integer i : ((Filter)ob).getList()) {
                System.out.println(i.intValue());
            }
            System.out.println();
        }
    }
}