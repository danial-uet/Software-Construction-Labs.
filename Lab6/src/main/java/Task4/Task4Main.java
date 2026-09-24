/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task4;

/**
 *
 * @author Wholly Solly Store
 */
public class Task4Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibraryImplementation();

        // Testing operations
        Book b1 = new Book(1, "Clean Code", "Robert C. Martin");
        Book b2 = new Book(2, "Design Patterns", "Erich Gamma");

        library.addBook(b1);
        library.addBook(b2);

        System.out.println("Search Result: " + library.searchBook(1));

        library.issueBook(1);
        library.returnBook(1);
        library.removeBook(2);
    }
}
