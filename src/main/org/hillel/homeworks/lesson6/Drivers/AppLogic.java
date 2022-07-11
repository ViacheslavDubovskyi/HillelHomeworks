package org.hillel.homeworks.lesson6.Drivers;

import java.util.*;

public class AppLogic {

    public static List<Person> listOfPersons() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Andrii", 27, true, 365));
        list.add(new Person("Valerii", 15, true, 500));
        list.add(new Person("Maria", 35, false, 400));
        list.add(new Person("Tatiana", 27, true, 265));
        list.add(new Person("Anna", 24, true, 450));
        list.add(new Person("Oleg", 18, false, 550));
        list.add(new Person("Denis", 45, true, 420));

        return list;
    }

    public static List<Person> listOfDrivers(List<Person> driverList) {
        for (Person person : listOfPersons()) {
            if (person.isDriverLicense() & (person.getAge() > 15) & person.getLastTrafficFineDay() > 364) {
                driverList.add(person);
            }
        }
        return driverList;
    }
}
