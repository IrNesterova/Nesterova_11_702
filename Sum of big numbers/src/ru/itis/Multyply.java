package ru.itis;


import java.util.Arrays;

public class Multyply {
    public static int[] toArr(String num) {
        char[] numasCharArr = num.toCharArray();
        int[] numasIntArr = new int[numasCharArr.length];
        for (int i = 0; i < numasIntArr.length; i++) {
            numasIntArr[i] = numasCharArr[i] - '0';
        }
        return numasIntArr;
    }

    public static void multiply(int[] firstArray, int[] secondArray) {
        int length = firstArray.length + secondArray.length;
        int[]result = new int[length];
        int carry = 0;
            for (int i = secondArray.length - 1; i >=0; i --){
                for (int j = firstArray.length - 1; j >=0 ; j--){
                    int product = firstArray[i]*secondArray[j];
                    int answerPosition = i + j;
                    product += result[answerPosition];
                    product += carry;
                    result[answerPosition]= product%10;
                    carry = product / 10;
            }
        }
        if (result[length - 1]==0) result = Arrays.copyOf(result, length - 1);

        System.out.println("Произведение: ");
        for (int i = 0; i< result.length;i++){
            System.out.print(result[i]);
        }
    }
}

