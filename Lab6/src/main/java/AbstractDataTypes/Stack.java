/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AbstractDataTypes;

/**
 *
 * @author Wholly Solly Store
 * @param <T>
 */
public interface Stack<T> {

        void push(T item); // Adds an element to the top   

        T pop(); // Removes and returns the top element 

        T peek(); // Returns the top element 

        boolean isEmpty(); // Checks whether stack is empty  

        int size(); // Returns number of elements 
    }

