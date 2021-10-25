package org.prog3.lab2.generics.ex3.demo;

import java.util.*;
import static org.prog3.lab2.generics.ex3.calculator.Calculator.*;

public class CalculatorDemo {
    public static void main(String[]args){
        ArrayList<Integer> int_list = new ArrayList<>();
        ArrayList<Double> double_list = new ArrayList<>();


        Random rand = new Random();
        for(int i=0;i<25;i++)
            int_list.add(rand.nextInt((100-1) + 1) + 1);

        for(int i=0;i<25;i++)
            double_list.add(rand.nextDouble((100-1) + 1) + 1);

        print(int_list);
        print(double_list);

        System.out.println("Integer sum: " + sum(int_list));
        System.out.println("Double sum: " + sum(double_list));

        System.out.println("Integer max: " + max(int_list));
        System.out.println("Double max: " + max(double_list));
    }
}
