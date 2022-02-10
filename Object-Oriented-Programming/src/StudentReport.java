/*
use constructors, add new csv data to test, refactor/shorten/simplify code, do something about null pointers
remove utils
object within an object might mean you should create address, degree, parent objects inside the student
use arraylist and pairs

NOTE: add public access modifier if ever this project needs to be used somewhere else.
      rowStudentSpecific seemed redundant it's been omitted.
      Address, Parent, and Student constructors have been created to make cleaner looking code.
      did not deal with the possibility of readers to return NullPointerException
 */

class StudentReport {
    static void printReport() {
        for(Student s : Student.students){

        }
    }

    public static void main(String[] args){
        Student.processStudents();
        printReport();
    }
}
