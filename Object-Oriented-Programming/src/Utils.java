import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

// UTILITY FUNCTIONS
public class Utils {
    public static int studentCount = 0;
    public static final String pathStudInfo = "studentData/StudInfo.csv";
    public static final String pathParentInfo = "studentData/ParentInfo.csv";

    public static BufferedReader createBuffer(String path){
        try {
            return new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e){
            System.out.println("FileNotFound Error");
            return null;
        }
    }

    public static void countStudents(){
        // for each line in the csv
        int ctr = 0;
        BufferedReader br = createBuffer(pathStudInfo);
        // count students by unique id
        try {
            if (br != null) { // to avoid null pointer
                while (br.readLine() != null){
                    ctr += 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        studentCount = ctr;
    }



    public static String[] listParentGuardian(int id){
        String line, mother ="", father="", guardian="";

        try {
            BufferedReader br = Utils.createBuffer(pathParentInfo);
            if (br != null) { // to avoid null pointer
                // to append addresses into addresses array
                br = Utils.createBuffer(pathParentInfo);

                if (br != null) {
                    while ((line = br.readLine()) != null){
                        String[] values = line.split(","); // split by comma
                        if (id == Integer.parseInt(values[0])){
                            switch (values[1]){
                                case "M" : mother = values[2]; break;
                                case "F" : father = values[2]; break;
                                case "G" : guardian = values[2]; break;
                            }

                        }
                    }
                }
                return new String[]{mother, father, guardian};
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Student[] setStudentData(){
        Utils.countStudents(); // to set a value for studentCount

        Student[] students = new Student[Utils.studentCount];
        // set student's data
        try {
            String line;
            BufferedReader br = Utils.createBuffer(Utils.pathStudInfo);
            int ctr = 0;
            if (br != null) { // prevent null pointer
                while ((line = br.readLine()) != null){
                    String[] values = line.split(","); // split by comma
                    students[ctr] = new Student(); // fill array with student objects
                    // set student data
                    students[ctr].setId(Integer.parseInt(values[0]));
                    students[ctr].setLastName(values[1]);
                    students[ctr].setFirstName(values[2]);
                    students[ctr].setDegreeCode(values[3]);
                    students[ctr].setAddresses(Objects.requireNonNull(
                                    Address.listAddresses(Integer.parseInt(values[0])))[0],
                            Objects.requireNonNull(Address.listAddresses(Integer.parseInt(values[0])))[1]
                    ); // require non null 2d arr
                    students[ctr].setMother(listParentGuardian(Integer.parseInt(values[0]))[0]);
                    students[ctr].setFather(listParentGuardian(Integer.parseInt(values[0]))[1]);
                    students[ctr].setGuardian(listParentGuardian(Integer.parseInt(values[0]))[2]);
                    ctr++;
                }
            } else {
                System.out.println("Buffered Reader is null.");
            }
            return students;

        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
