package Interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateUtility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(DateFormatter.formatDate(today, "dd/MM/yyyy"));
        System.out.println(DateFormatter.formatDate(today, "MMMM dd, yyyy"));
    }
}

