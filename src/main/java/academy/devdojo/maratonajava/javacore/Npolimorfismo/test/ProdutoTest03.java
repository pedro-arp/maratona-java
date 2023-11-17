package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.model.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produtoComputador = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate Irlandês", 12);
        tomate.setDataValidade("1 semana");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----");
        CalculadoraImposto.calcularImposto(produtoComputador);
    }
}
