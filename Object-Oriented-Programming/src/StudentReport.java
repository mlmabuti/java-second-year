/*
NOTE: add public access modifiers if ever this project needs to be used somewhere else.
      Address, Parent, and Student constructors have been created to make cleaner looking code.
      did not deal with the possibility of readers to return NullPointerException
 */

class StudentReport {
    static void printReport() {
        for(Student s : Student.students){
            System.out.println(
                    "Student id is " + s.getId()
                            + "\nStudent name is "
                            + s.getLastName().toUpperCase() + ", "
                            + s.getFirstName()
                            + "\nStudying " + s.degree.getDegreeName()
                            + "\n" + s.getAddresses()
                            + s.getParents()
                            + "\n"
            );
        }
    }

    public static void main(String[] args){
        Student.processStudents();
        printReport();
    }
}
