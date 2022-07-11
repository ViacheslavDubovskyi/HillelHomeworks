package org.hillel.homeworks.lesson6.Drivers;

import java.util.ArrayList;
import java.util.List;

public class Drivers {

    public static void main(String[] args) {

        List<Person> driverList = new ArrayList<>();
        System.out.println("Initial list of persons:");
        System.out.println(AppLogic.listOfPersons());

        System.out.println();
        System.out.println("List of persons, who can drive:");
        System.out.println(AppLogic.listOfDrivers(driverList));
    }
}
