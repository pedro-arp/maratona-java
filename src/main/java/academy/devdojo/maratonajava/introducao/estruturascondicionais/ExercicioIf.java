package academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class ExercicioIf {
    //Dado um determinado salario anual imprima qual o valor do imposto que devera ser pago
    //maior ou igual a 0 e menor que 34712 euros são 9.7%
    //entre 34713 e 68507 são 37.35%
    //acima ou igual a 68508 são 49.50%
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double imposto;
        String primeiroImposto = " eh o seu salario, então sera cobrado 9,7% de imposto, resultando em R$";
        String segundoImposto = " eh o seu salario, então sera cobrado 37,35% de imposto, resultando em R$";
        String terceiroImposto = " eh o seu salario, então sera cobrado 49,50% de imposto, resultando em R$";
        String taxa = null;

        if (salarioAnual < 34713) {
            imposto = 0.097 * salarioAnual;
            taxa = primeiroImposto;

        } else if (salarioAnual < 68508) {
            imposto = 0.3735 * salarioAnual;
            taxa = segundoImposto;

        } else {
            imposto = 0.4950 * salarioAnual;
            taxa = terceiroImposto;

        }
        System.out.println(salarioAnual + taxa + imposto);


    }
}
