package academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class ExercicioSwitch {
    //Dados os valores de 1 a 7, imprima se é dia util ou final de semana
    //Considererando 1 como Domingo
    public static void main(String[] args) {
        int dia = 8;
        int diaDaSemana = dia % 7;
        switch (diaDaSemana) {
            case 0, 1:
                System.out.println("Eh final de semana");
                break;
            default:
                System.out.println("Eh dia util");
        }
    }
}
