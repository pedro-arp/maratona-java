package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        Televisao televisao = new Televisao("Samsung", 2500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
