package academy.devdojo.maratonajava.javacore.Rdates.test.TemporalAdjusterExercicio;

import java.time.LocalDate;


public class TemporalAdjusterExercice {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = now.with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate diaChoose = LocalDate.of(2002,2,24).with(new ObterProximoDiaUtil());
        System.out.println(diaChoose);
        System.out.println(diaChoose.getDayOfWeek());
    }
}