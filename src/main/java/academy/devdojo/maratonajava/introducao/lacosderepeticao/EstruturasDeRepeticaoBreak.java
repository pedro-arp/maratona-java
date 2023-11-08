package academy.devdojo.maratonajava.introducao.lacosderepeticao;
//Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
public class EstruturasDeRepeticaoBreak {

    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i + " OI");
        }
    }
}
