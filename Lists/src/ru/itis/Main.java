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
        System.out.println(pl1);
        System.out.println(pl.delete(4));
        System.out.println(pl1.combine());




    }
}


