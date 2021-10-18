package org.prog3.lab2.polygon_generics.polygon;

public class Rectangle extends Polygon{
    private float base;
    private float height;

    public Rectangle(){}

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
        this.setNumVertices(4);
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
        return base*height;
    }

    @Override
    public boolean equals(Polygon p){
        Rectangle r;
        if(p instanceof Rectangle) {
            r = (Rectangle) p;
            return this.base == r.getBase() && this.height == r.getHeight();
        }
        else{
            return false;
        }
    }

    @Override
    public String[] describeAttributes(){
        return new String[]{"base","height"};
    }

    @Override
    public void setAttributes(float[] attr){
        this.setBase(attr[0]);
        this.setHeight(attr[1]);
    }

    public float getPerimeter(){
        return (base+height)*2;
    }

    @Override
    public void print(){
        System.out.println("Rectangle, base: "+this.base+", height: "+this.height);
    }
}
