/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Lab5Tasks;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Wholly Solly Store
 */
public class ListFormatterTest {

    @Test
    void testSortInPlace_MutatesOriginalList() {
        List<String> list = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        ListFormatter.sortInPlace(list);
        assertEquals(Arrays.asList("apple", "banana", "cherry"), list);
    }

    @Test
    void testToLowerCase_DoesNotMutateOriginalList() {
        List<String> original = Arrays.asList("APPLE", "BANANA");
        List<String> copy = new ArrayList<>(original);

        List<String> result = ListFormatter.toLowerCase(original);

        // Assert original list remains untouched
        assertEquals(copy, original);
        // Assert returned list contains lowercased elements
        assertEquals(Arrays.asList("apple", "banana"), result);
    }
}
