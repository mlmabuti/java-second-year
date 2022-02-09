public class Student {
    private int id; String lastName, firstName, degreeCode, father, mother, guardian;
    private String[] addresses;

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

    public void setAddresses(String[] addresses){
        this.addresses = new String[addresses.length];
        System.arraycopy(addresses, 0, this.addresses, 0, addresses.length);
    }

    public int getId(){
        return this.id;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public String[] getAddresses(String[] addresses){
        return this.addresses;
    }
}
