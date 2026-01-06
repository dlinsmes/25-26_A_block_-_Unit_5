//a class is a blueprint for something you want to represent in a program

public class Car {

    //instance variables - characteristics that each
    //example of a car will have with different values

    //each car has a color, number of seats, number of doors;
    //etc
    //-but each specific car will potentially have a different
    //value for each of those variables


    //after today - all instance variables should be private

    int seats;
    int doors;
    private String brand;

    //for miles on a car - you can add miles to the odometer
    //but you shouldn't be able to subtract from that number
    //-private is a visibility modifier that only allows read and write
    //access within this class
    //-we don't want to allow other classes to modify this variable
    //in unintended ways (like subtracting from miles or making the value
    //negative)
    private int miles;

    private String color;


    //allow public access to read the private data
    //-accessor method aka getter aka get method
    //-return type matches the private variable's type
    //-method name is getVariable
    //-no params
    //-only method code is return variable
    public int getMiles() {
        return miles;
    }

    //public method to change the number of miles
    public void addMiles(int newMiles) {
        if (newMiles < 0)
            System.out.println("invalid - can't subtract miles");
        else
            miles += newMiles;
    }

    public String getColor() { return color; }

    //a car can only be: red, blue, black, white, pink

    //set methods aka setters aka mutator methods
    //allow you to change a private variable from a different
    //class

    //-void return
    //-typical naming is setVariable (addMiles() is also a mutator)
    //-param type that matches variable type
    //method body can contain controls for how the variable
    //is changed
    public void setColor(String newColor) {
        if (newColor.equals("red")) {
            color = newColor;
        }
        else if (newColor.equals("blue")) {
            color = newColor;
        }
        else if (newColor.equals("black")) {
            color = newColor;
        }
        else if (newColor.equals("white")) {
            color = newColor;
        }
        else if (newColor.equals("pink")) {
            color = newColor;
        }
        else {
            System.out.println("can't make your car " + newColor);
        }
    }

    public String getBrand() { return brand; }

    //set method where there are no checks on the new value
    //of the variable
    public void setBrand(String newBrand) {
        brand  = newBrand;
    }
}
