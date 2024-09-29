package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    private ArrayList<String> discData = new ArrayList<>();

    public CD (double discStorageCapacity){
        super(discStorageCapacity, 120);
    }

    public void spinDisc(){
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
        spinning = true;
    }

    public String getData(String searchTerm){
        if(!discData.contains(searchTerm)){
            return "No data found";
        }
        return discData.get(discData.indexOf(searchTerm));
    }

    public String getObjectShape(){
        return OBJECT_SHAPE;
    }

    public void writeData(String someData){
        discData.add(someData);
        System.out.println(someData+" has been written to the disc.");
    }



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
