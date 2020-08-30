/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthorOfTheBook;
    private String thirteenDigitISBNNumberOfTheBook;

//non-parametrized constructor
public Book() {
    this.nameOfTheBook = "null";
    this.nameOfTheAuthorOfTheBook = "null";
    this.thirteenDigitISBNNumberOfTheBook = "null";
}
//parametrized constructor
public Book(String nameOfTheBook, String nameOfTheAuthorOfTheBook, String thirteenDigitISBNNumberOfTheBook){
    this.nameOfTheBook = nameOfTheBook;
    this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
    this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
}

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getNameOfTheAuthorOfTheBook() {
        return nameOfTheAuthorOfTheBook;
    }

    public void setNameOfTheAuthorOfTheBook(String nameOfTheAuthorOfTheBook) {
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
    }

    public String getThirteenDigitISBNNumberOfTheBook() {
        return thirteenDigitISBNNumberOfTheBook;
    }

    public void setThirteenDigitISBNNumberOfTheBook(String thirteenDigitISBNNumberOfTheBook) {
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", nameOfTheAuthorOfTheBook='" + nameOfTheAuthorOfTheBook + '\'' +
                ", thirteenDigitISBNNumberOfTheBook='" + thirteenDigitISBNNumberOfTheBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(nameOfTheBook, book.nameOfTheBook) &&
                Objects.equals(nameOfTheAuthorOfTheBook, book.nameOfTheAuthorOfTheBook) &&
                Objects.equals(thirteenDigitISBNNumberOfTheBook, book.thirteenDigitISBNNumberOfTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, nameOfTheAuthorOfTheBook, thirteenDigitISBNNumberOfTheBook);
    }
}