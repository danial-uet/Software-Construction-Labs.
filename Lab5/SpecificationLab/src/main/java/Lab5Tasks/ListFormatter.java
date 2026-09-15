package Lab5Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFormatter {

    /**
     * Explicitly sorts the list passed into it (mutating method).
     *
     * @param lst the list to be sorted in place
     */
    public static void sortInPlace(List<String> lst) {
        if (lst == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Collections.sort(lst);
    }

    /**
     * Returns a new list where all strings are lowercase, leaving the original list untouched.
     *
     * @param lst the original list of strings
     * @return a new list containing lowercased strings
     */
    public static List<String> toLowerCase(List<String> lst) {
        if (lst == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        List<String> result = new ArrayList<>();
        for (String str : lst) {
            result.add(str != null ? str.toLowerCase() : null);
        }
        return result;
    }
}