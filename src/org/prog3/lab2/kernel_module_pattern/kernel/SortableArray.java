package org.prog3.lab2.kernel_module_pattern.kernel;

import org.prog3.lab2.kernel_module_pattern.module.SortableList;

/* Kernel
 */
public class SortableArray<T extends Comparable<T>> {
    /* Module to be used
     */
    private SortableList<T> module;

    /* Permits to add the module to use
     */
    public void addModule(SortableList<T> s){
        module = s;
    }

    /* Following methods invoke the equivalent methods of the module
     */
    public void add(T el) {
        module.add(el);
    }

    public void remove(T el) {
        module.remove(el);
    }

    public void sort() {
        module.sort();
    }

    public void print(){
        module.print();
    }
}
