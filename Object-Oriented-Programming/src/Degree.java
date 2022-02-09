public class Degree {
    static String getDegreeName(String degreeCode){
        switch(degreeCode){
            case "BSCS" : return "BS Computer Science";
            case "BSECE" : return "BS Electronics Engineering";
            case "BSIE" : return "BS Industrial Engineering";
            case "BSCE" : return "BS Civil Engineering";
        }
        return "Invalid Code.";
    }
}
