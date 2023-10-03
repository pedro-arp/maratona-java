package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest03 {
    public static void main(String[] args) {
        // \d = Os 'Digitos'
        // \D = O que 'Nao for Digito'
        // \s = Os espacos 'Em branco' \t \n \f \r
        // \S = Os caracteres excluindo os 'Em branco'
        // \w = a - z | A - Z | digitos | _
        // \W = Tudo oque não for incluso no '\w'
        //  Range []
        //String regex = "[a-zA-C]";
        String regex = "0[xX][\\da-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posicoes encontradas");
        while(matcher.find()){
            System.out.print(matcher.start() + ": " + matcher.group() + "\n");
        }

    }
}
