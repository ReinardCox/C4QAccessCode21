package nyc.c4q.reinardcox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shadowslimmedia on 4/2/15.
 */
public class DistributionCalculator {

    public static ArrayList<Double> calculate(File textFile) throws FileNotFoundException {

        Scanner scanner = new Scanner(textFile); //You want to scan in the file.
        String word; //You need a place to store the file.

        int totalNumberOfLetters = 0; //To count the char

        ArrayList<Double> percentage = new ArrayList<Double>();

        HashMap<Character, Integer> percentageTable = new HashMap<Character, Integer>();

        percentageTable.put('a', 0);
        percentageTable.put('b', 0);
        percentageTable.put('c', 0);
        percentageTable.put('d', 0);
        percentageTable.put('e', 0);
        percentageTable.put('f', 0);
        percentageTable.put('g', 0);
        percentageTable.put('h', 0);
        percentageTable.put('i', 0);
        percentageTable.put('j', 0);
        percentageTable.put('k', 0);
        percentageTable.put('l', 0);
        percentageTable.put('m', 0);
        percentageTable.put('n', 0);
        percentageTable.put('o', 0);
        percentageTable.put('p', 0);
        percentageTable.put('q', 0);
        percentageTable.put('r', 0);
        percentageTable.put('s', 0);
        percentageTable.put('t', 0);
        percentageTable.put('u', 0);
        percentageTable.put('v', 0);
        percentageTable.put('w', 0);
        percentageTable.put('x', 0);
        percentageTable.put('y', 0);
        percentageTable.put('z', 0);

        while (scanner.hasNext()) {
            word = scanner.next();

            for (int i = 0; i < word.length(); i++) {
                char letter = word.toLowerCase().charAt(i);

                if (Character.isLetter(letter)) {
                    percentageTable.put(letter, percentageTable.get(letter) + 1);
                    totalNumberOfLetters++;
                }
            }
        }

        for (Integer numberOfCharacters : percentageTable.values()) {percentage.add((double) (numberOfCharacters * 100) / totalNumberOfLetters);
        }



        return percentage;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/shadowslimmedia/Documents/C4QAccessCode21/HomeWork/HW4/src/nyc/c4q/reinardcox/state of the union.txt");


        for (double list : calculate(file)) {
            System.out.println(list);
        }
    }
}
