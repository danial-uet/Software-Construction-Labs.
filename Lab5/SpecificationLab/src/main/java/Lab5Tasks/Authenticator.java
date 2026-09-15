package Lab5Tasks;

import java.util.HashMap;
import java.util.Map;

public class Authenticator {

    private final Map<String, char[]> idCache = new HashMap<>();

    public Authenticator() {
        // Pre-populate with sample 9-digit MIT ID
        idCache.put("user1", "123456789".toCharArray());
    }

    /**
     * INSECURE: Returns direct reference to cached char array.
     * Clients can mutate the array and corrupt internal cache.
     */
    public char[] getMitId(String username) {
        return idCache.get(username);
    }

    /**
     * SECURE: Returns an immutable String representation.
     * Prevents client modification from corrupting the internal state.
     */
    public String getMitIdSecure(String username) {
        char[] cached = idCache.get(username);
        return cached != null ? new String(cached) : null;
    }
}