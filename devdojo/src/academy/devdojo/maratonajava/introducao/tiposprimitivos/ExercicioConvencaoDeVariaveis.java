package academy.devdojo.maratonajava.introducao.tiposprimitivos;

import java.time.LocalDate;

/*
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario de <salario>, na data <data>
 */
public class ExercicioConvencaoDeVariaveis {
    public static void main(String[] args) {
        String nome = "Pedro Augusto";
        String endereco = "Rua Coronel Donato, 375";
        double salario = 1350.50;
        LocalDate currentDate = LocalDate.now();
        String relatorio = "Eu " + nome + " morando no endereço " + endereco +
                " confirmo que recebi o salario de " + salario + " reais, na data " + currentDate;

        System.out.println(relatorio);

    }
}
