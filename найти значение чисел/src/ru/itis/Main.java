package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k = sc.nextInt();
        int pro = 1;
         while (number !=0) {
            number = number % k;
            pro *= number;
            number = number / k;
        }
        System.out.println(pro + " ");
    }
}
