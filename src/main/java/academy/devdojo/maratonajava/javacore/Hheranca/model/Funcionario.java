package academy.devdojo.maratonajava.javacore.Hheranca.model;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático da classe Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.getSalario());
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.getNome() + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
