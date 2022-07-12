package org.hillel.homeworks.lesson6.Books;

import java.util.*;

public class LibraryOfBooks {

    public static List<String> booksDyuma (){
        List<String> booksDyuma = new ArrayList<>();
        booksDyuma.add("Три мушкетера");
        booksDyuma.add("Королева Марго");
        booksDyuma.add("Граф Монте-Кристо");
        return booksDyuma;
    }

    public static List<String> booksVern (){
        List<String> booksVern = new ArrayList<>();
        booksVern.add("Пятнцадцатилетний капитан");
        booksVern.add("В поисках капитана Гранта");
        booksVern.add("Таинственный остров");
        return booksVern;
    }

    public static List<String> booksDoyl (){
        List<String> booksDoyl = new ArrayList<>();
        booksDoyl.add("Шерлок Холмс");
        booksDoyl.add("Маракотовая бездна");
        booksDoyl.add("Затеряный мир");
        return booksDoyl;
    }

}
