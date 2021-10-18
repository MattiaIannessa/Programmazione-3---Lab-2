package org.prog3.lab2.polygon_generics.polygon;

public class Triangle extends Polygon{
    private float base;
    private float height;

    public Triangle(){}

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
        this.setNumVertices(3);
    }

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getArea(){
        return base*height/2;
    }

    @Override
    public boolean equals(Polygon p){
        Triangle t;
        if(p instanceof Triangle) {
            t = (Triangle) p;
            return this.base == t.getBase() && this.height == t.getHeight();
        }
        else{
            return false;
        }
    }//end equals

    @Override
    public String[] describeAttributes(){
        return new String[]{"base","height"};
    }

    @Override
    public void setAttributes(float[] attr){
        this.setBase(attr[0]);
        this.setHeight(attr[1]);
    }

    @Override
    public void print(){
        System.out.println("Triangle, base: "+this.base+", height: "+this.height);
    }
}
