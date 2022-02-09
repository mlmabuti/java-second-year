public class Degree {
    private String degreeCode;

    Degree(String degreeCode){
        this.degreeCode = degreeCode;
    }

    String getDegreeName(){
        switch(this.degreeCode){
            case "BSCS" : return "BS Computer Science";
            case "BSECE" : return "BS Electronics Engineering";
            case "BSIE" : return "BS Industrial Engineering";
            case "BSCE" : return "BS Civil Engineering";
        }
        return "Invalid Code.";
    }
}
