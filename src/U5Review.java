import java.util.Scanner;
import java.util.ArrayList;

public class U5Review {

    public static void main(String [] args) {

        Number n1 = new Number();

        //when toString() isn't defined, printing an object will output its memory location
        System.out.println(n1);
        //it can still be called, but the behavior is to return mem loc
        System.out.println(n1.toString());

        System.out.println(n1.getValue());

        //assigning objects this way makes it so n1, n2, n3 are ALL the same object
        //(not separate copies)
        Number n2 = n1;
        Number n3 = n2;

        //when you change the value of one, they all change (bc they're all the same)
        n2.setValue(48);

        System.out.println("n1: " + n1.getValue());
        System.out.println("n2: " + n2.getValue());
        System.out.println("n3: " + n3.getValue());

        //same memory location - they're all the same object
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("n3: " + n3);

        //primitive data - int, double, boolean, (String)
        //assigned values are separate copies
        int i1 = -5;
        int i2 = i1;
        int i3 = i2;
        i2 = 48;
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);

        //construct a new (separate) object
        Number n4 = new Number(48);

        //check whether n1 and n4 are the same
        //this checks the memory location, NOT the value
        if (n1 == n4)
            System.out.println("same object");
        else
            System.out.println("different object");

        //check the values in the objects, not the mem loc
        if (n1.getValue() == n4.getValue())
            System.out.println("same value");
        else
            System.out.println("different value");

        int v = 0;
        change(v, n4);
        //primitive data won't get changed by methods
        //objects (including arrays) DO get changed by methods
        System.out.println("v: " + v);
        System.out.println("n4: " + n4.getValue());

        //objects - unless you call the constructor, then there can be multiple
        //references (var names) to the same object
        //prim data - make separate copies
        System.out.println();

        Number [] nums = new Number[2];

        //values in an object array will default to null
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //pick a random index [0,1] to add a new object with value [0,9]
        nums[ (int)(Math.random() * 2) ] = new Number( (int)(Math.random() * 10) );

        //find which position in the array that the object is in and print its value
        for (int i = 0; i < nums.length; i++) {
            System.out.print("index " + i + " - ");
            if ( nums[i] != null)
                System.out.println(nums[i].getValue());
            else
                System.out.println("null object");
        }

        //you cannot call a method from a null object
//        for (int i = 0; i < nums.length; i++)
//            System.out.println(nums[i].getValue());

        System.out.println();

        System.out.println(Number.fun);
        System.out.println(n1.fun);

        //since the method and fun vars are STATIC,
        // they can be called from the class and any of the
        //objects
        //-there is only one single shared value for the variable
        n1.addFun();
        Number.addFun();
        n4.addFun();

        System.out.println(Number.fun);

        //non-static - needs to be called through an instance/object
//        System.out.println(Number.getValue())
        System.out.println(n1.getValue());

        ArrayList<Number> numList = new ArrayList<Number>();
        numList.add(n1);
        numList.add(n2);
        numList.add(n3);
        //insert at the indicated index
        numList.add(1, n4);
        numList.add( new Number(500) );

        System.out.println();

        //for-each loops - n is the object, NOT an index
        for (Number n: numList)
            System.out.print(n.getValue() + "  ");
        System.out.println();

        //use a loop to remove all objects with value of 48
        //-CANNOT use a for-each loop to remove from a list

        //-NEED to know the version of remove() that accepts an index
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i).getValue() == 48) {
                numList.remove(i);
                //if you forget to subtract from i, some occurrences of 48
                //will get missed due to automatically shifting indices
                i--;
            }
        }
        //another solution - iterate backwards through the list
        // (don't need to adjust i after removing)

        for (Number n: numList)
            System.out.print(n.getValue() + "  ");
        System.out.println();
    }

    public static void change(int v, Number n) {
        v = 581;
        n.setValue(581);
    }

}
