package Task2;

import java.util.Map;

public class CashOnDeliveryPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount, Map<String, Object> orderData) {
        if (amount > 25000) {
            System.out.println("Cash on delivery not allowed for orders above PKR 25,000.");
            return false;
        }
        System.out.println("Cash on delivery selected. Status: PENDING_CASH");
        return true;
    }
}