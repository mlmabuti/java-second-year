import java.io.BufferedReader;
import java.io.IOException;

class Address{
    Address[] addresses = new Address[2];
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

        int ctr = 0;
        try {
            while ((rowAddress= br.readLine()) != null) { // loop until current line in csv is not null
                String[] rowAddressSpecific = rowAddress.split(","); // split each like into an array per ","

                // only store into address object if the id matches the current student being processed
                if (id.equals(rowAddressSpecific[0])) {
                    // address instance
                    Address a = new Address(
                            rowAddressSpecific[2],
                            rowAddressSpecific[1]);

                    // add address instance to list of addresses
                    addresses[ctr] = a;
                    ctr++;
                }
            }
        } catch (IOException e) { System.out.println("Error: IOException"); }
    }

    String getAddressType(){
        // instead of returning the code ill just return the word
        return switch (this.addressType) {
            case "P" -> "Provincial";
            case "C" -> "City";
            default -> "Unidentified";
        };
    }

    Address[] getAddresses(){ return this.addresses; }

    String getLocation() { return this.location; }
}