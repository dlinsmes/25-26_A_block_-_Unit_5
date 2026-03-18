public class Number {
    private int value;

    //static vars and methods are accessible and shared by the whole class and all
    //objects made from the class
    public static int fun = 67;
    public static void addFun() {fun++;}

    //non-static means that a var/method is different in each individual object/instance

    public int getValue() { return value; }
    public void setValue(int v) { value = v; }

    //if no constructor is defined, a default-no param constructor can be used
    //to instantiate objects. instance vars will default to 0, 0.0, null, false

    public Number() {
        //regardless of the number of params, a constructor should intialize all
        //instance variables
        value = -5;
    }

    public Number(int v) {
        value = v;
    }

}
