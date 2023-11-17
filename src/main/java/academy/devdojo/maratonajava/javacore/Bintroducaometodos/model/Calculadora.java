package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class Calculadora {
    public void somaDoisNumeros01() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros01() {
        System.out.println(30 - 8);
    }

    public void multiplicaDoisNumeros02(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoiNumerosComRetorno03(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumerosSemRetorno03(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Nao existe diviao por 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros04(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros04");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);
    }

    public void somaArray(int[] numeros) {
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        System.out.println(sum);
    }
    //VarArgs == Sintexa que foi criada para simplificar array no método
    public void somaVarArgs(int... numeros){

        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        System.out.println(sum);

    }

}


