/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    public static final int MAXIMUM_BOOKS_IN_LIBRARY = 4;
    public Book[] booksThatAreCurrentlyAvailable;

    //non-parameterized constructor
    public Library(){
        this.booksThatAreCurrentlyAvailable = new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            this.booksThatAreCurrentlyAvailable[MAXIMUM_BOOKS_IN_LIBRARY] = new Book();
        }
    }
    //parametrized constructor
    public Library(Book[] booksThatAreCurrentlyAvailable){
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    public Book[] getBooksThatAreCurrentlyAvailable() {
        return booksThatAreCurrentlyAvailable;
    }

    public void setBooksThatAreCurrentlyAvailable(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    @Override
    public String toString() {
        return "Library{" +
                "booksThatAreCurrentlyAvailable=" + Arrays.toString(booksThatAreCurrentlyAvailable) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(booksThatAreCurrentlyAvailable, library.booksThatAreCurrentlyAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(booksThatAreCurrentlyAvailable);
    }
}