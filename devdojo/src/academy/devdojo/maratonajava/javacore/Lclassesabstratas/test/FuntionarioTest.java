package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.model.Gerente;

public class FuntionarioTest {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Pedro Augusto", 1500);
        Gerente gerente = new Gerente("Bianca Violante", 3000);
        //System.out.println(funcionario);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro Augusto", 1234);
        gerente.imprime();
        System.out.println(gerente);
        System.out.println("-----------");
        desenvolvedor.imprime();
        System.out.println(desenvolvedor);
    }
}
