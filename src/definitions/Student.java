/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    public static final int MAXIMUM_NO_OF_BOOKS_CAN_ISSUE = 4;
    private String nameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] theNamesOfTheBooksIssuedByTheStudent;

    //non-parametrized constructor
    public Student() {
        this.nameOfTheStudent = "null";
        this.universityRollNumberOfTheStudent = 0L;
        this.numberOfBooksIssuedByTheStudent = 0;
        this.theNamesOfTheBooksIssuedByTheStudent = new Book[MAXIMUM_NO_OF_BOOKS_CAN_ISSUE];
        for (int i = 0; i < MAXIMUM_NO_OF_BOOKS_CAN_ISSUE; i++) {
            this.theNamesOfTheBooksIssuedByTheStudent[i] = new Book();
        }
    }
    //parametrized constructor
    public Student(String nameOfTheStudent,
                   long universityRollNumberOfTheStudent,
                   int numberOfBooksIssuedByTheStudent,
                   Book[] theNamesOfTheBooksIssuedByTheStudent){
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
        this.theNamesOfTheBooksIssuedByTheStudent = theNamesOfTheBooksIssuedByTheStudent;
    }

    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    public long getUniversityRollNumberOfTheStudent() {
        return universityRollNumberOfTheStudent;
    }

    public int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public Book[] getTheNamesOfTheBooksIssuedByTheStudent() {
        return theNamesOfTheBooksIssuedByTheStudent;
    }
}