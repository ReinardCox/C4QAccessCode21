package nyc.c4q.reinardcox;

/**
 * Created by shadowslimmedia on 3/27/15.
 */
public class VotingSimulator {

    public static void main(String[] args) {

        System.out.println("Would you like to create an Election?");




        Election music = new Election("DJS");

        Contender con1 = new Contender("John");
        Contender con2 = new Contender("Mike");

        music.add(con1);
        music.add(con2);

        ElectionManager manager = new ElectionManager();

        manager.manage(music);

        manager.initiatePolling();

        manager.displayResults();




    }


}
