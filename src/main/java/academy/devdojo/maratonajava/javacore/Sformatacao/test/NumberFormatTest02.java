package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeNL = new Locale("nl", "NL");
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeDefault);
        nfa[1] = NumberFormat.getCurrencyInstance(localeNL);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeUS);

        double valor = 1000.2139;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "￥1,000";


        try {
            System.out.println(" ");
            System.out.println(nfa[2].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
