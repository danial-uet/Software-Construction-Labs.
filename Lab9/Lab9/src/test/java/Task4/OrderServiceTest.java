package Task4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void calculateTotal_appliesVipDiscount_withoutTouchingDatabase() {
        // Arrange
        VipDiscount discount = new VipDiscount();
        OrderService orderService = new OrderService(discount);
        double rawAmount = 200.0;

        // Act
        double finalTotal = orderService.calculateTotal(rawAmount, true);

        // Assert
        assertEquals(160.0, finalTotal, 0.001);
    }
}