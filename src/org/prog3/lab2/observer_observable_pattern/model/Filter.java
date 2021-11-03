package org.prog3.lab2.observer_observable_pattern.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* This class is Observer of Counter and Observable of Visualizer.
 * Using method update, class Filter gets the value of c (number generated by Counter) and adds it to list.
 * If the list size is a multiple of 2, it prints the list size and notify his Observer (in this case Visualizer).
 */

public class Filter extends Observable implements Observer {

    private final List<Integer> list;
    Visualizer visualizer;

    public Filter(Visualizer v) {
        visualizer = v;
        list = new ArrayList<>();
    }

    public List<Integer> getList() {
        return list;
    }

    public void update(Observable ob, Object extra_args){
        if(ob instanceof Counter){
            list.add(((Counter)ob).getC());
            if (list.size()%2==0) {
                System.out.println("lista size: " + list.size());
                setChanged();
                notifyObservers();
            }
        }

    }

}