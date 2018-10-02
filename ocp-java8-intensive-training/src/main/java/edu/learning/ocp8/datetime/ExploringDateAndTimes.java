package edu.learning.ocp8.datetime;

import java.time.*;

public class ExploringDateAndTimes {

    public static void main(String... args) {
        LocalTime.parse("10:05");

        LocalDate.ofYearDay(2016, 366);

        LocalDate lc = LocalDate.of(2016,1,31).plusMonths(1);
        System.out.println("January + 1 month");
        System.out.println(lc);

        datesNow();
        printLocalDateTime();
        printYear();
        printPeriods();
        printYears();
    }

    private static void duration() {
        Duration due = Duration.ofDays(-3);
        LocalDate ld = LocalDate.of(2016,1,1);
        //System.out.println(ld.plus(due.toDays()));
    }

    private static void datesNow() {
        LocalDate lc = LocalDate.of(2015, 1, 31).now();
        lc.plusYears(2);
        System.out.println("datesNow:");
        System.out.println(lc);
    }

    private static void printLocalDateTime() {
        LocalDateTime lct = LocalDateTime.of(LocalDate.of(2015, 1, 1), LocalTime.of(11, 21));
        lct = lct.withDayOfMonth(12);
        System.out.println("printLocalDateTime");
        System.out.println(lct.getMonth()+":"+lct.getDayOfMonth()+":"+lct.getHour());
    }

    private static void printYear() {
        Year y = Year.of(1991);
        LocalDate loc = y.atDay(32);
        LocalDateTime ldt = loc.atStartOfDay();
        System.out.println("printYear:");
        System.out.println(ldt);
    }

    private static void printPeriods() {
        Period p = Period.ofMonths(2);
        p = p.plusYears(1);
        System.out.println("printPeriods");
        System.out.println(p);
        p = p.withYears(2);
        System.out.println("printPeriods");
        System.out.println(p);
    }


    private static void printYears() {
        Year y = Year.of(2014);
        LocalDate ym = y.atMonthDay(MonthDay.of(3,3));
        System.out.println("printYears");
        System.out.println(ym);
    }
}
