package Task1;

import java.util.List;
import java.util.Objects;

public class ReportManager {
    private final ReportFormatter formatter;
    private final Notifier notifier;

    // Fixes Smell 4: Inject dependencies via constructor
    public ReportManager(ReportFormatter formatter, Notifier notifier) {
        this.formatter = Objects.requireNonNull(formatter, "Formatter cannot be null");
        this.notifier = Objects.requireNonNull(notifier, "Notifier cannot be null");
    }

    public void generate(List<String> data, boolean sendEmail, String recipient) {
        Objects.requireNonNull(data, "Data cannot be null");
        String output = formatter.format(data); // Fixes Smell 3: Polymorphism eliminates conditionals

        if (sendEmail) {
            notifier.send(recipient, output);
        }
    }
}