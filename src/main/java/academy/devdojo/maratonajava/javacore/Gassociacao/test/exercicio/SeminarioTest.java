package academy.devdojo.maratonajava.javacore.Gassociacao.test.exercicio;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.exercicio.Alunos;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.exercicio.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.exercicio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local endereco = new Local("Teatro Bradesco");
        Seminario seminario1 = new Seminario("Maratona Java", endereco);
        Seminario seminario2 = new Seminario("Logica De Programação Virado no Jiraya", endereco);
        Seminario[] seminarios = {seminario1, seminario2};
        Professores professor = new Professores("Willian Dojo", "Back-End", seminarios);
        Alunos aluno1 = new Alunos("Pedro", 21, seminario1);
        Alunos aluno2 = new Alunos("Bianca", 21, seminario2);
        Alunos alunos[] = {aluno1, aluno2};
        seminario1.setProfessor(professor);
        seminario1.setAluno(alunos);

        System.out.println("---Local---");
        endereco.imprime();
        System.out.println("---Seminario---");
        seminario1.imprime();
        System.out.println("---Professor---");
        professor.imprime();
        System.out.println("---Alunos---");
        aluno1.imprime();
        System.out.println("------------");
        aluno2.imprime();

    }
}