package nyc.c4q.reinardcox;

/**
 * Created by shadowslimmedia on 3/27/15.
 */
public class VotingSimulator {

    public static void main(String[] args) {

        Election election = new Election("The Best Mixtape DJ");

        Contender canidateOne = new Contender("DJ Shadow Slim");
        Contender canidateTwo = new Contender("DJ Keyz");
        Contender canidateThree = new Contender("Heather B Nyce");

        election.add(canidateOne);
        election.add(canidateTwo);
        election.add(canidateThree);

        ElectionManager mediator  = new ElectionManager();

        mediator.manage(election);
        mediator.initiatePolling();
        mediator.displayResults();

    }


}
