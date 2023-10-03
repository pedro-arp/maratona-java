package academy.devdojo.maratonajava.javacore.Gassociacao.test.leituradedados;

import java.util.Scanner;

public class LeituraDeDadosDoTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite a sua idade");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para o seu sexo");
        char sexo = input.next().charAt(0);
        System.out.println("----------");
        System.out.println("Bem vindo, " + nome + " ! Você possui " + idade + " anos e o seu sexo é " + sexo);
    }
}
