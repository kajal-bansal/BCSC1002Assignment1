/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;
import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_A_NEW_BOOK = 1;
    public static final int RETURN_A_PREVIOUSLY_ISSUES_BOOK = 2;
    public static final int SHOW_ALL_THE_ISSUES_BOOK = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentChoice;
        Student student = new Student();
        Library library = new Library();
        library.setMaximumBooksInLibrary();
        String bookName;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            studentChoice = scanner.nextInt();

            switch (studentChoice) {
                case ISSUE_A_NEW_BOOK:
                    scanner.nextLine();
                    System.out.println("Enter your name: ");
                    student.setNameOfTheStudent(scanner.nextLine());
                    System.out.println("Enter your University roll number: ");
                    student.setUniversityRollNumberOfTheStudent(scanner.nextLong());
                    System.out.println("How much books you want to issue: ");
                    student.setNumberOfBooksIssuedByTheStudent(scanner.nextInt());
                    System.out.println("These are the available books: ");
                    library.showAvailableBooks();
                    scanner.nextLine();
                    System.out.println("Enter the details of the books you want to issue: ");
                    for (int bookIssuingIndex = 0; bookIssuingIndex < student.getNumberOfBooksIssuedByTheStudent(); bookIssuingIndex++) {
                        System.out.println("Enter name of book " + (bookIssuingIndex + 1) + ": ");
                        bookName = scanner.nextLine();
                        student.issueBooksToStudents(bookIssuingIndex, bookName);
                    }
                    System.out.println("Thank you for Issuing the Books..");
                    break;
                case RETURN_A_PREVIOUSLY_ISSUES_BOOK:
                    if (student.getNumberOfBooksIssuedByTheStudent() == 0) {
                        System.out.println("Sorry, you haven't issued any book yet so you can't return book.");
                    } else {
                        System.out.println("Enter the name of the book you want to return: ");
                        scanner.nextLine();
                        bookName = scanner.nextLine();
                        if (student.returnBook(bookName)) {
                            System.out.println("Thank you for returning the book " + bookName + ".");
                        }
                    }
                    break;
                case SHOW_ALL_THE_ISSUES_BOOK:
                    student.showIssuedBooksByStudent();
                    break;
                case EXIT:
                    System.out.println("Thanks for using our service.");
                    break;
                default:
                    System.out.println("You have entered wrong choice!");
                    break;
            }
        } while (studentChoice != EXIT);
        scanner.close();
    }
}

