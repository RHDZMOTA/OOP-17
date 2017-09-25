package com.iteso.test;

import com.iteso.calendar.Date;

@SuppressWarnings("ALL")
public class TestDate {
    public static void main(String[] args) {

        // a) Default date
        Date d1 = new Date();

        // b) Date: 31/12/2016
        Date d2 = new Date(31, 12, 2016, 0);

        // c) Clone of d1
        Date d3 = d1.clone();

        // d) Create new date with properties of d1, d2, d3
        Date d4 = new Date(d1.getDay(), d2.getMonth(), d3.getYear(), d1.getFormat());

        // e)
        Date d5 = new Date(
                d2.next().getDay(), d2.next().getMonth(), d2.next().getYear());

        // f)
        d3.setMonth(4);

        // g)
        System.out.println(d1.equals(d3));

        // h)
        System.out.println(d1.equals(d5));

        // i) Print
        Date[] dates = new Date[] {d1, d2, d3, d4, d5};
        for (Date date : dates) {
            for (int f : new int[] {0, 1, 2}) {
                date.setFormat(f);
                System.out.println(date);
            }
        }
    }
}
