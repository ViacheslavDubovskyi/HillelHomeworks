package org.hillel.homeworks.Library;

import java.util.*;

import static org.hillel.homeworks.Library.Library.*;

public class AppLogic {

    //printing List of Books
    public static void printBooks(List<Book> booksList) {
        System.out.println("List of Books:");
        for (int i = 0; i < booksList.size(); i++) {
            System.out.print((i + 1) + "." + booksList.get(i));
        }
        System.out.println("---------------------------------------------------");
    }

    //printing List of Authors
    public static void printAuthors(List<Author> authorsList) {
        System.out.println("List of Authors:");
        for (int i = 0; i < authorsList.size(); i++) {
            System.out.print((i + 1) + "." + authorsList.get(i) + '\n');
        }
        System.out.println("---------------------------------------------------");
    }

    //searching book by ISBN
    public static void searchByISBN(Map<Integer, Book> bookMap) {
        System.out.println(("You have selected search by ISBN. Please, enter ISBN number:"));
        printISBN(bookMap);

        while (true) {
            int userData = getUserData();
            boolean keyExist = bookMap.containsKey(userData);
            if (keyExist) {
                Book foundBook = bookMap.get(userData);
                System.out.println("The result of searching:");
                System.out.println(foundBook);
                break;
            }
            if (userData == 0) {
                break;
            }
            System.out.println("You entered incorrect ISBN. Please, try again (0-exit)");
        }
    }

    //searching book by year of publishing
    public static void searchByYear() {
        System.out.println("You have selected search by year. Please, enter year of publishing from:");
        printYears();

        while (true) {
            int userData = getUserData();
            if (userData > 0) {
                boolean resultCheck = checkYear(userData);
                if (resultCheck) {
                    System.out.println("The result of searching:");
                    System.out.println();
                    printBookByYearFilter(userData);
                    break;
                }
            }
            if (userData == 0) {
                break;
            }
            System.out.println("You entered incorrect year. Please, try again (0-exit)");
        }
    }

    //searching book by title
    public static void searchByTitle() {
        System.out.println("You have selected search by title. Please, enter title from:");
        printTitles();

        while (true) {
            String userTitle = scanner.next();
            boolean resultTitleSearch = checkTitle(userTitle);
            if (resultTitleSearch) {
                System.out.println("The result of searching:");
                System.out.println();
                printBookByTitleFilter(userTitle);
                break;
            }
            if (userTitle.equals("0")) {
                break;
            }
            System.out.println("You entered incorrect title. Please, try again (0-exit)");
        }
    }

    //searching book by author
    public static void searchByAuthor() {
        System.out.println("You have selected search by author. Please, enter the name of author:");
        printAuthors(authorsList);

        while (true) {
            String userAuthor = scanner.next();
            boolean resultAuthorSearch = checkAuthor(userAuthor);
            if (resultAuthorSearch) {
                System.out.println("The result of searching:");
                System.out.println();
                printBookByAuthorFilter(userAuthor);
                break;
            }
            if (userAuthor.equals("0")) {
                break;
            }
            System.out.println("You entered incorrect name. Please, try again (0-exit)");
        }
    }

    //printing books, which were found by method searchByYear()
    public static void printBookByYearFilter(int userYear) {
        for (Book element : booksList) {
            if (element.getBookYear() == userYear) {
                System.out.println(element);
            }
        }
    }

    //printing books, which were found by method searchByTitle()
    public static void printBookByTitleFilter(String userTitle) {
        for (Book element : booksList) {
            if (element.getBookTitle().contains(userTitle)) {
                System.out.println(element);
            }
        }
    }

    //printing books, which were found by method searchByAuthor()
    public static void printBookByAuthorFilter(String userAuthor) {
        for (Book element : booksList) {
            if (element.getBookAuthor().getAuthorName().contains(userAuthor)) {
                System.out.println(element);
            }
        }
    }

    //checking, if user data equals to data in our app
    public static boolean checkYear(int userYear) {
        for (Book element : booksList) {
            if (element.getBookYear() == userYear) {
                return true;
            }
        }
        return false;
    }

    //checking, if user data equals to data in our app
    public static boolean checkTitle(String userTitle) {
        for (Book element : booksList) {
            if (element.getBookTitle().contains(userTitle)) {
                return true;
            }
        }
        return false;
    }

    //checking, if user data equals to data in our app
    public static boolean checkAuthor(String userAuthor) {
        for (Book element : booksList) {
            if (element.getBookAuthor().getAuthorName().contains(userAuthor)) {
                return true;
            }
        }
        return false;
    }

    //print just ISBN key
    public static void printISBN(Map<Integer, Book> bookMap) {
        System.out.println("ISBN keys: " + bookMap.keySet());
        System.out.println("---------------------------------------------------");
    }

    //printing just years
    public static void printYears() {
        for (Book element : booksList) {
            System.out.print(element.getBookYear() + " ");
        }
        System.out.println();
    }

    //printing just titles
    public static void printTitles() {
        for (Book element : booksList) {
            System.out.print(element.getBookTitle() + " ");
        }
        System.out.println();
    }

    //getting user data from Scanner
    public static int getUserData() {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }
}
