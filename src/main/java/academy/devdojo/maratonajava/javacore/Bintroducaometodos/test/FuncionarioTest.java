package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.exercicio.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.exercicio.FuncionarioImpressora;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.exercicio.FuncionarioMediaSalario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        FuncionarioImpressora imprimir = new FuncionarioImpressora();
        FuncionarioMediaSalario mediaSalario = new FuncionarioMediaSalario();

        funcionario.setNome("Pedro");
        funcionario.setIdade(21);
        funcionario.setSalario(new int[]{1000, 1200, 1600});
      

        imprimir.imprimir(funcionario);
        mediaSalario.imprimirMedia(funcionario);
    }
}
