package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());

        LocalDate dateBirth = LocalDate.of(2002,2,24);
        System.out.println(dateBirth + "\n");

        LocalDate dateNow = LocalDate.now();

        System.out.println(dateNow + "\n");
        System.out.println(dateNow.getMonth());
        System.out.println(dateNow.getYear());
        System.out.println(dateNow.getMonthValue());
        System.out.println(dateNow.getDayOfWeek());
        System.out.println(dateNow.lengthOfMonth());
        System.out.println(dateNow.isLeapYear());
        System.out.println(dateNow.getYear());
        System.out.println(dateNow.getDayOfMonth());
    }
}
