package techology;

public class Computer extends AbstractEntity{
    private final String model;
    private int gigsOfRam;
    private final String manufacturer;

    public Computer (String computerModel, int computersGigsOfRam, String computerManufacturer){
        model = computerModel;
        gigsOfRam = computersGigsOfRam;
        manufacturer = computerManufacturer;
    }

    public boolean atLeasEightGigs() {
        return (this.gigsOfRam >= 8);
    }

    public void secondMethod(){
        System.out.println("Filler");
    }

    public String getModel() {
        return model;
    }

    public int getGigsOfRam() {
        return gigsOfRam;
    }

    public void setGigsOfRam(int gigsOfRam) {
        this.gigsOfRam = gigsOfRam;
    }
}
