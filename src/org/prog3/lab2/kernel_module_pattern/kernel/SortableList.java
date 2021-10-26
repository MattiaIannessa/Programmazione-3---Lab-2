package org.prog3.lab2.kernel_module_pattern.kernel;

public interface SortableList<T extends Comparable<T>> {

    void add(T el);

    void remove(T el);

    void sort();

    void print();
}
