class Degree {
    String degreeCode, degreeName;

    Degree(String degreeCode){
        this.degreeCode = degreeCode;
        processDegree();
    }

    void processDegree(){
        switch (this.degreeCode) {
            case "BSCS" -> this.degreeName = "BS Computer Science";
            case "BSIE" -> this.degreeName = "BS Industrial Engineering";
            case "BSCE" -> this.degreeName = "BS Civil Engineering";
            case "BSECE" -> this.degreeName = "BS Electronics Engineering";
        }
    }

    void setDegreeCode(String degreeCode){ this.degreeCode = degreeCode; }

    String getDegreeName(){
        processDegree();
        return this.degreeName;
    }
}
