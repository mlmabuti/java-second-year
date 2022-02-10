import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Parent {
    String parentCode, parentName;
    Parent[] parents = new Parent[3];

    Parent(){ }
    Parent(String parentCode, String parentName){
        this.parentCode = parentCode;
        this.parentName = parentName;
    }

    void processParent(String id){
        final String pathParentInfo = "studentData/ParentInfo.csv";
        String rowParent;
        BufferedReader br = Utils.createBuffer(pathParentInfo);

        int ctr = 0;
        try {
            while ((rowParent = br.readLine()) != null){
                String[] rowParentSpecific = rowParent.split(",");

                // only store into parent object if the id matches the current student being processed
                if (id.equals(rowParentSpecific[0])) {
                    Parent p = new Parent(rowParentSpecific[1], rowParentSpecific[2]);
                    parents[ctr] = p;
                    ctr++;
                }
            }
        } catch (IOException e) { System.out.println("Error: IOException");}

    }

    String getParentCode(){
        // same with address, just return the word instead of the code
        return switch(this.parentCode){
            case "M" ->"Mother";
            case "F" -> "Father";
            case "G" -> "Guardian";
            default -> "Unidentified";
        };
    }

    String getParentName(){ return this.parentName; }

    Parent[] getParents(){ return this.parents; }
}
