package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        // \d = Os 'Digitos'
        // \D = O que 'Nao for Digito'
        // \s = Os espacos 'Em branco' \t \n \f \r
        // \S = Os caracteres excluindo os 'Em branco'
        // \w = a - z | A - Z | digitos | _
        // \W = Tudo oque não for incluso no '\w'
        String regex = "\\s";
        String texto = "";
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
