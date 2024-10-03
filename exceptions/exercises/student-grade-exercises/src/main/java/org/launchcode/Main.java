package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        Divide(1, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        //String nothing = null;

        CheckFileExtension("FILLER");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        if(y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by zero.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        //int z = x/y;
    }

//    public class FileExtensionException extends NullPointerException{
//
//    }
//
//    public NullPointerException(String s) {
//        super(s);
//    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        String fileExtension = fileName;
        fileExtension = null;
        if(fileExtension == null || fileExtension.isEmpty()) {
            //System.out.println("EMPTY!");
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            return -1;
        }

        if(fileExtension.equals(".java")){
            return 1;
        }
        return 0;
    }


}