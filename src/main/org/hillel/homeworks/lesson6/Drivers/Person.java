package org.hillel.homeworks.lesson6.Drivers;

public class Person {

    private String name;
    private int age;
    private boolean driverLicense;
    private int lastTrafficFineDay;

    public Person(String name, int age, boolean driverLicense, int lastTrafficFineDay) {
        this.name = name;
        this.age = age;
        this.driverLicense = driverLicense;
        this.lastTrafficFineDay = lastTrafficFineDay;
    }

    public int getAge() {
        return age;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getLastTrafficFineDay() {
        return lastTrafficFineDay;
    }

    @Override
    public String toString() {
        return  "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", driverLicense=" + driverLicense +
                ", lastTrafficFineDay=" + lastTrafficFineDay +
                '}';
    }
}
