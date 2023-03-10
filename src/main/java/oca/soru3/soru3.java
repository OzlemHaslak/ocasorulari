package oca.soru3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class soru3 {
    public static void main (String[] args) {
        String date = LocalDate
                .parse("2014-05-04T01")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}
// runtime error time degeri verilmemis
