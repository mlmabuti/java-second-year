import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Student{
    int id;
    String lastName, firstName;
    Degree degree;
    Address addresses;
    Parent parents;

    Student(int id, String lastName, String firstName){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    void setDegree(Degree degree){
        this.degree = degree;
    }

    static void processStudents(ArrayList<Student> students){
        final String pathStudInfo = "studentData/StudInfo.csv";

        String rowStudent;

        BufferedReader br = Utils.createBuffer(pathStudInfo);
        try {
            while ((rowStudent = br.readLine())!= null){ // loop until current line in csv is not null
                String[] values = rowStudent.split(","); // split each like into an array per ","

                // create student instance
                Student s = new Student(Integer.parseInt(
                        values[0]),
                        values[1].toUpperCase(),
                        values[2]);

                // create degree instance
                Degree d = new Degree(values[3]);

                // store degree instance into student instance
                s.setDegree(d);

                // processAddress();
                // processParent();

                // add student instance to list of students
                students.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

