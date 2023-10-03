package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.exercicio;

public class FuncionarioMediaSalario {
    private int sum = 0;
    public void imprimirMedia(Funcionario funcionario) {

        if (funcionario.getSalario() == null) {
            System.out.println("Valores salariais invalidos");
            return;
        }

        for (int i = 0; i < funcionario.getSalario().length; i++) {
            sum += funcionario.getSalario()[i];
        }
        double media = getSum() / funcionario.getSalario().length;

        System.out.println("\nMedia salarial: " + media);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

