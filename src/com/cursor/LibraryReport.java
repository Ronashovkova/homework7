package com.cursor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class LibraryReport {
    private Map<LocalDate, String> dateToBookMap = new HashMap<>();

    public void put(LocalDate date, String bookTitle) {
        dateToBookMap.put(date, bookTitle);
    }

    public void getByDate(LocalDate date) {
        String bookByDate = dateToBookMap.get(date);
        if (bookByDate == null) {
            System.out.println("There are no books for this date.");
        } else {
            System.out.println("The book for this day is '" + bookByDate + "'");
        }
    }

    public void showUsingDates() {
        System.out.println("Written dates in the Library report: ");
        System.out.println(dateToBookMap.keySet());
        }

    public void showUsingTitles() {
        System.out.println("Written book titles in the Library report: ");
        System.out.println(dateToBookMap.values());
    }
}

