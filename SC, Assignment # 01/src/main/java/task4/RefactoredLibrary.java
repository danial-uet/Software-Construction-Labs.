/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Wholly Solly Store
 */
// Encapsulated Book class with private fields
class RefactoredBook {
    private final String title;
    private final String author;
    private boolean isBorrowed;

    public RefactoredBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public boolean borrowBook() {
        if (!isBorrowed) {
            this.isBorrowed = true;
            return true;
        }
        return false;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }
}

// Main public class matching RefactoredLibrary.java
public class RefactoredLibrary {
    private String name;
    private final List<RefactoredBook> borrowedBooks;

    public RefactoredLibrary(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<RefactoredBook> getBorrowedBooks() {
        return Collections.unmodifiableList(borrowedBooks);
    }

    public boolean borrowBook(RefactoredBook book) {
        if (book == null) {
            System.out.println("Error: Invalid book reference.");
            return false;
        }

        if (book.isBorrowed()) {
            System.out.println("Error: '" + book.getTitle() + "' is already borrowed.");
            return false;
        }

        if (book.borrowBook()) {
            borrowedBooks.add(book);
            System.out.println(name + " successfully borrowed '" + book.getTitle() + "'.");
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        RefactoredLibrary member = new RefactoredLibrary("Alice");
        RefactoredBook book1 = new RefactoredBook("Effective Java", "Joshua Bloch");

        member.borrowBook(book1);
        member.borrowBook(book1); // Trying to borrow again will fail properly
    }
}
