package io.codelex.classesandobjects.practice.exercise_5;

public class DateTest {
    public static void main(String[] args) {

        Date date = new Date("January", 7, 2021);

        Date.displayDate(date.getMonth(), date.getDay(), date.getYear());

        date.setDay(8);
        date.setMonth("March");
        date.setYear(2022);

        date.displayDate(date.getMonth(), date.getDay(), date.getYear());
    }
}
