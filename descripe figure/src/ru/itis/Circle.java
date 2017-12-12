package ru.itis;

public class Circle extends Shape {
    protected double r;
    protected double l;

    public Circle(double p, double s, double l, double r) {
        super(p, s);
        this.l = l;
        this.r = r;
    }

    public double getR(){
        return p;
    }

    public double getS(){
        return s;
    }


}

