package ru.itis;

public class SortOfSquare extends Shape{
    protected double a;
    protected double b;
    SortOfSquare(double s, double p, double a, double b){
        super (s, p);
        this.a = a;
        this.b = a;
    }
    public double squ(){;
    return a*b;
    }

}
