package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator <Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        //return o1.getName().compareTo(o2.getName());
        return Integer.compare(o1.getAllergens().size(), o2.getAllergens().size());
    }
}
