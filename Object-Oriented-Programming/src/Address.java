public class Address {
    private String addressType, address;

    Address(String addressType, String address){
        this.address = address;
        this.addressType = addressType == "C" ? "City" : "Provincial";
    }
    void setAddress(String address){ this.address = address; }

    void setAddressType(String addressType){ this.addressType = addressType; }

    String getAddress(){ return this.address; }

    String getAddressType(){ return this.addressType; }
}
