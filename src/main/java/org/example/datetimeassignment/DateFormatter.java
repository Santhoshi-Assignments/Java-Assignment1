package org.example.datetimeassignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        String formattedDate = currentDate.format(formatter);

        System.out.println("Formatted current date: " + formattedDate);
    }
}
