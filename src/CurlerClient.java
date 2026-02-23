import java.util.ArrayList;
public class CurlerClient {
    public static void main(String [] args) {

        Curler c = new Curler("jay grteafas", 10, 10.3);
        System.out.println(c);

        ArrayList<String[]> curlerData = CSVImporter.getData("Curler Data.csv");

        //want the data from row 4 (String array), then the name from index (col) 0
        System.out.println(curlerData.get(4)[0]);


        //int weight = curlerData.get(4)[1];

        //turn a string into an int
        int point = Integer.parseInt( curlerData.get(4)[1] );
        System.out.println(point);

        //turn a string into a double
        double weight = Double.parseDouble( curlerData.get(3)[2] );

        //make a curler object from each row in the data using a loop

        //skip the label row - not intended to be parsed into an object
        curlerData.remove(0);

        for (int i = 0; i < curlerData.size(); i++) {
            Curler c2 = new Curler( curlerData.get(i)[0], Integer.parseInt(curlerData.get(i)[1]), Double.parseDouble(curlerData.get(i)[2]));
            System.out.println(c2);

            //same thing but with steps separated
            String [] row = curlerData.get(i);
            String n = row[0];
            int p = Integer.parseInt(row[1]);
            double w = Double.parseDouble(row[2]);
            Curler c3 = new Curler(n, p, w);
        }

    }
}
