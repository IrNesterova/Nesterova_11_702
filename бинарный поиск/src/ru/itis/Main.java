package ru.itis;
import java.util.Scanner;

public class Main {
    public static void bubblesort(int array[]){
        for (int i=0;i<array.length;i++){
            for (int j = 0; j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int array[] = new int[n];
	for (int i = 0; i<array.length;i++) {
        array[i] = sc.nextInt();
    }

    bubblesort(array);


    for (int i = 0; i<array.length;i++){
        System.out.println(array[i] + " ");
    }

    }
}
