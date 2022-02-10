import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Utils {
    // helper class
    static class Pair{
        String key, value;

        Pair(String key, String value){
            this.key = key;
            this.value = value;
        }
    }

    static BufferedReader createBuffer(String path){
        try {
            return new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e){
            System.out.println("FileNotFound Error");
            return null;
        }
    }
}
