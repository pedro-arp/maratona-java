package academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        //Condição =  Doar se o salario for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Irei doar";
        String mensagemNaoDoar = "Ainda nao tenho condicoes";

        //SINTAXE Operador Ternario : (condicao) ? verdadeiro (string) : falso (string) ;

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

               System.out.println(resultado);
    }
}
