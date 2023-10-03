package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Pedro"; //String constant pool
        String nome2 = "Pedro";
        nome = nome.concat(" Augusto");

        System.out.println(nome);
        System.out.println(nome.equals(nome2));

        System.out.println("-");

        String nome3 = new String("Pedro");//1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
