public class Degree {
    String degreeCode, degreeName;

    Degree(String degreeCode){
        this.degreeCode = degreeCode;
        this.degreeName = processDegreeName(degreeCode);
    }

    String processDegreeName(String degreeCode){
        switch(degreeCode){
            case "BSCS" : return "BS Computer Science";
            case "BSECE" : return "BS Electronics Engineering";
            case "BSIE" : return "BS Industrial Engineering";
            case "BSCE" : return "BS Civil Engineering";
        }
        return "Invalid Code.";
    }

    String getDegreeName(){ return this.degreeName;}
}
