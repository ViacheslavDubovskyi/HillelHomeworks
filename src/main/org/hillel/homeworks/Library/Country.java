package org.hillel.homeworks.Library;

public class Country {

    private final String country;

    public Country(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "country: '" + country + '\'';
    }
}
