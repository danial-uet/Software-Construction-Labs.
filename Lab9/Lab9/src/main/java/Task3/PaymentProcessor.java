package Task3;

public class PaymentProcessor {
    public void charge(String txId, double amount) {
        // Simulate MDC injection and try-finally cleanup to prevent thread leaks
        try {
            System.out.println("[TraceID: " + txId + "] Processing payment...");
            // Simulated payment processing logic
            System.out.println("Charged amount: " + amount);
        } finally {
            System.out.println("[TraceID: " + txId + "] Context Cleared");
        }
    }
}