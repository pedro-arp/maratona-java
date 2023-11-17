package academy.devdojo.maratonajava.javacore.Minterfaces.model;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    default void checkPermission(){
        System.out.println("Checando permissoes - Dentro da Interface (Método ainda não foi Sobescrito)");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDatasize na interface");
    }
}
