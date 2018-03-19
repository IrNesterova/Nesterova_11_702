package ru.itis;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void run(ArrayList<ArrayList<Integer>> list, HeapSortEasy hs) {
        for (int i = 0; i < list.size(); i++) {
            int[] array = new int[list.get(i).size()];
            for (int j = 0; j < array.length; j++) {
                array[j] = list.get(i).get(j);
            }
            Long startTime = System.nanoTime();
            hs.heapSort(array);
            Long finishTime = System.nanoTime();
            Long resultTime = finishTime - startTime;
            System.out.println("Длина массива: " + array.length);
            System.out.println("Время выполнения: " + resultTime);
            System.out.println("Количество итераций: " + hs.getCount());

        }
    }

    public static void main(String[] args) throws IOException {
        Generator gn = new Generator();
        gn.generateAndWrite();
        HeapSortEasy hpe = new HeapSortEasy();
        Reader reader = new Reader();
        ArrayList<ArrayList<Integer>> list = reader.readAndTranslate();
        run(list, hpe);
    }
}
