import utils.Utils;

import java.io.BufferedReader;
import java.util.Arrays;

// NOTE: use getters and setters, student report must have an array of objects,
// loop through each object and use getters/setters
public class StudentReport {

    public static void main(String[] args){
        utils.Utils.countStudents();

        Student[] students = new Student[utils.Utils.studentCounter];
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
                    students[ctr].setAddresses(utils.Utils.listAddresses(students[ctr].getId()));

                    ctr++;
                }
            }

            for(Student s : students){
                System.out.println("Student id is " + s.getId() +
                                    " Student name is" + s.getLastName().toUpperCase()+s.getFirstName()
                                    //"Studying " + __convertToCourse__ s.getDegreeCode() +
                                    //__city__ + "address is" + Arrays.toString(s.getAddresses())); +
                                    //__prov__ + "address is" + __address__ +
                                    //"Mother's name is " + __mother__ +
                                    //"Father's name is " + __father__ +
                                    //"Guardian's name is " + __guardian__;
                );
            }

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
