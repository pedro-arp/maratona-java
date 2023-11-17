package academy.devdojo.maratonajava.introducao.operadores;

public class Lógicos {
    public static void main(String[] args) {
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 == 20;
        System.out.println("isDezMaiorQueVinte "  + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);
        // && (AND) || (OR) !
        System.out.println("------------------------------------");
        int idade = 30;
        double salario = 1;

        if ( idade >= 30 ){
            salario = 4500;
        }else {
            salario = 2500;
        }
        System.out.println("Voce tem que receber " + salario + " euros, porque vc tem " + idade + " anos | LeiMaiorQueTrinta");
        System.out.println("------------------------------------");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        if (valorTotalContaPoupanca >= 5000 || valorTotalContaCorrente >= 5000) {
            System.out.println("Você possui verba para comprar o PS5");
            } else {
            System.out.println("chora");
            }


    }
}
