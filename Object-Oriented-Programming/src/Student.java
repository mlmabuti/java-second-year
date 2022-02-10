import java.util.ArrayList;

class Pair {
    private final String k, v;

    public Pair(String k, String v)
    {
        this.k = k;
        this.v = v;
    }

    String getKey() {return this.k;}

    String getValue() {return this.v;}
}

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

    void setAddresses(String addressType, String address){ this.addresses.add(new Pair(addressType, address));}

    void setParents(String parentCode, String parent){ this.parents.add(new Pair(parentCode, parent));}

    int getId(){ return this.id; }

    String getLastName(){ return this.lastName; }

    String getFirstName(){ return this.firstName; }

    ArrayList <Pair> getAddresses(){ return this.addresses; }

    void getFormattedAddresses(){
        //for (int i = 0; i < this.addresses.size(); i++){
        //}
        System.out.println(this.addresses.get(0));
    }

    String getDegreeName() {
        // move outside later after creating constructor
        Degree degree = new Degree(this.degreeCode);
        return degree.getDegreeName();
    }
}
