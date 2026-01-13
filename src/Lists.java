import java.util.ArrayList;

public class Lists {

    public static void main(String [] args) {

        //array - has a fixed length
        String [] words = new String [5];

        //ArrayLists - (like lists in CSP) -
        //size can change dynamically
        //-can add, remove, insert items into a list
        ArrayList<String> wordList = new ArrayList<String>();

        //add method puts a new object at the end of a list
        wordList.add("banana");
        wordList.add("potato");
        wordList.add("apple");

        //overloaded add() accepts an index to insert into a
        //specific position
        wordList.add(2, "orange");

        //set() used for replacing a value at a specific index
        wordList.set(0, "orange");

        //can output a list directly in a print statement
        System.out.println(wordList);

        //to access a specific value, use .get(index)
        //-don't use square brackets for arraylists
        System.out.println(wordList.get(1));

        //size() is how many values the list holds
        System.out.println(wordList.size());

        //for loop to iterate through the list
        // and print one value at a time
        for (int i = 0; i < wordList.size(); i++)
            System.out.println(wordList.get(i));


        System.out.println();

        //for each loops
        //(same as with arrays)
        for (String s: wordList)
            //s is the value, not the index
            System.out.println(s);

        //remove() accepts the index to remove an item from
        wordList.remove(1);
        System.out.println(wordList);

        wordList.add("arya");
        wordList.add("no");
        wordList.add("orange");
        wordList.add("orange");

        System.out.println(wordList);

        //remove all occurrences of orange from the list

        //this won't work bc indexing shifts automatically when
        //a value is added or removed
        // - when the orange at index 0 is removed, the orange that
        //was originally at index 1 is now at index 0
        //-meanwhile, i will increment to 1 so index 0
        // won't be checked again

//        for (int i = 0; i < wordList.size(); i++) {
//            if (wordList.get(i).equals("orange")) {
//                wordList.remove(i);
//            }
//        }

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals("orange")) {
                wordList.remove(i);
                //counteract the ++ in the for loop to keep i
                //at the same value for another iteration
                i--;
            }
        }

        System.out.println(wordList);

        wordList.add(0, "orange");
        wordList.add(0, "orange");
        wordList.add("orange");
        wordList.add("orange");

        //also works - iterate backwards so that other values'
        //indexing will not shift
        for (int i = wordList.size() - 1; i >= 0; i--) {
            if (wordList.get(i).equals("orange"))
                wordList.remove(i);
        }

        System.out.println(wordList);

        //remove() will return the value that gets taken out
        //of the list
        String s = wordList.remove(0);
        System.out.println(s);

        //ArrayLists cannot hold primitive types (int, double, boolean)
        //ArrayList<int> nums;

        //there are wrapper classes to represent the primitive
        //types as objects
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(6);


        //make a blackjackplayer object and give the player two cards
        BlackjackPlayer p1 = new BlackjackPlayer("moby dick");
        System.out.println(p1);

        Card c1 = new Card("spades", 1);

        p1.addCard(c1);

        Card c2 = new Card("diamonds", 5);
        p1.addCard(c2);

        System.out.println(p1);


    }
}
