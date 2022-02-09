public class Student {
    private int id; String lastName, firstName, degreeCode, father, mother, guardian;
    private String[] addresses, cityOrProv;

    public void setId(int id){
        this.id = id;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public void setAddresses(String[] addresses, String[] cityOrProv){
        this.addresses = new String[addresses.length];
        this.cityOrProv = new String[cityOrProv.length];
        System.arraycopy(addresses, 0, this.addresses, 0, addresses.length);
        System.arraycopy(cityOrProv, 0, this.cityOrProv, 0, cityOrProv.length);

    }

    public int getId(){ return this.id; }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getDegreeCode() { return degreeCode; }

    public String[] getAddresses(){ return this.addresses; }

    public String getDegreeName() {
        Degree degree = new Degree(this.degreeCode);
        return degree.getDegreeName();
    }
}
