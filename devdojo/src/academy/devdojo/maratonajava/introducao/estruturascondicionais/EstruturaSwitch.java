package academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class EstruturaSwitch {
    public static void main(String[] args) {
        /*SINTAXE :
        switch (char, int, byte, short, enum, String){
        case 1:
        sout
        break;
         */
        //Imprima o dia da semana, considerando 1 como domingo
        int dia = 2389;
        byte semana = 7;
        int diaDaSemana = dia % semana;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 0:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        System.out.println("---------------------------");
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opcao invalida, selecione entre 'M' ou 'F'");
        }

    }
}
