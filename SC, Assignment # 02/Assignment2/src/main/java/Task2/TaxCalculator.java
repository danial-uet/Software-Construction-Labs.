package Task2;

public class TaxCalculator {
    public double getTaxRate(String country) {
        return switch (country) {
            case "PK" -> 0.17;
            case "US" -> 0.08;
            case "UK" -> 0.20;
            default -> 0.15;
        };
    }
}