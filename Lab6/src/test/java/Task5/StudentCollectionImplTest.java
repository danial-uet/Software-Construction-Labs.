package Task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentCollectionImplTest {
    
    private StudentCollectionImpl instance;

    @BeforeEach
    public void setUp() {
        instance = new StudentCollectionImpl();
    }

    @Test
    public void testAddStudentAndGetSize() {
        assertTrue(instance.isEmpty());
        Student student = new Student(101, "Ali");
        instance.addStudent(student);
        assertEquals(1, instance.getSize());
        assertFalse(instance.isEmpty());
    }

    @Test
    public void testFindStudent() {
        Student student = new Student(102, "Sara");
        instance.addStudent(student);
        
        Student result = instance.findStudent(102);
        assertNotNull(result);
        assertEquals("Sara", result.getName());
    }

    @Test
    public void testRemoveStudent() {
        Student student = new Student(103, "Usman");
        instance.addStudent(student);
        
        boolean removed = instance.removeStudent(103);
        assertTrue(removed);
        assertEquals(0, instance.getSize());
        assertNull(instance.findStudent(103));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(instance.isEmpty());
        instance.addStudent(new Student(104, "Zara"));
        assertFalse(instance.isEmpty());
    }
}