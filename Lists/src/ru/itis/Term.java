package ru.itis;

public class Term {
    public int coeff;
    public int degree;
    public Term(int coeff, int degree){
        this.coeff = coeff;
        this.degree = degree;
    }

    @Override
    public String toString() {
        if (degree == 0){
            return coeff + "";
        } else if (degree == 1){
            return coeff + "x";
        } else {
            return coeff + "x^" + degree;
        }
    }
}
