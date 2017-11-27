package com.codegile.university.ioana.week1.day1.problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberSort {


    public void sortNumbersFromFile() throws FileNotFoundException {

        String line = "";

        File file = new File("/Users/manolescusebastian/IdeaProjects/Ex_codegile/src/Numere.txt");
        Scanner scanner = new Scanner(file);

        try {
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }

            convertValues(line);

        } finally {
            scanner.close();
        }
    }


    private static void convertValues(String line) {

        int doubleCount = 0;
        int integerCount = 0;

        String[] splitNumbersByComma = line.split(",");

        for (String number : splitNumbersByComma) {
            if (number.contains(".")) {
                doubleCount++;
            } else {
                integerCount++;
            }
        }

        System.out.println("Double count value:" + doubleCount);
        System.out.println("Integer count value:" + integerCount);
    }

}
