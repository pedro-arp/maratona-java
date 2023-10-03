package academy.devdojo.maratonajava.javacore.Gassociacao.model.exercicio;

public class Seminario {
    private String titulo;
    private Local endereco;

    private Professores professor;
    private Alunos[] aluno;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.professor = professor;
    }

    public Seminario(String titulo, Local endereco, Professores professor, Alunos[] aluno) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.professor = professor;
        this.aluno = aluno;
    }

    public void imprime() {
        System.out.print("Tema do seminário: ");
        System.out.println(this.titulo);
        System.out.print("Endereço: ");
        System.out.println(endereco.getEndereco());
        System.out.print("Professor palestrante: ");
        System.out.println(professor.getNome());
        System.out.println("Alunos convidados: ");
        if (aluno == null) return;
        for (Alunos alunos : aluno) {
            System.out.println("- " + alunos.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getEndereco() {
        return endereco;
    }

    public void setEndereco(Local endereco) {
        this.endereco = endereco;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;

    }

    public Alunos[] getAluno() {
        return aluno;
    }

    public void setAluno(Alunos[] aluno) {
        this.aluno = aluno;
    }
}
