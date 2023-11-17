package academy.devdojo.maratonajava.javacore.Lclassesabstratas.model;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente |" +
                " Nome = " + nome +
                ", salario = " + salario
                ;
    }

}
