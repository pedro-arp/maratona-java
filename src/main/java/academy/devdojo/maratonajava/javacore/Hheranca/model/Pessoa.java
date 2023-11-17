package academy.devdojo.maratonajava.javacore.Hheranca.model;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático da classe Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe Pessoa 2");
    }

    public Pessoa(String nome) {
        {
            System.out.println("Dentro do construtor Pessoa");
        }
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("---Pessoa---");
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println("--- endereco ---");
        System.out.println(endereco.getRua());
        System.out.println(endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
