package academy.devdojo.maratonajava.javacore.Gassociacao.model.exercicio;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professores(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;

    }
    public void imprime(){
        System.out.print("Nome do professor: "); System.out.println(this.nome);
        System.out.print("Área dominante: ");System.out.println(this.especialidade);
        System.out.println("Seminários que irá palestrar: ");
        for (Seminario seminario : seminarios) {
            System.out.println("- " + seminario.getTitulo());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
