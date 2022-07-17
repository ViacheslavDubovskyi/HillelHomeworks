package org.hillel.homeworks.lesson8.URL;

import java.util.*;

public class CompareValue implements Comparator<String> {

    public Map<String, Integer> initMap;

    public CompareValue(Map<String, Integer> initMap) {
        this.initMap = initMap;
    }

    //Comparing elements in a Map by value (number of entries of domens (key))
    public int compare(String a, String b) {
        if (initMap.get(a) <= initMap.get(b)) {
            return 1;
        } else {
            return -1;
        }
    }
}