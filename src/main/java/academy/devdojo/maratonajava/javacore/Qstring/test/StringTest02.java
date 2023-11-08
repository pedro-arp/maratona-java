package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Pedro";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("P", "O meu nome é P"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.trim());
        System.out.println("-");
        System.out.println(numeros.length());
        System.out.print(numeros.substring(3));
        System.out.print(" = " + numeros.substring(3, numeros.length()));
    }
}
