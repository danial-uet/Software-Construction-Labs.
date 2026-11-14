package Task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sampleData = Arrays.asList("ID", "Name", "Department", "Active");

        // 1. Test PDF Report with Email Notification
        System.out.println("--- Testing PDF Generation ---");
        ReportFormatter pdfFormatter = new PdfReportFormatter();
        Notifier emailNotifier = new EmailNotifier();
        ReportManager pdfManager = new ReportManager(pdfFormatter, emailNotifier);
        pdfManager.generate(sampleData, true, "admin@company.com");

        System.out.println("\n--- Testing CSV Generation ---");
        // 2. Test CSV Report without Email Notification
        ReportFormatter csvFormatter = new CsvReportFormatter();
        ReportManager csvManager = new ReportManager(csvFormatter, emailNotifier);
        csvManager.generate(sampleData, false, "admin@company.com");
    }
}