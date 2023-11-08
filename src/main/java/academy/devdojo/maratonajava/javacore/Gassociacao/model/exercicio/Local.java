package academy.devdojo.maratonajava.javacore.Gassociacao.model.exercicio;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println(this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
