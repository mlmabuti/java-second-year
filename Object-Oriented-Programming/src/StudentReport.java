/*
use constructors, add new csv data to test, refactor/shorten/simplify code, do something about null pointers
remove utils
object within an object might mean you should create address, degree, parent objects inside the student
use arraylist and pairs

NOTE: add public access modifier if ever this project needs to be used somewhere else.
      studFile instruction provides confusion, rowStudentSpecific seemed redundant it's been omitted.

      Address, Parent, and Student constructors have been created to make cleaner looking code.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class StudentReport {
    static final String pathStudInfo = "studentData/StudInfo.csv";
    static final String pathParentInfo = "studentData/ParentInfo.csv";
    static final String pathAddressInfo = "studentData/AddressInfo.csv";

    static final ArrayList<Student> students = new ArrayList<Student>();

    static BufferedReader createBuffer(String path){
        try {
            return new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e){
            System.out.println("FileNotFound Error");
            return null;
        }
    }

    static void studFile(){
        String rowStudent = "";

        BufferedReader br = createBuffer(pathStudInfo);
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

                // append student instance to list of students
                students.add(s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void printReport(ArrayList<Student> students) {
        for(Student s : students){
            System.out.println(s);
        }
    }


    public static void main(String[] args){
        studFile();
        printReport(students);
    }
}
