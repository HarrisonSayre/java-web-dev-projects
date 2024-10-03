package org.launchcode;

import java.util.logging.FileHandler;

public class FileExtensionException extends NullPointerException{
    public FileExtensionException(){
        super();
    }
    public FileExtensionException(String s){
        super(s);
    }
}
