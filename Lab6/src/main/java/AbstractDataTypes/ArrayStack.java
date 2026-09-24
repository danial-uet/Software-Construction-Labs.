/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataTypes;

/**
 *
 * @author Wholly Solly Store
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T> {

    private final Object[] elements;
    private int top;

    public ArrayStack(int capacity) {
        elements = new Object[capacity];
        top = 0;
    }

    @Override
    public void push(T item) {
        elements[top] = item;
        top++;
    }

    @Override
    @SuppressWarnings("unchecked")

    public T pop() {
        top--;
        return (T) elements[top];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) elements[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }
}