package Task2;

import java.util.Map;

public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String email, double payableAmount, Map<String, Object> orderData) {
        String phone = (String) orderData.getOrDefault("phone", "0300-0000000");
        System.out.println("[SMS DISPATCHED] To: " + phone + " | Order confirmed! Paid: PKR " + String.format("%.2f", payableAmount));
    }
}