import java.io.BufferedReader;
import java.io.FileReader;

// NOTE: use getters and setters, student report must have an array of objects,
// loop through each object and use getters/setters

public class StudentReport {
    public static void main(String[] args){
        String pathStudInfo = "studentData/StudInfo.csv";
        // String pathAddressInfo = "studentData/AddressInfo.csv";
        // String pathParentInfo = "studentData/ParentInfo.csv";
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathStudInfo));
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");
                System.out.println(values[0]);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
