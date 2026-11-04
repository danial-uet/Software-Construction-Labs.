package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2Runner {
    public static void main(String[] args) {
        OrderBillingEngine engine = new OrderBillingEngine();
        
        Map sampleOrder = new HashMap();
        sampleOrder.put("customerEmail", "test@student.com");
        sampleOrder.put("customerType", "VIP");
        sampleOrder.put("country", "PK");
        sampleOrder.put("paymentMethod", "CREDIT_CARD");
        sampleOrder.put("cardNumber", "1234567890123456");
        
        List items = new ArrayList();
        Map item = new HashMap();
        item.put("name", "Laptop");
        item.put("price", 10000.0);
        item.put("quantity", 1);
        items.add(item);
        
        sampleOrder.put("items", items);

        boolean success = engine.processOrder(sampleOrder);
        if (success) {
            System.out.println("Task 2 Execution Result: SUCCESS");
        } else {
            System.out.println("Task 2 Execution Result: FAILED");
        }
    }
}