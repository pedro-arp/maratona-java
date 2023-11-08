package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.model.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.model.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.model.FileLoader;

public class DataTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();
        System.out.println("-");
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
        System.out.println("-");
        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();



    }
}
