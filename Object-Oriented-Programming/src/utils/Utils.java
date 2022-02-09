package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    public static int studentCount = 0;
    public static final String pathStudInfo = "studentData/StudInfo.csv";
    public static final String pathParentInfo = "studentData/ParentInfo.csv";

    public static BufferedReader createBuffer(String path){
        try {
            return new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e){
            System.out.println("FileNotFound Error");
            return null;
        }
    }

    public static void countStudents(){
        // for each line in the csv
        int ctr = 0;
        BufferedReader brCount = createBuffer(pathStudInfo);
        // count students by unique id
        try {
            if (brCount != null) { // to avoid null pointer
                while (brCount.readLine() != null){
                    ctr += 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        studentCount = ctr;
    }
    public static final String pathAddressInfo = "studentData/AddressInfo.csv";

    public static String[][] listAddresses(int id){
        String line = ""; // for each line in the csv
        int ctr = 0;
        try {
            BufferedReader brCount = utils.Utils.createBuffer(pathAddressInfo);
            if (brCount != null) { // to avoid null pointer
                // to count addresses by duplicate ids
                while ((line = brCount.readLine()) != null){
                    String[] values = line.split(","); // split by comma
                    if (id == Integer.parseInt(values[0])){ // count by duplicated ids
                        ctr++;
                    }
                }
                // to append addresses into addresses array
                String[] addresses = new String[ctr];
                String[] cityOrProv = new String[ctr];
                ctr = 0;
                brCount = utils.Utils.createBuffer(pathAddressInfo);

                if (brCount != null) {
                    while ((line = brCount.readLine()) != null){
                        String[] values = line.split(","); // split by comma
                        if (id == Integer.parseInt(values[0])){
                            addresses[ctr] = values[2];
                            cityOrProv[ctr] = values[1];
                            ctr++;
                        }
                    }
                }
                return new String[][]{addresses, cityOrProv};
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
