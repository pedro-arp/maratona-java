package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor | " +
                "Nome = " + nome +
                ", salario = " + salario
                ;
    }
}
