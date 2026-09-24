/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task4;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Wholly Solly Store
 */
public class LibraryImplementation implements LibrarySystem {
    // Map storing Book ID as key and Book object as value
    private final Map<Integer, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
        System.out.println("Added: " + book.getTitle());
    }

    @Override
    public void removeBook(int bookId) {
        if (books.containsKey(bookId)) {
            Book removed = books.remove(bookId);
            System.out.println("Removed: " + removed.getTitle());
        } else {
            System.out.println("Book ID " + bookId + " not found.");
        }
    }

    @Override
    public Book searchBook(int bookId) {
        return books.get(bookId);
    }

    @Override
    public void issueBook(int bookId) {
        Book book = books.get(bookId);
        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            System.out.println("Issued: " + book.getTitle());
        } else if (book != null && book.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            System.out.println("Book ID " + bookId + " not found.");
        }
    }

    @Override
    public void returnBook(int bookId) {
        Book book = books.get(bookId);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            System.out.println("Returned: " + book.getTitle());
        } else if (book != null && !book.isIssued()) {
            System.out.println("Book was not issued.");
        } else {
            System.out.println("Book ID " + bookId + " not found.");
        }
    }
}
