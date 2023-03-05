package soru115;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class soru115 {
    public static void main(String[] args) {


    LocalDate date1 = LocalDate.now();
    LocalDate date2 = LocalDate. of (2014, 2, 6 ) ;
    LocalDate date3 = LocalDate.parse("2014-06-02", DateTimeFormatter.ISO_DATE);

    {
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
    }
}}
