package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoiNumerosComRetorno03(10, 2);
        System.out.println(result);

        System.out.println("-------------------");

        calculadora.imprimeDivisaoDeDoisNumerosSemRetorno03(100, 4);
    }
}
