public class AlienClient {
    public static void main(String [] args) {

        //when you define a constructor in a class, the default
        //no parameter constructor is no longer available to use
//        Alien a1 = new Alien();

        //when you call a constructor (or any method), make sure the value
        //passed match the defined parameters
        Alien a1 = new Alien("zach", 5, true);



        //private variable - can't access from here
//        a1.name = "zach";
//        a1.setName("zach");
//        a1.setArms(5);
//        a1.setHungry();

        System.out.println(a1.getName());

        Alien a2 = new Alien("silly");
        //this alien will have 2 arms according
        // to the constructor that gets called

        //by default, printing an object will output its memory location
        //once you define toString in a class, that method gets implicitly called
        //when you print the object
        System.out.println(a1);

        //int array of length 6
        int [] nums = new int [6];

        //alien array of length 4
        Alien [] aliens = new Alien [4];

        //the above line makes space for 4 aliens,
        // but there aren't any objects saved to the array yet
        System.out.println(aliens[0]);

        System.out.println();

        aliens[0] = a1;
        aliens[1] = a2;
        //can call the constructor(s) and save directly into the array
        aliens[2] = new Alien("george");
        aliens[3] = new Alien("david", 0, true);

        //use a loop to print each of the array's object names

        for (int i = 0; i < aliens.length; i++) {
            //this prints the toString() of each alien object
            //System.out.println(aliens[i]);

            //call the getName() method from each of the objects in the array
            System.out.println(aliens[i].getName());
        }

        //for each loop to print each object's arm number
        for (Alien a : aliens) {
            //a will iterate through each object - don't use a as an index
            System.out.println(a.getArms());
        }

    }
}
