package org.launchcode;

import java.util.Scanner;
import studios.areaofacircle.Circle;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        if(!input.hasNextDouble()) {
            System.out.println("Invalid number entered. Exiting program");
            System.exit(0);
        }
        double radius = input.nextDouble();

        //double area = 3.14 * radius * radius;
        double area = Circle.getArea(radius);
        System.out.println("The area of circle of a radius " + radius + " is: " + area);

        input.close();
    }

}