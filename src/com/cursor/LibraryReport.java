package com.cursor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class LibraryReport {
    private Map<LocalDate, String> libraryReport = new HashMap<>();

    public void put(LocalDate date, String bookTitle) {
        libraryReport.put(date, bookTitle);
    }

    public String getByDate(LocalDate date) {
        String bookByDate = getLibraryReport().get(date);
        if (bookByDate == null) {
            System.out.println("There are no books for this date.");
        } else {
            System.out.println("The book for this day is '" + bookByDate + "'");
        }
        return bookByDate;
    }

    public void showUsingDates() {
        System.out.println("Written dates in the Library report: ");
        for (LocalDate date : libraryReport.keySet()) {
            System.out.println(date);
        }
    }

    public void showUsingTitles() {
        System.out.println("Written book titles in the Library report: ");
        for (String titles: libraryReport.values()) {
            System.out.println(titles);
        }
    }

    public Map<LocalDate, String> getLibraryReport() {
        return libraryReport;
    }
}




