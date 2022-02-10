class Address{
    String location, addressType, address;

    Address(String location, String addressType){
        this.location = location;
        this.addressType = addressType;
    }

    void proccessAddress(){
        this.address = "C".equals(addressType) ? "City" : "Provincial";
    }
}