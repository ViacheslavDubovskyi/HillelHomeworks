package org.hillel.homeworks.lesson6.Cats;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Cats before moving: ");
        System.out.println(getListOfCat());

        System.out.println("Cats after moving: ");
        List<Cat> list = changeCity();
        System.out.println(list);
    }

    public static List<Cat> changeCity() {
        List<Cat> changeCatCity = getListOfCat();
        for (Cat cat : changeCatCity) {
            cat.setCity(randomCity());
        }

        return changeCatCity;
    }

    public static String randomCity() {
        List<String> cities = new ArrayList<>();
        cities.add("Lviv");
        cities.add("Kharkiv");
        cities.add("Chernigiv");
        cities.add("Praha");
        cities.add("Berlin");

        return cities.get(new Random().nextInt(5));
    }

    public static List<Cat> getListOfCat() {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Murzik", 4, "Odessa"));
        catList.add(new Cat("Bublic", 6, "Kyiv"));
        catList.add(new Cat("Marsic", 1, "Poltava"));
        catList.add(new Cat("Sniezhok", 3, "Vinnitsa"));
        catList.add(new Cat("Murka", 7, "Mykolaiv"));

        return catList;
    }
}
