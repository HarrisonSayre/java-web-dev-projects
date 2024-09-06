package org.launchcode;

import java.util.Scanner;
import studios.areaofacircle.Circle;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        while(!input.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of circle of a radius " + radius + " is: " + area);
        input.close();
    }
}