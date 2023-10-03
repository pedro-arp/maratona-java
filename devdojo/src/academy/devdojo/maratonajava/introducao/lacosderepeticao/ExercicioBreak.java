package academy.devdojo.maratonajava.introducao.lacosderepeticao;

public class ExercicioBreak {
    //Dado um valor de um carro, descubra quantas vezes ele poder ser parcelado
    //Condição é que valor da parcela tem que ser maior ou igual a 1000
    public static void main(String[] args) {
        double valorDoCarro = 40000;
        for (int i = 1; i <= valorDoCarro; i++) {
            double valorParcela = valorDoCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(i + " é a quantidade de parcelas de R$ " + valorParcela);
        }
    }
}
