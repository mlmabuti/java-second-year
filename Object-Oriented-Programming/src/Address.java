import java.io.BufferedReader;
import java.io.IOException;

public class Address {
    public static final String pathAddressInfo = "studentData/AddressInfo.csv";

    public static String[][] listAddresses(int id){
        String line; // for each line in the csv
        int ctr = 0;

        try {
            BufferedReader br = Utils.createBuffer(pathAddressInfo);
            if (br != null) { // to avoid null pointer
                // to count addresses by duplicate ids
                while ((line = br.readLine()) != null){
                    String[] values = line.split(","); // split by comma
                    if (id == Integer.parseInt(values[0])){ // count by duplicated ids
                        ctr++;
                    }
                }
                // to append addresses into addresses array
                String[] addresses = new String[ctr];
                String[] cityOrProv = new String[ctr];
                ctr = 0;
                br = Utils.createBuffer(pathAddressInfo);

                if (br != null) {
                    while ((line = br.readLine()) != null){
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

    static String getCityProvAddress(String[] addresses, String[] cityOrProv){
        StringBuilder str = new StringBuilder();
        String corp = "";
        for (int i = 0; i < addresses.length; i++){
            switch (cityOrProv[i]){
                case "C" : corp = "City"; break;
                case "P" : corp = "Provincial"; break;
            }
            str.append(corp).append(" address is ").append(addresses[i]).append("\n");
        }
        return str.toString();
    }
}
