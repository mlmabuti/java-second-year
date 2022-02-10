class Parent {
    String parentCode, parentName, parent;

    Parent(String parentCode, String parentName, String parent){
        this.parentCode = parentCode;
        this.parentName = parentName;

    }

    void proccessParent(){
        switch(parentCode){
            case "M" : this.parent = "Mother"; break;
            case "F" : this.parent = "Father"; break;
            case "G" : this.parent = "Guardian"; break;
        }
    }

}
