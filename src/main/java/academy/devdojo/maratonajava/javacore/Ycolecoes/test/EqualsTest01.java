package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.model.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC", "iPhone");
        Smartphone s2 = new Smartphone("1ABC", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
