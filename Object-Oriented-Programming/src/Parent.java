public class Parent {
    static String getParentGuardian(String[] parentGuardian){
        String str = "";
        if (parentGuardian[0] != "") {
            str += "Mother's name is " + parentGuardian[0] + "\n";
        }
        if (parentGuardian[1] != ""){
            str += "Father's name is " + parentGuardian[1] + "\n";
        }
        if (parentGuardian[2] != ""){
            str += "Guardian's name is " + parentGuardian[2] + "\n";
        }
        return str;
    }
}
