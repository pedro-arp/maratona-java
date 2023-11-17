package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("_-----------------------");

        System.out.print("Nome: " + estudante.nome + "; ");
        System.out.print("Sexo: " + estudante.sexo + "; ");
        System.out.println("Idade: " + estudante.idade);

        estudante.nome = "Ronaldo";

        System.out.println("\nNome Depois do sout: " + estudante.nome);
    }

}
