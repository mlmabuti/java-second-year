import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Utils {
    // helper class

    static BufferedReader createBuffer(String path){
        try {
            return new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e){
            System.out.println("FileNotFound Error");
            return null;
        }
    }
}
