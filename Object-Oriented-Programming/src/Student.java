import java.util.ArrayList;

public class Student {
    private int id;
    private String lastName, firstName, degreeCode;
    private ArrayList <Pair> parents = new ArrayList<Pair>(),
                             addresses = new ArrayList<Pair>();

    Student(int id, String lastName, String firstName, String degreeCode, ArrayList<Pair> parents, ArrayList<Pair> addresses){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.degreeCode = degreeCode;
        this.parents = parents;
        this.addresses = addresses;
    }

    Student(){ }

    void setAddresses(String address, String addressType){ this.addresses.add(new Pair(address, addressType)); }

    int getId(){ return this.id; }

    // String getMother(){ return this.mother;}

    // String getFather() {return this.father;}

    // String getGuardian() {return this.guardian;}

    String getLastName(){ return this.lastName; }

    String getFirstName(){ return this.firstName; }

    ArrayList <Pair> getAddresses(){ return this.addresses; }

    void getFormattedAddresses(){
        //for (int i = 0; i < this.addresses.size(); i++){
        //}
        System.out.println(this.addresses.get(0).addressType);
    }

    String getDegreeName() {
        // move outside later after creating constructor
        Degree degree = new Degree(this.degreeCode);
        return degree.getDegreeName();
    }
}
