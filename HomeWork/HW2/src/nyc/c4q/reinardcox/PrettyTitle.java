package nyc.c4q.reinardcox;

import java.util.ArrayList;

/**
 * Created by shadowslimmedia on 4/25/15.
 */
public class PrettyTitle {

    public static void main(String[] args) {
        printTitle("hello my peoples of lol");
    }

    public static void printTitle(String word) {
        ArrayList<String> list = new ArrayList<String>();
        String[] createList = word.split(" ");
        list.add(createList[0].toUpperCase().charAt(0) + createList[0].substring(1));
        for (int i = 1; i < createList.length; i++) {
            list.add(createList[i]);
        }
        String answer = "", underLine = "";
        for (String string : list) {
            if (string.equalsIgnoreCase("of")) {
                answer += string;
                answer += " ";
            } else {
                answer += string.toUpperCase().charAt(0) + string.substring(1);
                answer += " ";
            }
        }
        char c;
        for (int x = 0; x < answer.length(); x++) {
            c = answer.toLowerCase().charAt(x);
            if (c == ' ') {
                underLine += " ";
            } else {
                underLine += "@";
            }
        }
        System.out.println(answer);
        System.out.println(underLine);
    }
}
