package Task2;

public interface NotificationService {
    void sendNotification(String recipient, double payableAmount, java.util.Map<String, Object> orderData);
}