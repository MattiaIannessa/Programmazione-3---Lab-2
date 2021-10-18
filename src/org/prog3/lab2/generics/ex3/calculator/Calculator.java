package org.prog3.lab2.generics.ex3.calculator;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    public static void print(List l){
        System.out.println(Arrays.toString(l.toArray()));
    }

    public static double sum(List l){
        double result=0;
        for(int i=0;i<l.size();i++)
            result+=(double)l.get(i);
        return result;
    }
}

//ESERCIZIO INCOMPLETO -------------------------------------------------------------------------------------------------