package org.prog3.lab2.kernel_module_pattern.module;

import java.util.ArrayList;
import java.util.Collections;

/* This is a module: implements SortableList interface using an ArrayList
 */
public class SortableListImpl<T extends Comparable<T>> implements SortableList<T> {

    private final ArrayList<T> list;

    public SortableListImpl(){
         list = new ArrayList<>();
    }

    @Override
    public void add(T el) {
        list.add(el);
    }

    @Override
    public void remove(T el) {
        list.remove(el);
    }

    @Override
    public void sort() {
        Collections.sort(list);

        /* Alternative solution using lambda expression:
         * list.sort((o1, o2) -> {return o1.compareTo(o2);});
         *
         */
    }

    @Override
    public void print() {
        for (Object o:list) {
            System.out.println(o.toString());
        }
    }
}
