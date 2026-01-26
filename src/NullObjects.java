public class NullObjects {
    public static void main(String [] args) {
        Deck d = new Deck();

        //loop through the deck and
        // print the rank of every card

        for (int i = 0; i < 52; i++) {
            Card c = d.draw();
            System.out.println(c.getRank());
        }

        Card c = d.draw();
        System.out.println(c);

        //check if the object is not null before
        //trying to call methods from it
        if (c != null) {
            //you cannot call methods from null objects
            String cRank = c.getRank();
            System.out.println(cRank);
        }

        //you cannot call methods from null objects
        String cRank = c.getRank();
        System.out.println(cRank);
    }

}
