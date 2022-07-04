package org.hillel.homeworks.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("Iphone",  "white");
        Smartphone smartphone2 = new Smartphone("Samsung",  "black");
        Smartphone smartphone3 = new Smartphone("Xiaomi",  "blue");
        Smartphone smartphone4 = new Smartphone("Iphone",  "blue");
        Smartphone smartphone5 = new Smartphone("Samsung",  "blue");
        Smartphone smartphone6 = new Smartphone("Xiaomi",  "black");
        Smartphone smartphone7 = new Smartphone("Iphone",  "black");
        Smartphone smartphone8 = new Smartphone("Samsung",  "blue");
        Smartphone smartphone9 = new Smartphone("Xiaomi",  "black");
        Smartphone smartphone10 = new Smartphone("Iphone",  "white");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);
        smartphones.add(smartphone4);
        smartphones.add(smartphone5);
        smartphones.add(smartphone6);
        smartphones.add(smartphone7);
        smartphones.add(smartphone8);
        smartphones.add(smartphone9);
        smartphones.add(smartphone10);

        Main.printSmartphones(smartphones);
        Main.printEquals(smartphones);
        Main.printHashCodes(smartphones);
        Main.printEqualsByColor(smartphones);
        Main.printEqualsByModel(smartphones);
    }
}
