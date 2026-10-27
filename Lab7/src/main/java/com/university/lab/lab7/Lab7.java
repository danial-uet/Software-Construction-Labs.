package com.university.lab.lab7;

import Task1.PaymentMethod;
import Task1.CreditCardPayment;
import Task1.JazzCashPayment;
import Task1.EcommerceCart;

import Task2.DataBox;

import Task3.Rectangle;
import Task3.Square;
import Task3.Shape;
import Task3.FixedSquare;

import Task4.Student;
import Task4.CgpaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Wholly Solly Store
 */
public class Lab7 {

    public static void main(String[] args) {
        System.out.println("=== LAB TASK 1: Black-Box Reuse (Composition) ===");
        PaymentMethod cc = new CreditCardPayment("1234567890123456");
        EcommerceCart cart1 = new EcommerceCart(cc);
        cart1.checkout(150.75);

        PaymentMethod jazzCash = new JazzCashPayment("03001234567");
        cart1.setPaymentMethod(jazzCash);
        cart1.checkout(2500.0);

        System.out.println("\n=== LAB TASK 2: Generic Type Safety ===");
        DataBox<String> nameBox = new DataBox<>("Ali Khan");
        DataBox<Integer> idBox = new DataBox<>(101);
        System.out.println("Student Name: " + nameBox.getData());
        System.out.println("Student ID: " + idBox.getData());

        System.out.println("\n=== LAB TASK 3: Liskov Substitution Principle ===");
        try {
            Rectangle rect = new Square(); 
            System.out.println("Attempting to set dimensions w=5, h=10 on Square treated as Rectangle...");
            rect.setDimensions(5, 10); 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        Shape fixedSq = new FixedSquare(5);
        System.out.println("Fixed Square Area (side=5): " + fixedSq.getArea());

        System.out.println("\n=== HOMEWORK TASK 4: Reusable Ordering Algorithms ===");
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, 3.45, "Zain"));
        students.add(new Student(101, 3.85, "Ayesha"));
        students.add(new Student(102, 3.65, "Bilal"));

        System.out.println("\n--- Before Sorting ---");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);
        System.out.println("\n--- Sorted by Roll No (Ascending - Comparable) ---");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(new CgpaComparator());
        System.out.println("\n--- Sorted by CGPA (Descending - Comparator) ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}