package org.prog3.lab2.kernel_module_pattern.test;

import org.prog3.lab2.kernel_module_pattern.kernel.*;
import org.prog3.lab2.kernel_module_pattern.module.*;

/* Simple application that tests SortableArray using a SortableArray of String
 */
public class StringSortableArrayTest {

    public static void main(String[]args){
        SortableArray<String> array = new SortableArray<>();
        array.addModule(new SortableListImpl<String>());

        array.add("first");
        array.add("second");
        array.add("third");
        array.add("fourth");
        array.add("fifth");

        System.out.println("---After add---");
        array.print();

        array.remove("fourth");

        System.out.println("---After remove---");
        array.print();

        array.sort();

        System.out.println("---After sort---");
        array.print();
    }



}
