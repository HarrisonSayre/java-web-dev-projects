package techology;

public class SmartPhone extends Computer {

    private int phoneNumber;

    public SmartPhone(String phoneModel, int phoneGigsOfRam, String phoneManufacturer, int newPhoneNumber) {
     super(phoneModel, phoneGigsOfRam, phoneManufacturer);
     phoneNumber = newPhoneNumber;
    }

    public void callNumber(int numbertoCall){
        System.out.println(""+phoneNumber+": is calling: "+numbertoCall);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
