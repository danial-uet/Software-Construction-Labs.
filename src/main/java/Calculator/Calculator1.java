/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author Wholly Solly Store
 */
public class Calculator1 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public int power(int base, int exp) {
        return (int) Math.pow(base, exp);
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot perform modulus by zero.");
        }
        return a % b;
    }
}