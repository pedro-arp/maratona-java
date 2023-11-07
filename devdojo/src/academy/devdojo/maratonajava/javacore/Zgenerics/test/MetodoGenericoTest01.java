package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.model.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
     criarArrayComUmObjeto(new Barco("Canoa"));
    }
    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}
