package nyc.c4q.reinardcox;

import java.util.Scanner;

/**
 * Created by shadowslimmedia on 3/30/15.
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Please enter your first name: ");
        System.out.print("> ");
        String fName, lName;

        Scanner userInput = new Scanner(System.in);

        fName = userInput.nextLine();

        System.out.println("Then enter your last name: ");
        System.out.print("> ");

        lName = userInput.nextLine();

        System.out.println("Hello " + fName + " I see that your last name is " + lName );
    }

}
