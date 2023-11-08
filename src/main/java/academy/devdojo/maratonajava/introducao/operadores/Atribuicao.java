package academy.devdojo.maratonajava.introducao.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        // = += *= /= %=
        double bonus = 1800;
         bonus += 1000;
         bonus -= 1000;
         bonus *= 1000;
         bonus /= 1000;
         bonus %= 1000;
        System.out.println(bonus);

        System.out.println("------------------");
// ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);

    }

}
