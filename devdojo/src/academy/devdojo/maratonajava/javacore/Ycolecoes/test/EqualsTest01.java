package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Pedro Augusto";
        String nome2 = new String("Pedro Augusto");
        //System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
    }
}
