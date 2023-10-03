package academy.devdojo.maratonajava.javacore.Gassociacao.model.exercicio;

public class Alunos {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Alunos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Alunos(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.print("Nome do aluno: "); System.out.println(this.nome);
        System.out.print("Idade do aluno: "); System.out.println(this.idade);
        System.out.print("Seminário que estará presente: "); System.out.println(seminario.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
