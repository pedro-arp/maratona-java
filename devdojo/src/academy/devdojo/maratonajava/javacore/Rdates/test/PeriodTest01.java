package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = now.plusYears(2);
        LocalDate birthdayPedro = LocalDate.of(2002, Month.FEBRUARY, 24);
        LocalDate birthdayBianca = LocalDate.of(2002, Month.JULY, 6);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.between(birthdayPedro, birthdayBianca);
        Period p4 = Period.ofMonths(p3.getMonths());
        Period p5 = Period.ofDays(p3.getDays());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
