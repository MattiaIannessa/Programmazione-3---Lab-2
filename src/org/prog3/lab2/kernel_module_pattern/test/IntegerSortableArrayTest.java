package org.prog3.lab2.kernel_module_pattern.test;

import org.prog3.lab2.kernel_module_pattern.kernel.SortableArray;
import org.prog3.lab2.kernel_module_pattern.module.SortableListImpl;

/* Simple application that tests SortableArray using a SortableArray of Integer
 */
public class IntegerSortableArrayTest {
    public static void main(String[]args){
        SortableArray<Integer> array = new SortableArray<>();
        array.addModule(new SortableListImpl<Integer>());

        array.add(45);
        array.add(4);
        array.add(78666);
        array.add(3);
        array.add(90);

        System.out.println("---After add---");
        array.print();

        array.remove(3);

        System.out.println("---After remove---");
        array.print();

        array.sort();

        System.out.println("---After sort---");
        array.print();
    }
}
