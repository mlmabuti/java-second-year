// confusions: studfile? rowstudentspecific?

// use constructors, add new csv data to test, refactor/shorten/simplify code, do something about null pointers

import java.util.Objects;

public class StudentReport {

    private static void printReport(Student[] students){
        for(Student s : students){
            System.out.println("Student id is " + s.getId() +
                            "\nStudent name is " + s.getLastName().toUpperCase()+", "+s.getFirstName() +
                            "\nStudying " + s.getDegreeName() + "\n" +
                            Address.getCityProvAddress(s.getAddresses(),s.getCityOrProv()) +
                            Parent.getParentGuardian(new String[] {s.getMother(), s.getFather(), s.getGuardian()})
            );
        }
    }

    public static void main(String[] args){
        printReport(Objects.requireNonNull(Utils.setStudentData()));
    }
}
