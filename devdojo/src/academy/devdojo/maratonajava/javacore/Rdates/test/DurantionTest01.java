package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurantionTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = now.plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = timeNow.minusHours(7);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);

        System.out.println(d1);
        System.out.println(d2);
    }
}
