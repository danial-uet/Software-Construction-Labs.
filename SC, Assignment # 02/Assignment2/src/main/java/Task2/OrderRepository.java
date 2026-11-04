package Task2;

public interface OrderRepository {
    void saveOrder(String email, double payableAmount, String paymentStatus);
    void setLogFilePath(String path);
    String getLogFilePath();
}