package ru.itis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public ArrayList<ArrayList<Integer>> readAndTranslate() throws FileNotFoundException {
        File file = new File("C:\\Generate.txt");
        Scanner scanner = new Scanner(file);
        String c=scanner.next();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        while (scanner.hasNext()) {
            ArrayList <Integer> list = new ArrayList<>();
            while (!c.equals(".")) {
                if(!c.equals(".")) {
                    list.add(Integer.valueOf(c));
                }
                c = scanner.next();
            }
            if (scanner.hasNext())
                c = scanner.next();
            arrayLists.add(list);
        }
        return arrayLists;
    }
}

