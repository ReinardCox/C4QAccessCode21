package nyc.c4q.reinardcox;

import java.util.AbstractCollection;
import java.util.Scanner;

/**
 * Created by shadowslimmedia on 4/2/15.
 */
public class WebPageSanitizer {

    public static void main(String[] args) {
        System.out.println(sanitize("http://reinardcox.com"));

    }


    public static String sanitize(String html)
    {

        String webPage;

        webPage = HTTP.get(HTTP.stringToURL(html));
        Scanner scanner = new Scanner(webPage);

        boolean save = true;
        String clean = "", current;

        while(scanner.hasNext())
        {
            current = scanner.next();

            if(current.contains("<script"))
            {
                save = false;
            }

            if(current.contains("/script>"))
            {
                save = true;
                continue;
            }

            if(save)
            {
                clean += current;
            }

        }


        return clean;

    }
}
