/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ThirdLabTasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Wholly Solly Store
 */
public class ShoppingCartTest {

    @Test
    public void testShoppingCartFulfillsAllRequirements() {
        ShoppingCart cart = new ShoppingCart();
        
        // Requirement Rule 1: Add 3 items → count = 3
        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");
        assertEquals(3, cart.getItemCount());
        
        // Requirement Rule 2: Remove 1 item → count = 2
        cart.removeItem("Mouse");
        assertEquals(2, cart.getItemCount());
        
        // Requirement Rule 4: Removing a non-existent item doesn’t throw an error
        assertDoesNotThrow(() -> {
            cart.removeItem("Headphones");
        });
        assertEquals(2, cart.getItemCount()); // Verification that count is untouched
        
        // Requirement Rule 3: Clear cart → count = 0
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }
}
