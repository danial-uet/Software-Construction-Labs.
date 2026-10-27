/*
  @author Wholly Solly Store
 */

package Task1;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing $" + amount + " via Credit Card.");
        return true;
    }
}
