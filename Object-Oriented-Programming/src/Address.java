import java.io.BufferedReader;
import java.io.IOException;

public class Address {
    static String getCityProvAddress(String[] addresses, String[] cityOrProv){
        String str = "", corp = "";
        for (int i = 0; i < addresses.length; i++){
            switch (cityOrProv[i]){
                case "C" : corp = "City"; break;
                case "P" : corp = "Provincial"; break;
            }
            str += corp + " address is " + addresses[i] + "\n";
        }
        return str;
    }
}
