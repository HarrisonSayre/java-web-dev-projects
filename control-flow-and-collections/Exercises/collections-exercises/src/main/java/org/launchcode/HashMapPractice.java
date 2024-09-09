package org.launchcode;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter students (or ENTER to finish):");

        // Get student names and grades
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.isEmpty()) {
                System.out.print("Student ID: ");
                int newID = input.nextInt();
                students.put(newID, newStudent);
                // Read in the newline before looping back
                input.nextLine();
            }
        } while(!newStudent.isEmpty());

        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " ID Number: "+ student.getKey());
        }
        System.out.println("Number of students in class is " + students.size());
    }
}
