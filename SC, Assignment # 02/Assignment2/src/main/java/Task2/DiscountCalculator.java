package Task2;

import java.util.List;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double rawTotal, List<OrderItem> items) {
        double discount = 0.0;
        switch (customerType) {
            case "VIP" -> {
                if (rawTotal > 5000) {
                    discount = rawTotal * 0.15;
                } else {
                    discount = rawTotal * 0.10;
                }
            }
            case "STUDENT" -> discount = rawTotal * 0.08;
            case "CORPORATE" -> {
                if (items.size() >= 10) {
                    discount = rawTotal * 0.20;
                } else {
                    discount = rawTotal * 0.05;
                }
            }
            default -> {
                if (rawTotal > 10000) {
                    discount = 500.0;
                }
            }
        }
        return discount;
    }
}