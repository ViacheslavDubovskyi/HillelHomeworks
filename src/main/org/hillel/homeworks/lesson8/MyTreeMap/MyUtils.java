package org.hillel.homeworks.lesson8.MyTreeMap;

import java.util.Map;

public class MyUtils {

    public void isEmpty(Map myTreeMap) {
        System.out.println("Is TreeMap is empty? " + myTreeMap.isEmpty());
    }

    public void fillTreeMap(Map myTreeMap) {
        System.out.println("Testing MyTreeMap: ");
        for (int i = 0; i < 10; i++) {
            myTreeMap.put(i, "This is string № " + (i + 1));
            System.out.println(myTreeMap.get(i));
        }
    }

    public void containsKey(Map myTreeMap, int key) {
        System.out.println("Is TreeMap contains String № " + key + "? " + myTreeMap.containsKey(key));
    }

    public void clear(Map myTreeMap) {
        myTreeMap.clear();
        System.out.println('\n' + "Method clear() has worked.");
    }
}
