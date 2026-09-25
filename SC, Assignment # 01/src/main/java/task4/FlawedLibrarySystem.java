/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wholly Solly Store
 */
// Main public class (matches filename FlawedLibrarySystem.java)
public class FlawedLibrarySystem {
    public static void main(String[] args) {
        System.out.println("This is the original flawed AI code example.");
    }
}

// Helper class without 'public' modifier
class Book {
    public String title;
    public String author;
    public boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
}

// Helper class without 'public' modifier
class Member {
    public String name;
    public List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        book.isBorrowed = true;
        borrowedBooks.add(book);
    }
}
