import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Student{
    static final ArrayList<Student> students = new ArrayList<>();
    int id;
    String lastName, firstName;
    Degree degree;
    ArrayList<Address> addresses;
    ArrayList<Parent> parents;


    Student(int id, String lastName, String firstName){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    void setDegree(Degree degree){
        this.degree = degree;
    }

    void setAddresses(ArrayList<Address> addresses){
        this.addresses = addresses;
    }

    void setParents(ArrayList<Parent> parents){ this.parents = parents; }

    static void processStudents(){
        final String pathStudInfo = "studentData/StudInfo.csv";
        String rowStudent;
        BufferedReader br = Utils.createBuffer(pathStudInfo);

        try {
            while ((rowStudent = br.readLine())!= null){ // loop until current line in csv is not null
                String[] rowStudentSpecific = rowStudent.split(","); // split each like into an array per ","

                // student instance
                Student s = new Student(Integer.parseInt(
                        rowStudentSpecific[0]),
                        rowStudentSpecific[1].toUpperCase(),
                        rowStudentSpecific[2]);

                // degree instance
                Degree d = new Degree(rowStudentSpecific[3]);

                // store degree instance into student instance
                s.setDegree(d);

                Address a = new Address();

                a.processAddress();
                s.setAddresses(a.getAddresses());

                // processParent();

                // add student instance to list of students
                students.add(s);
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}

