package academy.devdojo.maratonajava.introducao.vetoresarrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 311;
        dias[1][1] = 312;
        dias[1][2] = 313;

        dias[2][0] = 314;
        dias[2][1] = 315;
        dias[2][2] = 316;
//Imprimindo com For
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {

                System.out.println(dias[i][j]);

            }
        }

        System.out.println("---------------------------");
//Imprimindo com Foreach
        for (int[] arrBase :
                dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

    }

}