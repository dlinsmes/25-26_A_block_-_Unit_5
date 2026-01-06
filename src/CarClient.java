public class CarClient {

    public static void main(String [] args) {

        //declare an object (one specific instance)
        //of type Car
        Car c1 = new Car();

//        c1.color = "red";
        c1.setColor("red");
        c1.seats = 4;
        c1.doors = 2;
//        c1.brand = "tesla";
        c1.setBrand("tesla");
        //c1.miles = 1000000;
        //use the public method that lets us change the car's miles
        c1.addMiles(1000000);

        c1.addMiles(100);

        //this line doesn't cause functional issues - it gets handled
        //by the addMiles() method
        c1.addMiles(-10);

        //since miles is a private variable, you can't read/write
        //to its value
//        System.out.println(c1.brand + " " + c1.miles);

        //use the public accessor method to read the value of miles
        System.out.println(c1.getBrand() + " " + c1.getMiles());


        //a different Car object with different
        //values for its instance variables;
        Car c2 = new Car();
//        c2.color = "black";
        c2.setColor("black");
        c2.seats = 11;
        c2.doors = 1;
        c2.setBrand("arya");
        //c2.miles = 7;

        //System.out.println(c2.brand + " " + c2.miles);
        System.out.println(c2.getBrand() + " " + c2.getMiles());


        c2.setColor("green");

        System.out.println(c2.getColor());

    }

}
