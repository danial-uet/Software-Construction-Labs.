package Task2;

import java.util.Map;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String email, double payableAmount, Map<String, Object> orderData) {
        System.out.println("[EMAIL DISPATCHED] To: " + email + " | Your order of PKR " + String.format("%.2f", payableAmount) + " is confirmed!");
    }
}