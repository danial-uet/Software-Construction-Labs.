/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

/**
 *
 * @author Wholly Solly Store
 */
public class main {
public static void main(String[] args){
// Create a stack with capacity 5
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        // Insert values
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display size
        System.out.println("Size: " + stack.size());

        // Display top value
        System.out.println("Top: " + stack.peek());

        // Remove top value
        System.out.println("Popped: " + stack.pop());

        // Display top after pop
        System.out.println("Top after pop: " + stack.peek());

        // Check if empty
        System.out.println("Is empty? " + stack.isEmpty());    
}
}