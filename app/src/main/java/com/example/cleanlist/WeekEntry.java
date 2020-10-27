package com.example.cleanlist;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class WeekEntry {

    public LocalDate startDate;
    public LocalDate endDate;
    public String firstName;
    public String secondName;

    public WeekEntry(LocalDate startDate, LocalDate endDate, String firstName, String secondName) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
