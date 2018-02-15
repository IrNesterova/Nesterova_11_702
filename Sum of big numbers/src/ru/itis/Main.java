package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        Multyply.multiply(Multyply.toArr(n1), Multyply.toArr(n2));
        Sum.SumOfDigit(Sum.toArr(n1), Sum.toArr(n2));
    }
}
