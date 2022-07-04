package org.hillel.homeworks.lesson4;

import java.util.List;

public class Main {

    //Method prints all elements from the list Smartphone
    public static void printSmartphones(List<Smartphone> smartphones) {
        System.out.println("List of Smartphones:");
        for (int i = 0; i < smartphones.size(); i++) {
            System.out.print((i + 1) + "." + smartphones.get(i));
        }
        System.out.println("---------------------------------------------------");
    }

    //Method prints the result of the method 'hashCode()'
    public static void printHashCodes(List<Smartphone> smartphones) {
        for (int i = 0; i < smartphones.size(); i++) {
            System.out.print("Hashcode of smartphone " + (i + 1) + ": " + smartphones.get(i).hashCode() + '\n');
        }
        System.out.println("---------------------------------------------------");
    }

    //Method prints the result of the method 'equals(Object o)'
    public static void printEquals(List<Smartphone> smartphones) {
        for (int i = 0; i < smartphones.size(); i++) {
            for (int j = i + 1; j < smartphones.size(); j++) {
                if (smartphones.get(i).equals(smartphones.get(j))) {
                    System.out.print("Smartphone " + (i + 1) + " equals to Smartphone " + (j + 1) + " by all parameters" + '\n');
                }
            }
        }
        System.out.println("---------------------------------------------------");
    }

    //Method prints the result of the method 'equalsByColor(Object o)'
    public static void printEqualsByColor(List<Smartphone> smartphones) {
        for (int i = 0; i < smartphones.size(); i++) {
            for (int j = i + 1; j < smartphones.size(); j++)
                if (smartphones.get(i).equalsByColor(smartphones.get(j))) {
                    System.out.print("Smartphone " + (i + 1) + " equals to Smartphone " + (j + 1) + " by color" + '\n');
                }
        }
    }

    //Method prints the result of the method 'equalsByModel(Object o)'
    public static void printEqualsByModel(List<Smartphone> smartphones) {
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < smartphones.size(); i++) {
            for (int j = i + 1; j < smartphones.size(); j++)
                if (smartphones.get(i).equalsByModel(smartphones.get(j))) {
                    System.out.print("Smartphone " + (i + 1) + " equals to Smartphone " + (j + 1) + " by model" + '\n');
                }
        }
    }
}