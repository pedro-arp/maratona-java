package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.model.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.model.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345-123");
        Pessoa pessoa = new Pessoa("Bianca");
        pessoa.setCpf("123.345.789-01");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Pedro Augusto");
        funcionario.setCpf("321.654.987.01");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1375.50);

        System.out.println("-----------------");
        funcionario.imprime();

        System.out.println("-----------------");
        funcionario.relatorioPagamento();

    }
}
