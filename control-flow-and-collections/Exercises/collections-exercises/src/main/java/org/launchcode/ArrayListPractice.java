package org.launchcode;

import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListPractice {
    public static void main(String[] args) {
        //System.out.println("Filler");
        ArrayList<Integer> evenTest = new ArrayList<>();
        evenTest.add(0);
        evenTest.add(1);
        evenTest.add(2);
        evenTest.add(3);
        evenTest.add(4);
        evenTest.add(5);
        evenTest.add(6);
        evenTest.add(7);
        evenTest.add(8);
        evenTest.add(9);
        System.out.println(EvenSummer(evenTest));

        ArrayList<String> lengthTest = new ArrayList<>();
        lengthTest.add("Hello");
        lengthTest.add("Yes!!");
        lengthTest.add("No");
        lengthTest.add("");
        FiveExactly(lengthTest);

    }

    public static int EvenSummer(ArrayList<Integer> arg) {
        int sum = 0;
        for (int i = 0; i < arg.size(); i++) {
            if (arg.get(i) % 2 == 0) {
                sum += arg.get(i);
            }
        }
        return sum;
    }

    public static void FiveExactly(ArrayList<String> arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word length you want to search: ");
        int stringLength = input.nextInt();
        for (String word : arg){
            if(word.length() == stringLength) {
                System.out.println(word);
            }
        }
    }
}

//Maybe do bonus later.
