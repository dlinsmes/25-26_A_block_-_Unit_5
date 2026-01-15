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

    public String getName() {
        return name;
    }

    public void addCard(Card c) {
        //add a new object to the end of the hand list
        hand.add(c);
    }

    //blackjack scoring - 2-10 cards are worth their value
    //j, q, k are worth 10
    //ace is 1 or 11, whichever is more helpful for the player's score
    //goal - get as close to 21 as possible without going over
    public int getScore() {
        //loop through the hand arraylist
        int score = 0;
        int aces = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card current = hand.get(i);
            int val = current.getValue();
            if (val >= 2 && val <= 10)
                score += val;
            else if (val > 10)
                score += 10;
            else {
                //count how many aces you have to determine their
                //point values AFTER you determine the points of
                //the rest of the hand
                aces++;
            }
        }
        //calculate the point values of any aces in the hand
        if (aces >= 1) {
            //if you have more than one ace, all others should only
            //count as 1 point so that you stay under 21
            score += (aces-1);

            //determine whether the last ace should be counted as 11 or 1
            if (score + 11 > 21)
                score += 1;
            else
                score += 11;
        }

        return score;
    }

    public String toString() {
        return "Name: " + name + "\nScore: " + getScore() +
                "\n" + hand;
    }
}
