package academy.devdojo.maratonajava.javacore.Gassociacao.test.leituradedados;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande Software de previsão do Futuro");
        System.out.println("Digite a sua pergunta e eu responderei Sim ou Não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
