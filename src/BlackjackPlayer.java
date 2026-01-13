import java.util.ArrayList;

public class BlackjackPlayer {

    private String name;
    private ArrayList<Card> hand;

    public BlackjackPlayer(String name) {
        this.name = name;

        //important - need to construct the arraylist
        //object in order to add values
        hand = new ArrayList<Card> ();
    }

    public void addCard(Card c) {
        //add a new object to the end of the hand list
        hand.add(c);
    }

    public int getScore() {
        return 0;
    }

    public String toString() {
        return "Name: " + name + " Score: " + getScore() +
                "\n" + hand;
    }
}
