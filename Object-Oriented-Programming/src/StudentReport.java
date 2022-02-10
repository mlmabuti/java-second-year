// confusions: studfile? rowstudentspecific?

// use constructors, add new csv data to test, refactor/shorten/simplify code, do something about null pointers
// remove utils
// object withing an object might mean you should create address, degree, parent objects inside the student
// use arraylist and pairs

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentReport {
    public static final String pathStudInfo = "studentData/StudInfo.csv";
    public static final String pathParentInfo = "studentData/ParentInfo.csv";
    public static final String pathAddressInfo = "studentData/AddressInfo.csv";

    public static BufferedReader createBuffer(String path){
        try {
            return new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e){
            System.out.println("FileNotFound Error");
            return null;
        }
    }

    private static void loadStudents(){

    }

    private static void printReport(ArrayList<Student> students){
        for(Student s : students){
            System.out.println("Student id is " + s.getId() +
                            "\nStudent name is " + s.getLastName().toUpperCase()+", "+s.getFirstName() +
                            "\nStudying " + s.getDegreeName() +
                            "\n"// + s.getFormattedAddresses() //+ s.getAddresses() + s.getCityOrProv()
                            //Address.getCityProvAddress(s.getAddresses(),s.getCityOrProv()) +
                            //Parent.getParentGuardian(new String[] {s.getMother(), s.getFather(), s.getGuardian()})
            );
            s.setAddresses("P", "San Carlos City");
            s.getFormattedAddresses();
        }
    }

    public static void main(String[] args){
        printReport(new ArrayList<Student>());
    }
}
