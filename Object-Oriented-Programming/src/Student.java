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
    String lastName, firstName;
    Degree degree;
    ArrayList<Pair> address, parents;

    Student(int id, String lastName, String firstName){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    void setDegree(Degree degree){
        this.degree = degree;
    }
}