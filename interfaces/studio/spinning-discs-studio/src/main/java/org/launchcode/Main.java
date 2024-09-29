package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        DVD dieHard = new DVD(17.04, "Die Hard");
        CD weirdAl = new CD (6.0);

        dieHard.spinDisc();
        weirdAl.spinDisc();
        dieHard.stopDisc();
        weirdAl.stopDisc();
        weirdAl.getStorageCapacity();
        dieHard.getStorageCapacity();
        weirdAl.loadDisc();;
        dieHard.loadDisc();
        weirdAl.writeData("White and Nerdy");
        dieHard.writeData("Is a Christmas movie");
        System.out.println(weirdAl.getData("White and Nerdy"));
        System.out.println(dieHard.getData("Is a Christmas movie"));
        System.out.println(weirdAl.getObjectShape());
        System.out.println(dieHard.getObjectShape());



        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}