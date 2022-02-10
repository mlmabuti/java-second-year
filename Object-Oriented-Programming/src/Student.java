import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Student{
    static final ArrayList<Student> students = new ArrayList<>();
    int id;
    String lastName, firstName;
    Degree degree;
    ArrayList<Address> addresses;
    ArrayList<Parent> parents;

    Student(int id, String lastName, String firstName){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    static void processStudents(){
        final String pathStudInfo = "studentData/StudInfo.csv";
        String rowStudent;
        BufferedReader br = Utils.createBuffer(pathStudInfo);

        try {
            while ((rowStudent = br.readLine())!= null){ // loop until current line in csv is not null
                String[] rowStudentSpecific = rowStudent.split(","); // split each like into an array per ","

                // student instance
                Student s = new Student(Integer.parseInt(
                        rowStudentSpecific[0]),
                        rowStudentSpecific[1].toUpperCase(),
                        rowStudentSpecific[2]);

                // degree instance
                Degree d = new Degree(rowStudentSpecific[3]);

                // store degree instance into student instance
                s.setDegree(d);

                // create address and store list of addresses into student
                Address a = new Address();
                a.processAddress(rowStudentSpecific[0]);
                s.setAddresses(a.getAddresses());

                //create parent and store list of parents into student
                Parent p = new Parent();
                p.processParent(rowStudentSpecific[0]);
                s.setParents(p.getParents());

                // add student instance to list of students
                students.add(s);
            }
        } catch (IOException e) { System.out.println("Error: IOException"); }
    }

    String getAddresses(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.addresses.size() && this.addresses.get(i) != null; i++){
            str.append(addresses.get(i).getAddressType())
                    .append(" address is ")
                    .append(addresses.get(i).getLocation())
                    .append("\n");
        }
        return str.toString();
    }

    String getParents(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.parents.size() && this.parents.get(i) != null; i++){
            str.append(parents.get(i).getParentCode())
                    .append("'s name is ")
                    .append(parents.get(i).getParentName());
        }
        return str.toString();
    }

    String getId() { return this.id+""; }

    String getLastName() { return this.lastName; }

    String getFirstName() { return this.firstName; }

    void setDegree(Degree degree){ this.degree = degree; }

    void setAddresses(ArrayList<Address> addresses){ this.addresses = addresses; }

    void setParents(ArrayList<Parent> parents){ this.parents = parents; }
}

