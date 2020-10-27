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

    public List<WeekEntry> Dataset;

    Dataset.add(new WeekEntry(LocalDate.of(2020, 11, 30), LocalDate.of(2020, 12, 6), "Damian", "Marcel"));
    Dataset.add(new WeekEntry(LocalDate.of(2020, 12, 7), LocalDate.of(2020, 12, 13), "Dario", "Jara"));
    Dataset.add(new WeekEntry(LocalDate.of(2020, 12, 14), LocalDate.of(2020, 12, 20), "Simon B.", "Benedikt"));
    Dataset.add(new WeekEntry(LocalDate.of(2021, 1, 4), LocalDate.of(2021, 1, 10), "Nicolas", "Alex"));
    Dataset.add(new WeekEntry(LocalDate.of(2021, 1, 11), LocalDate.of(2021, 1, 17), "Manuel", "Luca"));
    Dataset.add(new WeekEntry(LocalDate.of(2021, 1, 18), LocalDate.of(2021, 1, 14), "Jens", "Patrick"));
}
