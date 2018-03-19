package ru.itis;

import java.io.*;
import java.util.Random;

public class Generator {
    Random random = new Random();
    FileWriter output = null;

    public void generateAndWrite() throws IOException {
        try {
            output = new FileWriter("C:\\Generate.txt");
            int countOfArrays = random.nextInt(5) + 1;
            int sizeOfArrays = 0;
            for (int j = 0; j < countOfArrays; j++) {
                sizeOfArrays = random.nextInt(100) + 1;
                for (int i = 0; i < sizeOfArrays; i++) {
                    output.append(Integer.valueOf(random.nextInt(10000)).toString() + " ");
                }
                output.append(".");
                output.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
