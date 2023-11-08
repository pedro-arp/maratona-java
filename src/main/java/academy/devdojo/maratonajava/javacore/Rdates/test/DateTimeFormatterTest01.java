package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20020224", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2002-02-24", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2002-02-24", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("\n" + parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("\n" + s4);

        LocalDateTime parse4 = LocalDateTime.parse("2023-09-28T21:12:00.5487599");
        System.out.println(parse4);

        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBrasil);
        System.out.println("\n" + formatBR);
        LocalDate parseBR = LocalDate.parse("24/02/2022", formatterBrasil);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("24.Februar.2002", formatterGR);
        System.out.println(parseGR);
    }
}