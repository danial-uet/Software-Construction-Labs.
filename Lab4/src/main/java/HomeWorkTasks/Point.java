/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeWorkTasks;

/**
 *
 * @author Wholly Solly Store
 */
// Immutable 2D Point class marked final to prevent subclassing
public final class Point {

    // Final instance fields to guarantee immutability
    private final int x;
    private final int y;

    // Constructor initializing coordinates upon instantiation
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Accessor for the x-coordinate
    public int getX() {
        return x;
    }

    // Accessor for the y-coordinate
    public int getY() {
        return y;
    }

    // Return a string representation of the point coordinates
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println("Created Immutable Point: " + p);
        System.out.println("X coordinate: " + p.getX());
        System.out.println("Y coordinate: " + p.getY());
    }
}