import java.util.ArrayList;
class Pair{
    String key, value;

    Pair(String key, String value){
        this.key = key;
        this.value = value;
    }
}

class Student{
    int id;
    String lastName, firstName, degreeCode;
    ArrayList<Pair> address, parents;

    Student(int id, String lastName, String firstName, String degreeCode){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}