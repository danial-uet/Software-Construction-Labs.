package Task3;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        // Test execution demonstrating MDC trace tracking and context clearance
        processor.charge("TXN-998877", 1500.00);
    }
}