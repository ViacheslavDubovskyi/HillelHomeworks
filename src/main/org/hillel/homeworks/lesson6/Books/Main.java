package org.hillel.homeworks.lesson6.Books;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please, enter name of the author: ");
        String userAuthor = scanner.nextLine();
        scanner.close();

        Map<String, List<String>> authorBookMap = getBookMap();
        System.out.println("The result of searching:");
        System.out.println(listBooksByAuthor(userAuthor, authorBookMap));
    }

    public static List<String> listBooksByAuthor(String userAuthor, Map<String, List<String>> authorBookMap) {
        return authorBookMap.get(userAuthor);
    }

    public static Map<String, List<String>> getBookMap() {
        Map<String, List<String>> authorBookMap = new HashMap<>();

        authorBookMap.put("Александр Дюма", LibraryOfBooks.booksDyuma());
        authorBookMap.put("Жюль Верн", LibraryOfBooks.booksVern());
        authorBookMap.put("Артур Конан Дойл", LibraryOfBooks.booksDoyl());

        return authorBookMap;
    }
}
