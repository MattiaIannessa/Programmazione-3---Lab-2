package org.prog3.lab2.kernel_module_pattern.kernel;

public class SortableArray<T extends Comparable<T>> {
    SortableList<T> list;

    public void addModule(SortableList<T> s){
        list = s;
    }

    public void add(T el) {
        list.add(el);
    }

    public void remove(T el) {
        list.remove(el);
    }

    public void sort() {
        list.sort();
    }

    public void print(){
        list.print();
    }
}
