import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class CSVImporter {
    public static ArrayList<String []> getData(String filename) {
        File f = new File(filename);
        ArrayList<String [] > data = new ArrayList<String []> ();

        //fixes the error in the Scanner line - the file might not be valid
        //-attempt to run the code in the try section and if any of it has problems
        //run the catch code instead
        try {
            Scanner s = new Scanner(f);

            //continue reading the file as long as there is more information
            while (s.hasNext()) {
                //save the current line to a String
                String line = s.nextLine();

                //split the row between every comma
                String[] row = line.split(",");

                data.add(row);
            }
        }
        catch (Exception e) {
            System.out.println("invalid file. no data imported");
        }

        return data;
    }
}
