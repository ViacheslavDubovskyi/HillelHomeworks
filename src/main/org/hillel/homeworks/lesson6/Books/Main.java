package org.hillel.homeworks.lesson6.Books;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please, enter name of the author: ");
        String userAuthor = scanner.nextLine();
        scanner.close();

        System.out.println("The result of searching:");
        listBooksByAuthor(userAuthor, getBookMap());
    }

    public static void listBooksByAuthor(String userAuthor, Map<Author, List<Book>> authorBookMap) {
        for (Map.Entry<Author, List<Book>> element : authorBookMap.entrySet()) {
            if (element.getKey().getName().contains(userAuthor)) {
                List<Book> value = element.getValue();
                System.out.println(value);
            }
        }
    }

    public static Map<Author, List<Book>> getBookMap() {
        Map<Author, List<Book>> authorBookMap = new HashMap<>();

        authorBookMap.put(new Author("Александр Дюма"), LibraryOfBooks.booksDyuma());
        authorBookMap.put(new Author("Жюль Верн"), LibraryOfBooks.booksVern());
        authorBookMap.put(new Author("Артур Конан Дойл"), LibraryOfBooks.booksDoyl());

        return authorBookMap;
    }
}
