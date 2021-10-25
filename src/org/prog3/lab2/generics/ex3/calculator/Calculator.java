package org.prog3.lab2.generics.ex3.calculator;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    //print a List of numerical elements
    public static void print(List<? extends Number> l){
        System.out.println(Arrays.toString(l.toArray()));
    }

    //return the sum of the numerical elements in a list
    public static Number sum(List<? extends Number> l){
        var result = 0.0;
        for (Number n : l)
            result += n.doubleValue();
        return result;
    }

    //return the maximum value among the numerical elements in a list
    public static Number max(List<? extends Number> l){
        var result = l.get(0);
        for(var number : l)
            if(number.doubleValue() > result.doubleValue())
                result = number.doubleValue();
        return result;
    }
}
