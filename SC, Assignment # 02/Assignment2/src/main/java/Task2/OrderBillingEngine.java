package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderBillingEngine {
    private final OrderRepository orderRepository;
    private final DiscountCalculator discountCalculator;
    private final TaxCalculator taxCalculator;

    public OrderBillingEngine() {
        this.orderRepository = new FileOrderRepository();
        this.discountCalculator = new DiscountCalculator();
        this.taxCalculator = new TaxCalculator();
    }

    @SuppressWarnings("unchecked")
    public boolean processOrder(Map<String, Object> orderData) {
        if (orderData == null || orderData.isEmpty()) {
            System.out.println("Error: Order data is empty!");
            return false;
        }

        String email = (String) orderData.get("customerEmail");
        if (email == null || !email.contains("@")) {
            System.out.println("Error: Invalid customer email!");
            return false;
        }

        Object rawItemsObj = orderData.get("items");
        if (rawItemsObj == null || !(rawItemsObj instanceof List)) {
            System.out.println("Error: Cart has no items!");
            return false;
        }

        List<?> rawList = (List<?>) rawItemsObj;
        if (rawList.isEmpty()) {
            System.out.println("Error: Cart has no items!");
            return false;
        }

        // Safely parse raw maps into strongly-typed OrderItem objects
        List<OrderItem> items = new ArrayList<>();
        double rawTotal = 0.0;

        for (Object obj : rawList) {
            if (!(obj instanceof Map)) {
                System.out.println("Error: Invalid item format!");
                return false;
            }
            Map<String, Object> itemMap = (Map<String, Object>) obj;

            if (!itemMap.containsKey("price") || !itemMap.containsKey("quantity")) {
                System.out.println("Error: Missing item price or quantity!");
                return false;
            }

            double price = ((Number) itemMap.get("price")).doubleValue();
            int quantity = ((Number) itemMap.get("quantity")).intValue();

            if (price <= 0 || quantity <= 0) {
                System.out.println("Error: Invalid price or quantity for item!");
                return false;
            }

            String itemName = (String) itemMap.getOrDefault("name", "Generic Item");
            OrderItem orderItem = new OrderItem(itemName, price, quantity);
            items.add(orderItem);
            rawTotal += orderItem.getTotalPrice();
        }

        String customerType = (String) orderData.getOrDefault("customerType", "REGULAR");
        double discount = discountCalculator.calculateDiscount(customerType, rawTotal, items);
        double netAmount = rawTotal - discount;

        String country = (String) orderData.getOrDefault("country", "PK");
        double taxRate = taxCalculator.getTaxRate(country);
        double tax = netAmount * taxRate;
        double payableAmount = netAmount + tax;

        // Strategy Pattern for Payment Selection
        String paymentMethod = (String) orderData.getOrDefault("paymentMethod", "CASH");
        PaymentStrategy paymentStrategy = switch (paymentMethod) {
            case "CREDIT_CARD" -> new CreditCardPayment();
            case "EASYPAISA" -> new EasyPaisaPayment();
            case "CASH_ON_DELIVERY" -> new CashOnDeliveryPayment();
            default -> null;
        };

        if (paymentStrategy == null) {
            System.out.println("Error: Unsupported payment method: " + paymentMethod);
            return false;
        }

        boolean paymentSuccess = paymentStrategy.processPayment(payableAmount, orderData);
        if (!paymentSuccess) {
            return false;
        }
        String paymentStatus = "CASH_ON_DELIVERY".equals(paymentMethod) ? "PENDING_CASH" : "PAID";

        // Save via Repository
        orderRepository.saveOrder(email, payableAmount, paymentStatus);

        // Notification selection
        String notifyChannel = (String) orderData.getOrDefault("notifyChannel", "EMAIL");
        NotificationService notificationService = notifyChannel.equals("SMS") 
            ? new SmsNotificationService() 
            : new EmailNotificationService();
        
        notificationService.sendNotification(email, payableAmount, orderData);

        return true;
    }

    public void setLogFilePath(String path) {
        orderRepository.setLogFilePath(path);
    }

    public String getLogFilePath() {
        return orderRepository.getLogFilePath();
    }
}