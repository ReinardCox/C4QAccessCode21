import java.util.HashSet;

public class SocialNetwork
{

    public static void main(String[] args)
    {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Jamal");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Sebastian");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        System.out.println(allFriends(yours, mine));
        System.out.println(mutualFriends(yours, mine));
        System.out.println(justYourFriends(yours, mine));
        System.out.println(justMyFriends(yours, mine));
        System.out.println(exclusiveFriends(yours, mine));
        System.out.println(yourFriendsAreMine(yours, mine));
        System.out.println(youHaveFriends(yours));
        System.out.println( matchmaker(yours, mine) );
    }

    public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> combine = new HashSet<String>();
        combine.addAll(yours);
        combine.addAll(mine);
        return combine;
    }

    public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine)
    {

        HashSet<String> compareFriends = new HashSet<String>();

        for(String friend : yours)
        {
            if(mine.contains(friend))
            {
                compareFriends.add(friend);
            }
        }
        return compareFriends;
    }

    public static HashSet<String> justYourFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> bff = new HashSet<String>(yours); // creates a copy
        bff.removeAll(mine);

        return bff;
        // Yelena, Jamal
    }

    public static HashSet<String> justMyFriends(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<String> bff = new HashSet<String>(mine); // creates a copy
        bff.removeAll(yours);

        return bff;
        // Sebastian, Mala
    }

    public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine)
    {

        HashSet<String> group = new HashSet<String>(justMyFriends(yours, mine));
        group.addAll(justYourFriends(yours, mine));

        return group;

        // Yelena, Jamal, Sebastian, Mala
    }

    public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine)
    {

        return yours.containsAll(mine);

        // true if all your friends are also my friends
    }

    public static boolean youHaveFriends(HashSet<String> yours)
    {
        return ! yours.isEmpty();
        // true if you have any friends
    }

    public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine)
    {
        HashSet<HashSet<String>> combineTogether = new HashSet<HashSet<String>>();

        for(String friend : yours)
        {
            for(String friend2 : mine)
            {
                if(! friend.equals(friend2))
                {
                    HashSet<String> pair = new HashSet<String>();
                    pair.add(friend);
                    pair.add(friend2);
                    combineTogether.add(pair);
                }
            }
        }


        // should return these sets:

        // Jamal, Sebastian x
        // Jamal, Mala x
        // Jamal, Eve x

        // Yelena, Sebastian x
        // Yelena, Mala x
        // Yelena, Eve x

        // Sebastian, Eve x
        // Mala, Eve x

        return combineTogether;
    }
}
