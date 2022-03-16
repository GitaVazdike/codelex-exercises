package io.codelex.practice.dateperiod;

import java.time.LocalDate;

public class DatePeriod {

    private LocalDate startDate;
    private LocalDate endDate;

    public DatePeriod(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public DatePeriod intersection(DatePeriod second) {
        if (startDate.isBefore(second.endDate)
                && endDate.isAfter(second.endDate)
                && startDate.isAfter(second.startDate)) {
            return new DatePeriod(startDate, second.endDate);
        } else if (startDate.isBefore(second.startDate)
                && endDate.isAfter(second.startDate)
                && endDate.isBefore(second.endDate)) {
            return new DatePeriod(second.startDate, endDate);
        } else if (startDate.isBefore(second.startDate)
                && endDate.isAfter(second.endDate)) {
            return new DatePeriod(second.startDate, second.endDate);
        } else if (startDate.isAfter(second.startDate)
                && endDate.isBefore(second.endDate)) {
            return new DatePeriod(startDate, endDate);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return
                "Overlap startDate = " + startDate +
                        ", overlap endDate = " + endDate;
    }
}
