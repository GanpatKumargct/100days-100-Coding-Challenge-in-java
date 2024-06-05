package com.Ganpat.Challenge97;

public enum Day {
    Sunday(false),
    Monday(true),
    Tuesday(true),
    Wednesday(true),
    Thuresday(true),
    Friday(true),
    Saturesday(false);

    private final boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public String getType(){
        return isWeekDay? "WeekDay" : "Weekend";
    }
}
