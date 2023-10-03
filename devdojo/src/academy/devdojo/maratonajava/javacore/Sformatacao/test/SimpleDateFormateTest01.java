package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateTest01 {
    public static void main(String[] args) {
        String pattern = "'São Paulo,' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.format(new Date());
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("São Paulo, 27 de setembro de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
