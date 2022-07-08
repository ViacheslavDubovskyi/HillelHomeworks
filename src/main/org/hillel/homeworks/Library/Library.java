package org.hillel.homeworks.Library;

import java.util.*;

import static org.hillel.homeworks.Library.AppLogic.*;

public class Library {

    public static List<Book> booksList;
    public static List<Author> authorsList;
    public static Scanner scanner;

    public static void main(String[] args) {

        Country countryFrance = new Country("France");
        Country countryEngland = new Country("Great Britain");
        Country countryItaly = new Country("Italy");
        Country countryIndia = new Country("India");

        //List of authors
        authorsList = new ArrayList<>();
        authorsList.add(new Author("А. Дюма", 1802, countryFrance));
        authorsList.add(new Author("А. К. Дойл", 1859, countryEngland));
        authorsList.add(new Author("Р. Саббатини", 1875, countryItaly));
        authorsList.add(new Author("А. Кристи", 1890, countryEngland));
        authorsList.add(new Author("Р. Киплинг", 1865, countryIndia));
        authorsList.add(new Author("Р. Л. Стивенсон", 1850, countryEngland));
        authorsList.add(new Author("Дж. К. Роулинг", 1965, countryEngland));

        //List of Books
        booksList = new ArrayList<>();
        booksList.add(new Book("'Три мушкетера'", authorsList.get(0), 1965, 123456789));
        booksList.add(new Book("'Приключения Шерлока Холмса'", authorsList.get(1), 1980, 987654321));
        booksList.add(new Book("'Одиссея капитана Блада'", authorsList.get(2), 2001, 135798642));
        booksList.add(new Book("'Королева Марго'", authorsList.get(0), 1976, 635478916));
        booksList.add(new Book("'Эркюль Пуаро (собрание)'", authorsList.get(3), 1950, 109574938));
        booksList.add(new Book("'Маугли'", authorsList.get(4), 1993, 192758940));
        booksList.add(new Book("'Остров сокровищ'", authorsList.get(5), 1993, 705639275));
        booksList.add(new Book("'Граф Монте-Кристо'", authorsList.get(0), 1950, 640826385));
        booksList.add(new Book("'Затеряный мир'", authorsList.get(1), 1965, 496017354));
        booksList.add(new Book("'Гарри Поттер (собрание)'", authorsList.get(6), 2011, 495730276));

        //put list of book in Map
        Map<Integer, Book> bookMap = new HashMap<>();
        for (Book element : booksList) {
            bookMap.put(element.getIsbn(), element);
        }

        printBooks(booksList);
        printAuthors(authorsList);

        System.out.println("Hello! Please, choose the action: 1 - search by year, 2 - search by title, " +
                "3 - search by author, 4 - search by ISBN, 0 - exit from system:");

        //choosing the action
        scanner = new Scanner(System.in);
        while (true) {
            int userChoice = getUserData();
            if (userChoice == 1) {
                searchByYear();
                break;
            }
            if (userChoice == 2) {
                searchByTitle();
                break;
            }
            if (userChoice == 3) {
                searchByAuthor();
                break;
            }
            if (userChoice == 4) {
                searchByISBN(bookMap);
                break;
            }
            if (userChoice == 0) {
                System.out.println("You chose exit from system");
                break;
            }
            System.out.println("Please, repeat input");
        }
        System.out.println("Thanks. Bye!");
        scanner.close();
    }
}
