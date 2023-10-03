package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.exercicio;

public class FuncionarioImpressora {
    public void imprimir(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.print("Salarios: ");

        if (funcionario.getSalario()!= null) {
            for (int i = 0; i < funcionario.getSalario().length; i++) {
                System.out.print("R$" + funcionario.getSalario()[i] + "; ");
            }
        }
    }
}
