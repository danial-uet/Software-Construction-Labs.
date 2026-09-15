package Lab5Tasks;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    void testJoinStrings_ValidList() {
        String result = StringUtil.joinStrings(Arrays.asList("apple", "banana", "cherry"), ", ");
        assertEquals("apple, banana, cherry", result);
    }

    @Test
    void testJoinStrings_EmptyList() {
        String result = StringUtil.joinStrings(Collections.emptyList(), ",");
        assertEquals("", result);
    }

    @Test
    void testJoinStrings_NullInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> StringUtil.joinStrings(null, ","));
    }
}