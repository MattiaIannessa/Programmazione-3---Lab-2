package org.prog3.lab2.polygon_generics.geometries;

import org.prog3.lab2.polygon_generics.polygon.Polygon;
import java.util.ArrayList;

public class Geometries {
    private ArrayList<Polygon> coll;

    public Geometries() {
        coll = new ArrayList<>();
    }

    public ArrayList<Polygon> getColl() {
        return coll;
    }

    //insert a Polygon in ArrayList coll, checking if it is already present
    public boolean insertPolygon(Polygon p){
        for (Polygon po:coll) {
            if(po.equals(p))
                return false;
        }
        return coll.add(p);
    }

    public void printGeometries(){
        int i=0;
        for (Polygon p:coll) {
            System.out.print(i+": ");
            p.print();
            i+=1;
        }
    }

    //counts how many polygons are present in the collection coll
    public int getNumElements(){
        return coll.size();
    }

    //prints all the polygon's areas
    public void printAreas(){
        int i=0;
        for (Polygon p:coll) {
            System.out.println(i+": "+p.getArea());
        }
    }
}