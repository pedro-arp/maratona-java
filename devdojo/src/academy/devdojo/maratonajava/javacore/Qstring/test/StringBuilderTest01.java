package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Pedro Augusto";
        nome = nome.concat(" DevDojo");
        System.out.println(nome);
        nome = nome.substring(0,3);
        System.out.println(nome);
        System.out.println("-");
        StringBuilder sb = new StringBuilder("Pedro Augusto");
        sb.append(" DevDojo");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
    }
}
