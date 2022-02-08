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
            while ((line = brStudent.readLine()) != null){
                String[] values = line.split(","); // split by comma
                students[ctr] = new Student(); // fill array with student objects

                students[ctr].setId(Integer.parseInt(values[0]));
                students[ctr].setLastName(values[1]);
                students[ctr].setFirstName(values[2]);
                students[ctr].setDegreeCode(values[3]);

                ctr++;
            }

            for(Student s : students){
                System.out.println(s.getId() + s.getFirstName()+ s.getLastName() + s.getDegreeCode());
            }

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
