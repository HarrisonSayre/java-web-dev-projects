package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.
    private double storageCapacity;
    private final String title;

    public DVD(double discStorageCapacity, String title){
        super(discStorageCapacity, 120);
        this.title = title;
    }

    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
        spinning = true;
    }

    public String getData(String searchTerm){
        return title;
    }

    public String getObjectShape(){
        return OBJECT_SHAPE;
    }

    public void writeData(String someData){
        System.out.println("DVDs are read only");
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
