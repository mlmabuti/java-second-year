import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Address{
    ArrayList<Address> addresses = new ArrayList<>();
    String location, addressType;

    Address() {}
    Address(String location, String addressType){
        this.location = location;
        this.addressType = addressType;
    }

    void processAddress(String id) {
        final String pathAddressInfo = "studentData/AddressInfo.csv";
        String rowAddress;
        BufferedReader br = Utils.createBuffer(pathAddressInfo);

        try {
            while ((rowAddress= br.readLine()) != null) { // loop until current line in csv is not null
                String[] rowAddressSpecific = rowAddress.split(","); // split each like into an array per ","

                // only if id matches
                if (id.equals(rowAddressSpecific[0])) {
                    // address instance
                    Address a = new Address(
                            rowAddressSpecific[2],
                            rowAddressSpecific[1]);

                    // add address instance to list of addresses
                    addresses.add(a);
                }
            }
        } catch (IOException e) { System.out.println("Error: IOException"); }
    }

    ArrayList<Address> getAddresses(){ return this.addresses; }

    String getAddressType(){
        switch(this.addressType){
            case "P" : return "Provincial";
            case "C" : return "City";
        }
        return "Unidentified";
    }

    String getLocation() { return this.location; }
}