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

    public void setNameOfTheStudent(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }

    public long getUniversityRollNumberOfTheStudent() {
        return universityRollNumberOfTheStudent;
    }

    public void setUniversityRollNumberOfTheStudent(long universityRollNumberOfTheStudent) {
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
    }

    public int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public Book[] getTheNamesOfTheBooksIssuedByTheStudent() {
        return theNamesOfTheBooksIssuedByTheStudent;
    }

    public void setTheNamesOfTheBooksIssuedByTheStudent(Book[] theNamesOfTheBooksIssuedByTheStudent) {
        this.theNamesOfTheBooksIssuedByTheStudent = theNamesOfTheBooksIssuedByTheStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfTheStudent='" + nameOfTheStudent + '\'' +
                ", universityRollNumberOfTheStudent=" + universityRollNumberOfTheStudent +
                ", numberOfBooksIssuedByTheStudent=" + numberOfBooksIssuedByTheStudent +
                ", theNamesOfTheBooksIssuedByTheStudent=" + Arrays.toString(theNamesOfTheBooksIssuedByTheStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return universityRollNumberOfTheStudent == student.universityRollNumberOfTheStudent &&
                numberOfBooksIssuedByTheStudent == student.numberOfBooksIssuedByTheStudent &&
                Objects.equals(nameOfTheStudent, student.nameOfTheStudent) &&
                Arrays.equals(theNamesOfTheBooksIssuedByTheStudent, student.theNamesOfTheBooksIssuedByTheStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameOfTheStudent, universityRollNumberOfTheStudent, numberOfBooksIssuedByTheStudent);
        result = 31 * result + Arrays.hashCode(theNamesOfTheBooksIssuedByTheStudent);
        return result;
    }
    /**
     * This method will issue the books to the Student.
     *
     * @param bookIssuingNumber The number of the book is issuing.
     * @param bookName         The name of the book which is issuing.
     */
    public void issueBooksToStudents(int bookIssuingNumber, String bookName) {
        theNamesOfTheBooksIssuedByTheStudent[bookIssuingNumber].setNameOfTheBook(bookName);
    }
    /**
     * This method will return the Book which the student has issued.
     *
     * @param bookName The name of the book which is used to be returned.
     * @return It will return Boolean value, if return will be successful then it will return true else false.
     */
    public boolean returnBook(String bookName) {
        boolean returnSuccessful = false;
        int returnBookNumber = 0;
        for (int tempNum = 0; tempNum < MAXIMUM_NO_OF_BOOKS_CAN_ISSUE; tempNum++) {
            if (bookName.equals(theNamesOfTheBooksIssuedByTheStudent[tempNum].getNameOfTheBook())) {
                returnSuccessful = true;
                returnBookNumber = tempNum;
                setNumberOfBooksIssuedByTheStudent(getNumberOfBooksIssuedByTheStudent() - 1);
                break;
            }
        }
        if (returnSuccessful) {
            theNamesOfTheBooksIssuedByTheStudent[returnBookNumber].setNameOfTheBook(null);
        } else {
            System.out.println("Please Enter the correct book name.");
        }
        return returnSuccessful;
    }
    /**
     * This method will show all the books which is issued by the Student.
     */
    public void showIssuedBooksByStudent() {
        if (getNumberOfBooksIssuedByTheStudent() == 0) {
            System.out.println("Sorry, you haven't issued any book yet.");
        } else {
            System.out.println("These are the books issued by you: ");
            for (int issuedBook = 0; issuedBook < MAXIMUM_NO_OF_BOOKS_CAN_ISSUE; issuedBook++) {
                if (theNamesOfTheBooksIssuedByTheStudent[issuedBook].getNameOfTheBook() != null) {
                    System.out.print(theNamesOfTheBooksIssuedByTheStudent[issuedBook].getNameOfTheBook()
                            + (issuedBook < getNumberOfBooksIssuedByTheStudent() - 1 ? ", " : ".\n"));
                }
            }
        }
    }
}
