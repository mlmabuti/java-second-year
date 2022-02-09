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

}
