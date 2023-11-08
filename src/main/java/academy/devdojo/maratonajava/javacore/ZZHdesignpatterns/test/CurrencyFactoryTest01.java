package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.model.Country;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.model.Currency;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.model.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
