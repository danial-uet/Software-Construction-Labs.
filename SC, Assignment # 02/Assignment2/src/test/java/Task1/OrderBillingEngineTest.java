package Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class OrderBillingEngineTest {

    private OrderBillingEngine engine;

    @BeforeEach
    public void setUp() {
        engine = new OrderBillingEngine();
        // Redirect log file path to avoid permission issues during testing
        engine.setLogFilePath("test_order_audit.log");
    }

    @Test
    public void testNullOrEmptyOrderData() {
        assertFalse(engine.processOrder(null), "Should fail for null order data");
        assertFalse(engine.processOrder(new HashMap()), "Should fail for empty order data");
    }

    @Test
    public void testInvalidCustomerEmail() {
        Map order = new HashMap();
        order.put("customerEmail", "invalid-email-format");
        
        List items = new ArrayList();
        Map item = new HashMap();
        item.put("price", 1000.0);
        item.put("quantity", 1);
        items.add(item);
        order.put("items", items);

        assertFalse(engine.processOrder(order), "Should fail for email without '@'");
    }

    @Test
    public void testEmptyCartItems() {
        Map order = new HashMap();
        order.put("customerEmail", "test@customer.com");
        order.put("items", new ArrayList()); // Empty items list

        assertFalse(engine.processOrder(order), "Should fail when cart has no items");
    }

    @Test
    public void testMissingPriceOrQuantity() {
        Map order = new HashMap();
        order.put("customerEmail", "test@customer.com");
        
        List items = new ArrayList();
        Map item = new HashMap();
        item.put("name", "Laptop");
        // Missing price and quantity intentionally
        items.add(item);
        order.put("items", items);

        assertFalse(engine.processOrder(order), "Should fail if item price or quantity is missing");
    }

    @Test
    public void testInvalidPriceOrQuantityValues() {
        Map order = new HashMap();
        order.put("customerEmail", "test@customer.com");
        
        List items = new ArrayList();
        Map item = new HashMap();
        item.put("price", -500.0); // Negative price
        item.put("quantity", 1);
        items.add(item);
        order.put("items", items);

        assertFalse(engine.processOrder(order), "Should fail for negative or zero prices/quantities");
    }

    @Test
    public void testVipDiscountAndCreditCardPayment() {
        Map order = new HashMap();
        order.put("customerEmail", "vip@customer.com");
        order.put("customerType", "VIP");
        order.put("country", "PK");
        order.put("paymentMethod", "CREDIT_CARD");
        order.put("cardNumber", "1234567890123456"); // Valid 16-digit card

        List items = new ArrayList();
        Map item = new HashMap();
        item.put("price", 6000.0);
        item.put("quantity", 1);
        items.add(item);
        order.put("items", items);

        assertTrue(engine.processOrder(order), "VIP order with valid credit card should process successfully");
    }

    @Test
    public void testStudentDiscountAndEasyPaisaPayment() {
        Map order = new HashMap();
        order.put("customerEmail", "student@uet.edu.pk");
        order.put("customerType", "STUDENT");
        order.put("country", "PK");
        order.put("paymentMethod", "EASYPAISA");
        order.put("mobileNumber", "03001234567"); // Valid Pakistani mobile format

        List items = new ArrayList();
        Map item = new HashMap();
        item.put("price", 2000.0);
        item.put("quantity", 2);
        items.add(item);
        order.put("items", items);

        assertTrue(engine.processOrder(order), "Student order with EasyPaisa should process successfully");
    }

    @Test
    public void testCashOnDeliveryLimitExceeded() {
        Map order = new HashMap();
        order.put("customerEmail", "buyer@customer.com");
        order.put("customerType", "REGULAR");
        order.put("country", "PK");
        order.put("paymentMethod", "CASH_ON_DELIVERY");

        List items = new ArrayList();
        Map item = new HashMap();
        item.put("price", 30000.0); // High total exceeding 25,000 COD limit
        item.put("quantity", 1);
        items.add(item);
        order.put("items", items);

        assertFalse(engine.processOrder(order), "COD should fail if payable amount exceeds PKR 25,000 limit");
    }
}