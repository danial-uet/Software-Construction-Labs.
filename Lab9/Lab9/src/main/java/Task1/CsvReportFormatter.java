package Task1;

import java.util.List;

public class CsvReportFormatter implements ReportFormatter {
    @Override
    public String format(List<String> data) {
        String output = String.join(",", data); // Fixes Smell 1: Efficient concatenation
        System.out.println("Writing CSV: " + output);
        return output;
    }
}