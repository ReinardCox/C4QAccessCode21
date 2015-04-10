package nyc.c4q.reinardcox;

import java.util.ArrayList;

/**
 * Created by shadowslimmedia on 3/31/15.
 */
public class LinearSearch {

    public static void main(String[] args) {

        int num = 99;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(45);
        numbers.add(1);
        numbers.add(2);
        numbers.add(99);

        System.out.println("Your number is # " + searchList(numbers, num) + " on the list.");
    }

    public static int searchList (ArrayList aList, int x) {

        for (int i = 0; i < aList.size(); i++) {

            if (aList.get(i).equals(x)) {
                return i;
            }
        }
        return -1;
    }
}


/**
 * -- primitive type
 * int
 * boolean
 * double
 * char
 * byte
 * float
 * long
 * short
 *
 * -- define a method:
 * -- calling a method
 * --
 */



