package ru.itis;

public class Shape {
    protected double s;
    protected double p;

    public Shape(double p, double s) {
        this.p = p;
        this.s = s;
    }

    protected double getP(){
        return p;
    }

    protected double getS(){
        return s;
    }

}
