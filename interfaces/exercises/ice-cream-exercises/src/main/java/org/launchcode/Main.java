package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();

        System.out.println("Before\n");
        for(Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
        flavors.sort(comparator);

        ArrayList<Flavor> reversedFlavors = new ArrayList<Flavor>();
        reversedFlavors = flavors;
        Collections.reverse(reversedFlavors);
//        int i = 1;
//        while(i <= flavors.size()){
//            reversedFlavors.add(flavors.get(flavors.size()-i));
//            i++;
//        }

        System.out.println("\nAfter\n");
        for(Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator comparator2 = new ConeComparator();
        System.out.println("\nBefore\n");
        for(Cone cone : cones){
            System.out.println(cone.getName()+": "+cone.getCost());
        }
        cones.sort(comparator2);
        System.out.println("\nAfter\n");
        for(Cone cone : cones){
            System.out.println(cone.getName()+": "+cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

    }
}