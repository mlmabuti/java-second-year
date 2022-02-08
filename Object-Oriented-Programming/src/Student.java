public class Student {
    int id; String lastName, firstName, degreeCode;

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
}
