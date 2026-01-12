public class Student {

    //instance vars - every object will have these
    //vars but with different values
    private String name;
    private int grade;

    int id;

    //a student's id should be a unique identifier that
    //is different from one student to the next
    static int sequence = 0;

    private static boolean onCampus = false;

    //methods can also be static
    public static boolean getOnCampus() {
        return onCampus;
    }

    public static void setOnCampus(boolean status) {
        onCampus = status;
    }

    //static means the variable or method belongs to
    //the whole class rather than one specific object

    //-need to keep track of sequence number

    //constructor - used for making objects of this class
    public Student (String name, int g) {
        //constructor should initialize all instance vars

        //this keyword to differentiate between instance var
        //and the param
        this.name = name;

        //this keyword is only necessary when the param has
        //the same name as the instance var
        grade = g;

        //even though there are only 2 params, a constructor
        //should initialize values for ALL instance vars

        //every time the constructor
        //gets called to make a new object,
        //the sequence number increments
        sequence++;

        //the instance var id will get assigned
        //the current sequence number
        id = sequence;
    }

    //get methods aka accessors
    //return type matches the var type
    public String getName() {
        return name;
    }

    public int getGrade() { return grade; }
    public int getID() { return id; }

    //mutator methods (set method) - used for changing private vars
    //-typically void return with a param that matches the
    //variable type
    public void setGrade(int newGrade) {
        //can include logic to validate new value before setting
        grade = newGrade;
    }

    //gets called when you print an object
    //so that you don't output the memory location
    public String toString() {
        return "name: " + name + ", grade: "
                + grade + ", id: " + id +
                "on campus: " + onCampus;
    }
}
