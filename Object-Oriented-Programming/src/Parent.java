import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Parent {
    String parentCode, parentName;
    ArrayList<Parent> parents = new ArrayList<>();

    Parent(){ }
    Parent(String parentCode, String parentName){
        this.parentCode = parentCode;
        this.parentName = parentName;
    }

    ArrayList<Parent> getParents(){ return this.parents; }

    void processParent(){
        final String pathParentInfo = "studentData/ParentInfo.csv";
        String rowParent;
        BufferedReader br = Utils.createBuffer(pathParentInfo);

        try {
            while ((rowParent = br.readLine()) != null){
                String[] rowParentSpecific = rowParent.split(",");
                Parent p = new Parent(rowParentSpecific[1], rowParentSpecific[2]);
                parents.add(p);
            }
        } catch (IOException e) { System.out.println("Error: IOException");}

    }

}
