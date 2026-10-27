/*
  @author Wholly Solly Store
 */

package Task4;

public class Student implements Comparable<Student> {
    private int rollNo;
    private double cgpa;
    private String name;

    public Student(int rollNo, double cgpa, String name) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
        this.name = name;
    }

    public int getRollNo() { return rollNo; }
    public double getCgpa() { return cgpa; }
    public String getName() { return name; }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return String.format("Student{RollNo: %d, Name: '%s', CGPA: %.2f}", rollNo, name, cgpa);
    }
}