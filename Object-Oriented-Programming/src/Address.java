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

    ArrayList<Address> getAddresses(){ return this.addresses; }

    void processAddress() {
        final String pathAddressInfo = "studentData/AddressInfo.csv";
        String rowAddress;
        BufferedReader br = Utils.createBuffer(pathAddressInfo);

        try {
            while ((rowAddress= br.readLine()) != null) { // loop until current line in csv is not null
                String[] rowAddressSpecific = rowAddress.split(","); // split each like into an array per ","

                // address instance
                Address a = new Address(
                        rowAddressSpecific[2],
                        rowAddressSpecific[1]);

                // add address instance to list of addresses
                addresses.add(a);

            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}