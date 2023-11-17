package academy.devdojo.maratonajava.javacore.Minterfaces.model;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de um Banco de Dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chencando permissões dentro do Database Loader");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDatasize na classe DatabaseLoader");
    }
}
