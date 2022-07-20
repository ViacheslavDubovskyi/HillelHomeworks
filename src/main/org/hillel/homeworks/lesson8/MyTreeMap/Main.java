package org.hillel.homeworks.lesson8.MyTreeMap;

public class Main {

    public static void main(String[] args) {

        MyTreeMap<Integer, String> myTreeMap = new MyTreeMap<>();
        MyUtils myUtils = new MyUtils();

        myUtils.isEmpty(myTreeMap);
        myUtils.fillTreeMap(myTreeMap);
        myUtils.isEmpty(myTreeMap);
        myUtils.containsKey(myTreeMap, 3);
        myUtils.containsKey(myTreeMap, 12);
        myUtils.clear(myTreeMap);
        myUtils.isEmpty(myTreeMap);
    }
}
