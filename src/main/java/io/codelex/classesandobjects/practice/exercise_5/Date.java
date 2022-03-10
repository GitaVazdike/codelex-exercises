package io.codelex.classesandobjects.practice.exercise_5;

public class Date {
    private String month;
    private int day;
    private int year;

    public Date(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void displayDate(String month, int day, int year) {
        System.out.printf("%s/%d/%d\n", month, day, year);
    }
}
