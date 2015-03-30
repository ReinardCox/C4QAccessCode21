package nyc.c4q.reinardcox;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shadowslimmedia on 3/27/15.
 */
public class StringAndLoops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word:  ");
        String word = input.nextLine();
        System.out.println(uniqueCharacters(word));
    }


    public static String uniqueCharacters(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (!newWord.contains(word.substring(i, i + 1))) {
                newWord += word.charAt(i);
            } else {
                System.out.println(i);
            }
        }
        return newWord;
    }
}

/**
 *
 * Recap: Strings and loops
 * 1. Write a function uniqueCharacters
 * 2. which accepts as input a string S.
 * 3. Given the string S return a string S2
 * 4. which contains all the distinct characters in S.
 * 5. The input string will only contain lowercase characters.
 * 6. The ordering of characters in the output string does not matter. Eg.
 *
 * abbcaabcaa --> abc
 * apple --> aple or aepl
 * microsoft --> microsft
 */

