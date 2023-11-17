package academy.devdojo.maratonajava.introducao.lacosderepeticao;

public class EstruturaDeRepeticaoContinue {
    //Dado um valor de um carro, descubra quantas vezes ele poder ser parcelado
    //Condição é que valor da parcela tem que ser maior ou igual a 1000
    public static void main(String[] args) {
        double valorDoCarro = 30000;
        for (int i = (int) valorDoCarro; i >= 1; i--) {
            double valorParcela = valorDoCarro / i;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(i + " é a quantidade de parcelas de R$ " + valorParcela);

        }
    }
}
