import java.io.BufferedReader;
import java.io.FileReader;

public class StudentReport {
    public static void main(String[] args){
        String pathStudInfo = "studentData/StudInfo.csv";
        // String pathAddressInfo = "studentData/AddressInfo.csv";
        // String pathParentInfo = "studentData/ParentInfo.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathStudInfo));
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
