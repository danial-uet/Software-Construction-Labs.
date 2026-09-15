package Lab5Tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticatorTest {

    @Test
    void testInsecureGetMitId_MutatesInternalCache() {
        Authenticator auth = new Authenticator();
        
        // Retrieve internal array reference
        char[] clientArray = auth.getMitId("user1");
        
        // Client modifies first 5 digits to '*'
        for (int i = 0; i < 5; i++) {
            clientArray[i] = '*';
        }

        // Verify that internal cache was unintentionally corrupted
        char[] corruptedCache = auth.getMitId("user1");
        assertEquals("*****6789", new String(corruptedCache));
    }

    @Test
    void testSecureGetMitId_PreventsCacheCorruption() {
        Authenticator auth = new Authenticator();
        
        String secureId = auth.getMitIdSecure("user1");
        assertEquals("123456789", secureId);
        
        // Internal state remains untouched when fetched again
        assertEquals("123456789", auth.getMitIdSecure("user1"));
    }
}