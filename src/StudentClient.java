public class StudentClient {
    public static void main(String [] args) {
        //declare and instantiate (make an object of) a Student
        //the constructor call needs arguments that matches
        // how the constructor was defined
        Student s1 = new Student("michael", 3);

//        System.out.println(s1.name);
        System.out.println(s1.getName());

        //setGrade, get methods, toString()
        //are all instance methods - each object
        //gets its own separate copy of the method
        //that might run differently
        s1.setGrade(4);

        //call
        //Student.setGrade(4);

        System.out.println(s1);

        //id is an instance var - need to access
        //it from one specific object
        //System.out.println(Student.id);

        System.out.println(s1.id);

        //sequence is a static var - can access it
        //from the whole class
        System.out.println(Student.sequence);

        Student s2 = new Student ("nick", 1);
        System.out.println(s2);

        Student s3 = new Student("bob", 38);
        System.out.println(s3);

        //sequence was incremented every time a
        //new object was made
        System.out.println(Student.sequence);

        //we've never made a Math object -
        //the random() method gets called from the
        //Math class -- random() is a static method
        Math.random();

        //PI is a static variable from the Math class
        //(we've never needed to make a Math object)
        System.out.println(Math.PI);

        //print the onCampus status - call the static get method
        //from the class
        System.out.println(Student.getOnCampus());

        //call the static set method
        Student.setOnCampus(true);

        System.out.println(Student.getOnCampus());

        //setting the static variable for onCampus changes the value for
        //all of the objects
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        //since main() is always static, you can call
        //the main method of any other class in the project
        //AlienClient.main(args);


    }
}
