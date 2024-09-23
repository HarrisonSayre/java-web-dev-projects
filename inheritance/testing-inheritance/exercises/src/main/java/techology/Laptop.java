package techology;

public class Laptop extends Computer{

    private boolean laptopCase = false;
    private String caseType;

    public Laptop(String laptopModel, int laptopGigsofRam, String laptopManufacturer){
        super(laptopModel, laptopGigsofRam, laptopManufacturer);
    }
    public void boughtACase(String typeOfCase){
        laptopCase = true;
        caseType = typeOfCase;
    }

    public boolean isLaptopCase() {
        return laptopCase;
    }
    public String getCaseType() {
        return caseType;
    }
}
