package org.hillel.homeworks.lesson6.Books;

import java.util.*;

public class LibraryOfBooks {

    public static List<Book> booksDyuma (){
        List<Book> booksDyuma = new ArrayList<>();
        booksDyuma.add(new Book("Три мушкетера"));
        booksDyuma.add(new Book("Королева Марго"));
        booksDyuma.add(new Book("Граф Монте-Кристо"));
        return booksDyuma;
    }

    public static List<Book> booksVern (){
        List<Book> booksVern = new ArrayList<>();
        booksVern.add(new Book("Пятнцадцатилетний капитан"));
        booksVern.add(new Book("В поисках капитана Гранта"));
        booksVern.add(new Book("Таинственный остров"));
        return booksVern;
    }

    public static List<Book> booksDoyl (){
        List<Book> booksDoyl = new ArrayList<>();
        booksDoyl.add(new Book("Шерлок Холмс"));
        booksDoyl.add(new Book("Маракотовая бездна"));
        booksDoyl.add(new Book("Затеряный мир"));
        return booksDoyl;
    }

}
