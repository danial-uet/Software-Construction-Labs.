/*
  @author Wholly Solly Store
 */

package Task1;

public class JazzCashPayment implements PaymentMethod {
    private String phoneNumber;

    public JazzCashPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing Rs. " + amount + " via JazzCash Account (" + phoneNumber + ").");
        return true;
    }
}