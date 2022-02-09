public class Student {
    private int id; String lastName, firstName, degreeCode, father, mother, guardian;
    private String[] addresses, cityOrProv;

    void setId(int id){
        this.id = id;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    void setAddresses(String[] addresses, String[] cityOrProv){
        this.addresses = new String[addresses.length];
        this.cityOrProv = new String[cityOrProv.length];
        System.arraycopy(addresses, 0, this.addresses, 0, addresses.length);
        System.arraycopy(cityOrProv, 0, this.cityOrProv, 0, cityOrProv.length);
    }

    int getId(){ return this.id; }

    String getLastName(){
        return this.lastName;
    }

    String getFirstName(){
        return this.firstName;
    }

    String[] getAddresses(){ return this.addresses; }

    String[] getCityOrProv() {return this.cityOrProv;}

    String getDegreeName() { return this.degreeCode; }
}
