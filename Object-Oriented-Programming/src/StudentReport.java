// confusions: studfile? rowstudentspecific?

// todo: setup address city or prov, mother, father, guardian. only print if the fields exist

import java.util.Objects;

public class StudentReport {

    private static void printReport(Student[] students){
        for(Student s : students){
            System.out.println("Student id is " + s.getId() +
                            "\nStudent name is " + s.getLastName().toUpperCase()+", "+s.getFirstName() +
                            "\nStudying " + s.getDegreeName() + "\n" +
                            Address.getCityProvAddress(s.getAddresses(),s.getCityOrProv()) +
                    //"Mother's name is " + __mother__ +
                    //"Father's name is " + __father__ +
                    //"Guardian's name is " + __guardian__;
                    "\n"
            );
        }
    }

    public static void main(String[] args){
        printReport(Objects.requireNonNull(Utils.setStudentData()));
    }
}
