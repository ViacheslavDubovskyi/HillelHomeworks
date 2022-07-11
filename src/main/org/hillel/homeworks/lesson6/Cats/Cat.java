package org.hillel.homeworks.lesson6.Cats;

public class Cat {

    private final String name;
    private final int age;
    private String city;

    public Cat(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'';
    }
}
