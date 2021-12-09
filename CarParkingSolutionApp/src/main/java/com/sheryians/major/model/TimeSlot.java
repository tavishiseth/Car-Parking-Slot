package com.sheryians.major.model;

public enum TimeSlot {
    T1("10:00-11:00"),
    T2("11:00-12:00"),
    T3("12:00-13:00"),
    T4("13:00-14:00"),
    T5("14:00-15:00"),
    T6("15:00-16:00"),
    T7("16:00-17:00"),
    T8("17:00-18:00"),
    T9("18:00-19:00"),
    T10("19:00-20:00"),
    T11("20:00-21:00"),
    T12("21:00-22:00");

    private String timeslot;

    TimeSlot(String s) {
        this.timeslot = s;
    }

    public String getName(){
        return this.timeslot;
    }
}
