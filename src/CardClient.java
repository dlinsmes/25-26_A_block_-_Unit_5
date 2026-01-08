public class CardClient {
    public static void main(String [] args) {
        Card c1 = new Card("Hearts", 11);
        System.out.println(c1);
        System.out.println();

        Deck d = new Deck();
        System.out.println(d);

        d.shuffle();
        System.out.println();

        System.out.println(d);

        //draw 5 cards from the shuffled deck
        // and print them out

        for (int i = 0; i < 5; i++) {
            Card newCard = d.draw();
            System.out.println(newCard);
        }
    }
}
