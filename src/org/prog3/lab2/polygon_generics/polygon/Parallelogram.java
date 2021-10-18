package org.prog3.lab2.polygon_generics.polygon;


public class Parallelogram extends Polygon {

    private float base;
    private float height;

    public Parallelogram(){}

    public Parallelogram(float base, float height) {
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
        Parallelogram pa;

        if(p instanceof Parallelogram) {
            pa = (Parallelogram) p;
            return this.base == pa.getBase() && this.height == pa.getHeight();
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
        System.out.println("Parallelogram, base: "+this.base+", height: "+this.height);
    }
}
