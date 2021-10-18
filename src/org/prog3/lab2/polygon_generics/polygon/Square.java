package org.prog3.lab2.polygon_generics.polygon;

public class Square extends Polygon {
    private float base;

    public Square(){

    }

    public Square(float base) {
        this.base = base;
        this.setNumVertices(4);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float getArea(){
        return base*base;
    }

    @Override
    public boolean equals(Polygon p){
        Square s;
        if(p instanceof Square) {
            s = (Square) p;
            return this.base == s.getBase();
        }
        else{
            return false;
        }
    }

    @Override
    public String[] describeAttributes(){
        return new String[]{"base"};
    }

    @Override
    public void setAttributes(float[] attr){
        this.setBase(attr[0]);
    }

    public float getPerimeter(){
        return base*4;
    }

    @Override
    public void print(){
        System.out.println("Square, base: "+this.base);
    }
}
