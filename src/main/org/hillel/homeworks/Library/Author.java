package org.hillel.homeworks.Library;

public class Author {

    private final String authorName;

    private final int authorYearOfBirth;

    private final Country authorCountry;

    public String getAuthorName() {
        return authorName;
    }

    public Author(String authorName, int authorYearOfBirth, Country authorCountry) {
        this.authorName = authorName;
        this.authorYearOfBirth = authorYearOfBirth;
        this.authorCountry = authorCountry;
    }

    @Override
    public String toString() {
        return "Author: '" + authorName + '\'' +
                " (" + authorYearOfBirth +
                ", " + authorCountry + ")";
    }
}
