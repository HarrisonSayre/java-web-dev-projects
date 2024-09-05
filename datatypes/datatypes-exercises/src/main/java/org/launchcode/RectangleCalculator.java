package org.launchcode;

import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of the rectangle:");
        double length = input.nextDouble();
        System.out.println("What is the width of the rectangle:");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("A rectangle with a length of "+length+" and a width of "+width+" has an area of "+area);
    }
}
