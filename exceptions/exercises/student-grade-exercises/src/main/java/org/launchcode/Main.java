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

        // Test out your CheckFileExtension() function!
        for (String file : studentFiles.values()) {
            CheckFileExtension(file);
        }
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

    public static int CheckFileExtension(String fileName) {
        if(fileName == null || fileName.isEmpty()) {
            try {
                throw new FileExtensionException("Cannot have an empty or null file extension");
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            return -1;
        }
        if(fileName.endsWith(".java")) {
            return 1;
        }
        return 0;
    }
}