package academy.devdojo.maratonajava.introducao.vetoresarrays;

public class ArraysMultidimensionaisForeach {
    public static void main(String[] args) {
 /*       int[][] arrayInt = new int[3][];
        int[] array = {11, 22, 33};

        arrayInt[0] = new int[]{01,02};
       // arrayInt[1] = new int[]{11, 12, 13};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{21, 22, 23, 24, 25, 26};
        * */
        //Em uma linha
        int[][] arrayInt2 = {{01, 02}, {11, 12, 13}, {21, 22, 23, 24, 25, 26}};

        for (int[] arrayBase :
                arrayInt2) {
            System.out.println(" ");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n--------------");
    }
}
