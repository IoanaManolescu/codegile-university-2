package com.codegile.university.ioana.week1.day1.problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NameSort {

    public void nameSortCount () {

        int count = 0;

        File file = new File("/Users/manolescusebastian/IdeaProjects/codegile-university-2/assets/names.txt");
        try {
            Scanner scanner = new Scanner(file);

            String line = "";

            while (scanner.hasNextLine()){
                line = scanner.nextLine();
            }

            //spilt names line into arrray
            String[] splitNamesByComma = line.split(",");

            //pattern that checks if name has numbers
            String regex = "(.)*(\\d)(.)*";
            Pattern pattern = Pattern.compile(regex);


            for (String name : splitNamesByComma) {

                //check if name has numbers
                boolean containsNumber = pattern.matcher(name).matches();

                String lowerCaseLetters = name.substring(1,name.length());
                boolean hasUpperCase = hasUpperCase(lowerCaseLetters);

                if (Character.isUpperCase(name.charAt(0)) && !containsNumber && !hasUpperCase){

                    count++;

                    System.out.println(name);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("Numarul de elemente care indeplinesc conditia: " + count);

    }

    private static boolean hasUpperCase(String name) {
        return !name.equals(name.toLowerCase());
    }

}
