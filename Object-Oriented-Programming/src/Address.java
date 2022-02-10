public class Address {
    String addressType, address;

    Address(String addressType, String address){
        this.address = address;
        this.addressType = addressType == "C" ? "City" : "Provincial";
    }

    String getAddress(){ return this.address; }

    String getAddressType(){ return this.addressType; }

   // static String getCityProvAddress(String[] addresses, String[] cityOrProv){
   //     StringBuilder str = new StringBuilder();
   //     String corp = "";
   //     for (int i = 0; i < addresses.length; i++){
   //         switch (cityOrProv[i]){
   //             case "C" : corp = "City"; break;
   //             case "P" : corp = "Provincial"; break;
   //         }
   //         str.append(corp).append(" address is ").append(addresses[i]).append("\n");
   //     }
   //     return str.toString();
   // }
}
