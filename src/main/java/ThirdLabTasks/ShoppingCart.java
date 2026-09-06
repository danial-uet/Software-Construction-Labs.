/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThirdLabTasks;

/**
 *
 * @author Wholly Solly Store
 */
public class ShoppingCart {
    // Array backing storage to bypass the module path collection error
    private final String[] items = new String[100]; 
    private int size = 0;
    
    // Requirement 1: Add item
    public void addItem(String item) { 
        if (size < items.length) {
            items[size] = item; 
            size++;
        }
    }
    
    // Requirement 2: Remove item & handle non-existent items safely
    public void removeItem(String item) { 
        for (int i = 0; i < size; i++) {
            if (items[i] != null && items[i].equals(item)) {
                // Shift items left to fill the empty array slot
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[size - 1] = null;
                size--;
                return; 
            }
        }
    } 
    
    // Requirement 3: Get item count
    public int getItemCount() { 
        return size; 
    }
    
    // Requirement 4: Clear cart
    public void clear() { 
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0; 
    }
}
