import utils.Utils;

import java.io.BufferedReader;
import java.util.Objects;

// NOTE: use getters and setters, student report must have an array of objects,
// loop through each object and use getters/setters

// confusions: studfile? rowstudentspecific?

public class StudentReport {

    public static void printReport(Student[] students){
        for(Student s : students){
            System.out.println("Student id is " + s.getId() +
                            "\nStudent name is " + s.getLastName().toUpperCase()+", "+s.getFirstName() +
                    "\nStudying " + s.getDegreeName()
                    //__city__ + "address is" + Arrays.toString(s.getAddresses())); +
                    //__prov__ + "address is" + __address__ +
                    //"Mother's name is " + __mother__ +
                    //"Father's name is " + __father__ +
                    //"Guardian's name is " + __guardian__;
                    + "\n"
            );
        }
    }

    public static void main(String[] args){
        utils.Utils.countStudents(); // to set a value for studentCount

        Student[] students = new Student[utils.Utils.studentCount];
        // set student's data
        try {
            String line;
            BufferedReader brStudent = utils.Utils.createBuffer(utils.Utils.pathStudInfo);
            int ctr = 0;
            if (brStudent != null) { // prevent null pointer
                while ((line = brStudent.readLine()) != null){
                    String[] values = line.split(","); // split by comma
                    students[ctr] = new Student(); // fill array with student objects

                    // set student data
                    students[ctr].setId(Integer.parseInt(values[0]));
                    students[ctr].setLastName(values[1]);
                    students[ctr].setFirstName(values[2]);
                    students[ctr].setDegreeCode(values[3]);
                    students[ctr].setAddresses(Objects.requireNonNull(
                            Utils.listAddresses(students[ctr].getId()))); // require non null list
                    ctr++;
                }
            } else {
                System.out.println("Buffered Reader is null.");
            }
            printReport(students);

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
