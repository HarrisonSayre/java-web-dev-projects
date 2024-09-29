package org.launchcode;

public interface OpticalDisc {
    static final String OBJECT_SHAPE = "Round";
    void spinDisc();
    void stopDisc();
    String getData(String searchTerm);
    double getStorageCapacity();
    void loadDisc();
    //void readDisc();
    void writeData(String someData);
    String getObjectShape();
}
