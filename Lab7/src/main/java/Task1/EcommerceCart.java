/*
  @author Wholly Solly Store
 */

package Task1;

public class EcommerceCart {
    private PaymentMethod paymentMethod;

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean checkout(double amount) {
        if (paymentMethod == null) {
            System.out.println("Error: No payment method configured!");
            return false;
        }
        return paymentMethod.pay(amount);
    }
}
