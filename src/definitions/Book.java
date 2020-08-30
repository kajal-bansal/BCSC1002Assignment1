/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
}