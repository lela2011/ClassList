package com.example.cleanlist;

import java.util.Date;

public class WeekEntry {

    public Date startDate;
    public Date endDate;
    public String firstName;
    public String secondName;

    public WeekEntry(Date startDate, Date endDate, String firstName, String secondName) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
