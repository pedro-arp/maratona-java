package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate birthdayPedro = LocalDate.of(2002, Month.FEBRUARY, 24);
        LocalDate birthdayBianca = LocalDate.of(2002, Month.JULY, 6);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(birthdayPedro, birthdayBianca));
        System.out.println(ChronoUnit.WEEKS.between(birthdayPedro, now));


    }
}
