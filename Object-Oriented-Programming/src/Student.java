import java.util.ArrayList;

public class Student {
    private int id; String lastName, firstName, degreeCode, father, mother, guardian;
    private ArrayList <Pair> addresses = new ArrayList<Pair>();

    // Student(int id, String lastName, String firstName, String[] parent){
    // CREATE PAIR FOR ADDRESSES and PARENTS
    // }

    void setId(int id){
        this.id = id;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setDegreeCode(String degreeCode) { this.degreeCode = degreeCode; }

    void setMother(String mother) {this.mother = mother;}

    void setFather(String father) {this.father = father;}

    void setGuardian(String guardian) {this.guardian = guardian;}

    void setAddresses(){
        return;
    }

    int getId(){ return this.id; }

    String getMother(){ return this.mother;}

    String getFather() {return this.father;}

    String getGuardian() {return this.guardian;}

    String getLastName(){
        return this.lastName;
    }

    String getFirstName(){
        return this.firstName;
    }

    //String[] getAddresses(){ return this.addresses; }

    //String[] getCityOrProv() {return this.cityOrProv;}

    String getDegreeName() {
        // move outside later after creating constructor
        Degree degree = new Degree(this.degreeCode);
        return degree.getDegreeName();
    }
}
