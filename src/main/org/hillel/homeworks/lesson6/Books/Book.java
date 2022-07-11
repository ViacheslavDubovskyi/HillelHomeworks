package org.hillel.homeworks.lesson6.Books;

public class Book {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: '" + title + '\'';
    }
}

