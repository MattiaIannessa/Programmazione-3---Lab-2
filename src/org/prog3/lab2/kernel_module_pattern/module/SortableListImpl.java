package org.prog3.lab2.kernel_module_pattern.module;

import org.prog3.lab2.kernel_module_pattern.kernel.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortableListImpl<T extends Comparable<T>> implements SortableList<T> {

    ArrayList<T> list = new ArrayList<>();

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
    }

    @Override
    public void print() {
        for (Object o:list) {
            System.out.println(o.toString());
        }
    }
}
