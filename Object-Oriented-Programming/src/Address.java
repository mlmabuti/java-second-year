public class Address {
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
