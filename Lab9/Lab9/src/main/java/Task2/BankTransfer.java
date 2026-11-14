package Task2;

import java.math.BigDecimal;
import java.util.Objects;

public final class BankTransfer {
    private final String fromAccount;
    private final String toAccount;
    private final BigDecimal amount;

    public BankTransfer(String fromAccount, String toAccount, BigDecimal amount) {
        this.fromAccount = Objects.requireNonNull(fromAccount, "Source account cannot be null");
        this.toAccount = Objects.requireNonNull(toAccount, "Destination account cannot be null");
        this.amount = Objects.requireNonNull(amount, "Amount cannot be null");
        
        if (this.amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Transfer amount must be strictly positive");
        }
    }

    public String getFromAccount() { return fromAccount; }
    public String getToAccount() { return toAccount; }
    public BigDecimal getAmount() { return amount; }

    @Override
    public String toString() {
        return "BankTransfer{from=" + fromAccount + ", to=" + toAccount + ", amount=" + amount + "}";
    }
}