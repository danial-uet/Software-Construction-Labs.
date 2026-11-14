package Task1;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String recipient, String message) {
        // Replaces static EmailClient dependency
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}