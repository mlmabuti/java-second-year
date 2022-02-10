class Degree {
    String degreeCode, degreeName;
    Degree(String degreeCode){
        this.degreeCode = degreeCode;

        switch(this.degreeCode){
            case "BSCS" : this.degreeName = "BS Computer Science"; break;
            case "BSIE" : this.degreeName = "BS Industrial Engineering"; break;
            case "BSCE" : this.degreeName = "BS Civil Engineering"; break;
            case "BSECE" : this.degreeName = "BS Electronics Engineering"; break;
        }
    }

    String getDegreeName(){ return this.degreeName; }
}
