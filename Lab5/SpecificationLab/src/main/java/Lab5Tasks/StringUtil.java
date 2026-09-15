package Lab5Tasks;

import java.util.List;

public class StringUtil {

    /*
     * BAD (Operational Spec):
     * Iterates over words using a for loop, appends delimiter if i > 0 to avoid 
     * trailing separators, builds result via StringBuilder, and calls toString().
     */

    /**
     * GOOD (Declarative Spec):
     * Returns a string containing all elements joined in order by the given delimiter.
     * Returns an empty string if words is empty.
     *
     * @param words elements to join (non-null)
     * @param delimiter separator string (non-null)
     * @return joined string result
     * @throws IllegalArgumentException if words or delimiter is null
     */
    public static String joinStrings(List<String> words, String delimiter) {
        if (words == null || delimiter == null) {
            throw new IllegalArgumentException("Arguments must not be null");
        }
        if (words.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            sb.append(words.get(i));
        }
        return sb.toString();
    }
}