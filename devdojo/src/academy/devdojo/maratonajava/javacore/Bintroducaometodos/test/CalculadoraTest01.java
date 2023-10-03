package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros01();
        System.out.println("Fim da soma");
        calculadora.subtraiDoisNumeros01();
        System.out.println("Fim da subtração");

    }

}
