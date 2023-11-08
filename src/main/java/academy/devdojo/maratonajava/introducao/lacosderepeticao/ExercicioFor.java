package academy.devdojo.maratonajava.introducao.lacosderepeticao;

//Imprima todos os numeros pares de 0 até 1 000 000
public class ExercicioFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
