package org.launchcode;

import jdk.javadoc.doclet.Doclet;

public abstract class BaseDisc{ //implements OpticalDisc{

    double  storageCapacity;
    int physicalSize;
    boolean spinning = false;
    private boolean loaded = false;

    public BaseDisc(double discStorageCapacity, int discPhyiscalSize) {
    }

    public void stopDisc(){
        System.out.println("Disc has stopped spinning");
        spinning = false;
        loaded = false;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public int getPhysicalSize() {
        return physicalSize;
    }

    public boolean isSpinning() {
        return spinning;
    }

    public void loadDisc() {
        loaded = true;
    }

    public boolean isLoaded() {
        return loaded;
    }
}
