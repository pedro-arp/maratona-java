package academy.devdojo.maratonajava.introducao.vetoresarrays;

public class Arrays {
    public static void main(String[] args) {
        //Arrays SINTAXE : int [] nomeVariavel = new int [Quantidade de alocações em memoria];
        // byte, short, int, long, float e double : 0
        //char: '\u0000' ' '
        //boolean: false
        //String: null

        int[] idades = new int[]{21, 15, 11};
        System.out.println(idades[0] + " " + idades[1] + " " + idades[2]);

        System.out.println("----------------------------------------------------------");

        String[] nomes = new String[]{"Pedro", "Bianca", "Nicolas", "Mari", "Camilo"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        System.out.println("----------------------------------------------------------");

        //foreach
        int[] numeros = new int[]{1, 2, 3, 4, 5};

        for (int num : numeros) {
            System.out.println(num);
        }

    }
}
