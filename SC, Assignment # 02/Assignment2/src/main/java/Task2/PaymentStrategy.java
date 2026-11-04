package Task2;

import java.util.Map;

public interface PaymentStrategy {
    boolean processPayment(double amount, Map<String, Object> orderData);
}
