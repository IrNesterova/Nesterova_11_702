package ru.itis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C://Poly.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("C://Poly1.txt"));
        Polynomial pl = new Polynomial(br);
        Polynomial pl1 = new Polynomial(br1);
        System.out.println(pl1.evaluate(3));
        System.out.println(pl.evaluate(2));
        System.out.println(pl);
        System.out.println(pl.derivate());
        System.out.println(pl.deleteOdd());
        pl.delete(3);
    }
}


