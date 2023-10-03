package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest05 {
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
        // ^ = Pesquisa específica
        // [^abc ] = negação
        String regex = "(\\w+(@+(g|h)+\\w+))+(\\.+\\w+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("E-mail valido");
        System.out.println("#@!!zoro@mail.br".matches(regex));
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
