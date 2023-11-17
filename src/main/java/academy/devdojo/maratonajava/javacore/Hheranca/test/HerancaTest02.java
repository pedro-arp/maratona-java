package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.model.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executadado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático da super classe é executadado quando a JVM carregar classe filha
    // 2 - Alocado espaço em memória pro objeto da super classe
    // 3 - Cada atributo da super classe é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    // 5 - O construtor super classe é executado
    //
    // 6 - Alocado espaço em memória pro objeto da subclasse
    // 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - O construtor subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Bianca Augusta");
    }
}
