public class Alien {

    private String name;
    private int arms;
    private boolean hungry;

    //constructor - method that creates an object
    // (a specific instance/example of the class)
    //-by default if you don't define your own constructor
    //then instance variable values will default to 0/null/false

    //constructor with a parameter for each instance variable
    //constructors should set initial values to all instance variables

    //defining your own constructor lets you more easily set initial
    //values when creating objects
    public Alien(String newName, int arms, boolean h) {
        name = newName;
        //when the param name is the same as the instance variable name,
        //use this. notation to refer to the instance variable
        this.arms = arms;

        //not necessary (but can be used) when the param is named differently
        this.hungry = h;
    }

    //can overload constructors with differing sets of parameters
    public Alien(String name) {
        this.name = name;

        //regardless of parameters, constructors should set initial
        //values for all instance variables
        arms = 2;
        hungry = false;
    }

    public String getName() { return name; }
    public int getArms() { return arms; }
    public boolean getHungry() { return hungry; }

    public void setName(String newName) {
        name = newName;
    }
    public void setArms(int newArms) {
        arms = newArms;
    }
    public void setHungry() {
        hungry = !hungry;
    }

    public void eat() {
        hungry = false;
        arms++;
    }

    //define this method to return a string
    //representation of your object for
    //printing from the client
    public String toString() {
        return "Alien name: " + name +
                "\narms: " + arms +
                "\nhungry: " + hungry;
    }
}
