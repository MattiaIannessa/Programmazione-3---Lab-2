package org.prog3.lab2.polygon_generics.geometriesUse;

import org.prog3.lab2.polygon_generics.geometries.Geometries;
import org.prog3.lab2.polygon_generics.polygon.*;
import java.util.Arrays;
import java.util.Scanner;

public class GeometriesUse {

    public static void main(String[]args){
        int resp;
        Scanner sc = new Scanner(System.in);
        Geometries geom = new Geometries();

        do{
            printMenu();
            resp = sc.nextInt();

            switch(resp){
                case 0: //exit
                    //do nothing
                    break;

                case 1: //square
                    Square sq = new Square();
                    System.out.println("Insert those attributes: "+ Arrays.toString(sq.describeAttributes()));
                    float[] attrs = new float[1];
                    attrs[0] = sc.nextFloat();
                    sq.setAttributes(attrs);
                    geom.insertPolygon(sq);
                    System.out.println("Square created");
                    break;

                case 5: //get area
                    geom.printGeometries();
                    System.out.println("Select a polygon: ");
                    
                    break;

                default:
                    System.out.println("Invalid action");
            }

        }while(resp!=0);
        System.out.println("Bye");

    }

    public static void printMenu(){
        System.out.println("****** Select an action ******");
        System.out.println("* 0.Exit                     *");
        System.out.println("* 1.Insert a square          *");
        System.out.println("* 2.Insert a rectangle       *");
        System.out.println("* 3.Insert a parallelogram   *");
        System.out.println("* 4.Insert a triangle        *");
        System.out.println("* 5.Get area                 *");
        System.out.println("******************************");
        System.out.print("> ");
    }
}
