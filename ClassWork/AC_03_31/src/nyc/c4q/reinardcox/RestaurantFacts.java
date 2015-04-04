package nyc.c4q.reinardcox;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Access Code 2.1
 *
 * Author  <YOUR NAME>
 * Date    March 2015
 */

public class RestaurantFacts {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> lines = FileParser.getLines("/Users/shadowslimmedia/Documents/C4QAccessCode21/ClassWork/AC_03_31/src/nyc/c4q/reinardcox/nyc-restaurants-small.csv.txt", 14);

        HashMap<String,String> restaurants = new HashMap<String, String>();

        for (ArrayList<String> line : lines) {

        }




        // Step 1. Use FileParser's static method getLines() to get a nested
        //         ArrayList representing the CSV file.
        //
        //         For now, use "nyc-restaurants-small.csv".
        //
        //         Use a parameter to specify which column you're interested
        //         in. For now, use the int 14, which will give you the
        //         restaurant's grade.

        // Step 2. Build a HashMap named "restaurants".
        //         Loop over every line and add the appropriate data to your
        //         HashMap.

        // Step 3. Create a Scanner and prompt the user for a restaurant.
        //         If the restaurant has a relevant fact, print it. Otherwise
        //         print "Restaurant not found.".
    }
}