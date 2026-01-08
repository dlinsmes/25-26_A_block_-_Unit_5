public class Deck {

    private Card [] cards;
    private int top;

    public Deck() {
        top = 0;

        cards = new Card[52];
        int count = 0;

        String [] suits = {"spades", "diamonds", "hearts", "clubs"};
        for (int i = 0; i < suits.length; i++) {
            //1-13 for card values
            for (int j = 1; j <= 13; j++) {
                Card c = new Card(suits[i], j);
                //save each object into a different position in the array
                cards[count] = c;
                count++;
            }
        }
    }

    //toString - return all of the individual card object toStrings
    public String toString() {
        String output = "";
        for (int i = 0; i < cards.length; i++) {
            output += cards[i].toString() + "\n";
        }
        return output;
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int r = (int)(Math.random() * cards.length);

            //temp needs to match the array type
            Card temp = cards[r];
            cards[r] = cards[i];
            cards[i] = temp;
        }
    }

    //draw a card from the deck
    public Card draw() {
        if (top < 52) {
            Card drawn = cards[top];
            top++;
            return drawn;
        }
        //only want to return a card if top is still a valid index
        return null;
    }
}
