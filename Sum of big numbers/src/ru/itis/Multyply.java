package ru.itis;


import java.util.Arrays;

public class Multyply {
    public static int[] toArr(String num) {
        char[] numasCharArr = num.toCharArray();
        int[] numasIntArr = new int[numasCharArr.length];
        for (int i = 0; i < numasIntArr.length; i++) {
            numasIntArr[i] = numasCharArr[i] - '0';
        }
        for (int i = 0; i < numasIntArr.length; i++) {
            int temp = numasIntArr[i];
            numasIntArr[i] = numasIntArr[numasIntArr.length - i - 1];
            numasIntArr[numasIntArr.length - i - 1] = temp;
        }
        return numasIntArr;
    }

    public static void multiply(int[] firstArray, int[] secondArray) {
        int length = firstArray.length + secondArray.length;
        int[]result = new int[length];
        for (int i = 0; i < firstArray.length; i ++){
            int carry = 0;
                for (int j = 0; j <secondArray.length; j ++){
                    int product = firstArray[i]*secondArray[j];
                    int answerPosition =  i + j;
                    product +=result[answerPosition];
                    product +=carry;
                    result[answerPosition]= product%10;
                    carry = product / 10;
            }
        }
        if (result[length - 1]==0){
            result = Arrays.copyOf(result,  length-1);
        }
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = temp;
        }
        for (int i = 0; i < result.length; i ++){
            System.out.print(result[i]);
        }
    }
}

