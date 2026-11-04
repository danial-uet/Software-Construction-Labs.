package Task2;

import java.util.Map;

public class EasyPaisaPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount, Map<String, Object> orderData) {
        String mobileNo = (String) orderData.getOrDefault("mobileNumber", "");
        if (mobileNo.length() == 11 && mobileNo.startsWith("03")) {
            System.out.println("Sending EasyPaisa OTP push to " + mobileNo + " for PKR " + amount);
            return true;
        }
        System.out.println("EasyPaisa failed: Invalid mobile number.");
        return false;
    }
}