package org.hillel.homeworks.lesson4;

import java.util.Objects;

public class Smartphone {

    public String model;
    public String color;

    // Constructor
    public Smartphone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //Method, which compare two elements by both fields
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return Objects.equals(model, smartphone.model) && Objects.equals(color, smartphone.color);
    }

    //Method calculate hashCode of the object, with my realization
    @Override
    public int hashCode() {
        model += "MODEL" + model;
        color += "COLOR" + color;
        return Objects.hash(model, color);
    }

    //Method, which compare two elements by field 'model'
    public boolean equalsByColor(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return Objects.equals(color, smartphone.color);
    }

    //Method, which compare two elements by field 'model'
    public boolean equalsByModel(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return Objects.equals(model, smartphone.model);
    }

    public String toString() {
        return " Smartphone model='" + model + '\'' +
                ", color ='" + color + '\'' + '\n';
    }
}
