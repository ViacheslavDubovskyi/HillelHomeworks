package org.hillel.homeworks.Library;

public class Book {

    private final Author bookAuthor;

    private final int bookYear;

    private final String bookTitle;

    private final int isbn;

    public Book(String bookTitle, Author bookAuthor, int bookYear, int isbn) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookYear() {
        return bookYear;
    }

    @Override
    public String toString() {
        return bookAuthor +
                ", Title: '" + bookTitle +
                ", Year of publishing: " + bookYear +
                ", ISBN: " + isbn +
                ';' + '\n';
    }
}
