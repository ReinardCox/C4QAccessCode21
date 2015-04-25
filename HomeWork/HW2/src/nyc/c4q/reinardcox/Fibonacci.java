package nyc.c4q.reinardcox;

import java.util.ArrayList;

/**
 * Created by shadowslimmedia on 4/6/15.
 */
public class Fibonacci {

    public static void main(String[] args) {

        fibonacciLoop(10);

    }


    public static int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        int fibo1=1, fibo2=1, fibonacci=1;

        for(int i= 3; i<= number; i++){

            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number

            fibo1 = fibo2;

            fibo2 = fibonacci;
            System.out.println(fibonacci);

        }

        System.out.println(fibonacci);
        return fibonacci; //Fibonacci number



    }
}

/*

The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
Write a program
which accepts as input as an integer N
and returns the N-th Fibonacci number.

To test whether your program returned the correct number, go to Wolfram Alpha,
and enter fibonacci(N) where N is your input integer

*/