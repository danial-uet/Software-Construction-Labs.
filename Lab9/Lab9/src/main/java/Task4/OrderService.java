package Task4;

public class OrderService {
    private final VipDiscount vipDiscount;

    public OrderService(VipDiscount vipDiscount) {
        this.vipDiscount = vipDiscount;
    }

    public double calculateTotal(double rawAmount, boolean isVip) {
        if (isVip) {
            return vipDiscount.apply(rawAmount); // Calculates total without touching a database
        }
        return rawAmount;
    }
}