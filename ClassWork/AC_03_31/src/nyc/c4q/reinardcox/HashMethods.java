package nyc.c4q.reinardcox;

/**
 * Created by shadowslimmedia on 3/31/15.
 */

import java.util.HashMap;

public class HashMethods {

    public static void main(String[] args) {

        HashMap<String, Integer> stock = new HashMap<String, Integer>();

        stock.put("basketball", 3);
        stock.put("running shoes", 4);
        stock.put("jumping rope", 2);
        stock.put("power bars", 15);


        stock.put("running shoes", 5);

        stock.size();
    }
}