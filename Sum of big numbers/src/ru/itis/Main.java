package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        System.out.println("Произведение ");
        Multyply.multiply(Multyply.toArr(n1), Multyply.toArr(n2));
        System.out.println("");
        System.out.println("Сложение");
        Sum.SumOfDigit(Sum.toArr(n1), Sum.toArr(n2));
    }
}
