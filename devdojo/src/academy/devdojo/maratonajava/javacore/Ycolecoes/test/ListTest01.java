package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Augusto");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Rodrigues");
        System.out.println("---");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }

        System.out.println("---------");
        List<Integer> notas = new ArrayList<>();
        notas.add(1);
        notas.add(2);
        notas.add(10);
        notas.add(4);
        int sum = 0;
        for (Integer nota : notas) {
            sum += nota;
        }
        System.out.println(sum);


    }
}
