public class Card {

    private String suit;
    private String rank;
    private int value;

    public Card(String suit, int value) {
        //this.suit is the instance variable
        this.suit = suit;
        this.value = value;
        if (value == 1)
            rank = "Ace";
        else if (value == 11)
            rank = "Jack";
        else if (value == 12)
            rank = "Queen";
        else if (value == 13)
            rank = "King";
        else
            rank = "" + value;
    }

    public String getSuit() { return suit;}
    public String getRank() { return rank;}
    public int getValue() { return value;}

    public String toString() {
        return rank + " of " + suit;
    }
}
