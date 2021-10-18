package org.prog3.lab2.polygon_generics.polygon;

public abstract class Polygon {
    private int numVertices;

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumVertices(){
        return numVertices;
    }

    //Returns the polygon's area
    public abstract float getArea();

    //Returns true if two polygon are the same, otherwise returns false
    public abstract boolean equals(Polygon p);

    //Returns a String array containing the description of polygon's attributes
    public abstract String[] describeAttributes();

    //Get in input a float array that contains new attributes for the polygon
    public abstract void setAttributes(float[] attr);

    //Print of a polygon's info
    public abstract void print();
}
