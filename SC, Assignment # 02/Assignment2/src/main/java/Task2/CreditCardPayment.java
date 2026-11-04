package Task2;

import java.util.Map;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount, Map<String, Object> orderData) {
        String cardNumber = (String) orderData.getOrDefault("cardNumber", "");
        if (cardNumber.length() == 16 && cardNumber.matches("\\d+")) {
            System.out.println("Processing credit card payment of PKR " + amount);
            return true;
        }
        System.out.println("Card declined: Must be 16 digits.");
        return false;
    }
}