package nyc.c4q.reinardcox;
import java.util.HashSet;

/**
 * Created by shadowslimmedia on 4/2/15.
 */
public class Scratch
{
    public static void main(String[] args)
    {
        HashSet<Integer> odd = new HashSet<Integer>();
        odd.add(1);
        odd.add(3);
        odd.add(3);
        odd.add(57);

        HashSet<Integer> even = new HashSet<Integer>();
        even.add(4);
        even.add(10);
        even.add(50);

        odd.remove(57);

        HashSet<Integer> newOdd = new HashSet<Integer>(odd);

        for(Integer num : even)
        {
            System.out.println(num);
        }

        for(Integer num : odd)
        {
            System.out.println(num);
        }

        odd.addAll(even); // This combines the two list together.
        odd.removeAll(even); // Think of this as subtraction.


    }
}
