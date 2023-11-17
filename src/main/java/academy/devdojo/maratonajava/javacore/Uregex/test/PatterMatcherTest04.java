package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest04 {
    public static void main(String[] args) {
        // \d = Os 'Digitos'
        // \D = O que 'Nao for Digito'
        // \s = Os espacos 'Em branco' \t \n \f \r
        // \S = Os caracteres excluindo os 'Em branco'
        // \w = a - z | A - Z | digitos | _
        // \W = Tudo oque não for incluso no '\w'
        //  Range []
        // ? = Zero ou uma
        // * = Zero ou mais
        // + = Uma ou mais
        // {n,m} = de 'n' até 'm'
        // ()
        // | o(v|c)o = ovo / oco
        // $ = fim da linha
        // . = '1.3' = 123, 133, 1@3, 1A3
        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
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
