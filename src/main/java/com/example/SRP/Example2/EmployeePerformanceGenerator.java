package com.example.SRP.Example2;

public class EmployeePerformanceGenerator {
    public String generateReport(String reportType, Employee employee) {
        if (reportType.equalsIgnoreCase("PDF")) {
            return "Generating PDF report";
        } else if (reportType.equalsIgnoreCase("Word")) {
            return "Generating Word report";
        }
        return "Report type not supported!";
    }
}
// This class follows single responsibility principle