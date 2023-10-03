package academy.devdojo.maratonajava.javacore.Gassociacao.test.unidirecional;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Professor;

public class EscolaProfessorMuitosParaUm {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Bianca");
        Professor professor2 = new Professor("Pedro");
        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("Idiomas da Vila", professores);

        escola.imprime();
    }
}
