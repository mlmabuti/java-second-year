public class Degree {
    private String degreeName, degreeCode;

    Degree(String degreeCode){
        this.degreeCode = degreeCode;
    }

    public String getDegreeName(){
        switch(this.degreeCode){
            case "BSCS" :
                this.degreeName = "BS Computer Science";
                return this.degreeName;
            case "BSECE" :
                this.degreeName = "BS Electronics Engineering";
                return this.degreeName;
            case "BSIE" :
                this.degreeName = "BS Industrial Engineering";
                return this.degreeName;
            case "BSCE" :
                this.degreeName = "BS Civil Engineering";
                return this.degreeName;
        }
        return "Invalid Code.";
    }
}
