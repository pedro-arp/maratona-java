package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBlundleTest01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(bundle.getString("hi"));

        String hello = bundle.getString("hello");
        String goodMorning = bundle.getString("good.morning");
        System.out.println("\n" + hello);
        System.out.println(goodMorning);

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        hello = bundle.getString("hello");
        goodMorning = bundle.getString("good.morning");
        System.out.println("\n" + hello);
        System.out.println(goodMorning);

        System.out.println(bundle.getString("hi"));
    }
}