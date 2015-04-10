package nyc.c4q.reinardcox;

import java.util.Scanner;

/**
 * Created by shadowslimmedia on 4/5/15.
 */
public class TwentyQuestionsGame {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        double randomNumber = 100000 * Math.random();
        int fixedNumber = (int) randomNumber;

        int counter = 20;

        while (counter >= 1) {

            System.out.println("Enter a number:");
            System.out.print("> ");

            int guess = userInput.nextInt();

            if (guess < fixedNumber) {
                System.out.println("Too low");
                counter--;
                System.out.println("You have " + counter + " guess left.");
            } else if (guess > fixedNumber) {
                System.out.println("Too high.");
                counter--;
                System.out.println("You have " + counter + " guess left.");
            } else if (guess == fixedNumber) {
                System.out.println("You're right!");
                break;
            }
        }
    }
}
