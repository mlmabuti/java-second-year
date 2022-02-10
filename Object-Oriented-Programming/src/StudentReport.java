/*
use constructors, add new csv data to test, refactor/shorten/simplify code, do something about null pointers
remove utils
object within an object might mean you should create address, degree, parent objects inside the student
use arraylist and pairs

NOTE: add public access modifier if ever this project needs to be used somewhere else.
      rowStudentSpecific seemed redundant it's been omitted.
      Address, Parent, and Student constructors have been created to make cleaner looking code.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class StudentReport {
    static final String pathParentInfo = "studentData/ParentInfo.csv";
    static final String pathAddressInfo = "studentData/AddressInfo.csv";

    static final ArrayList<Student> students = new ArrayList<>();

    static void printReport() {
        for(Student s : StudentReport.students){

        }
    }

    public static void main(String[] args){
        Student.processStudents(students);
        printReport();
    }
}
