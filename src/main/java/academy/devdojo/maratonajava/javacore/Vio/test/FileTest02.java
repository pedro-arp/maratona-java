package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDirectory = new File("pasta");
        final boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Pasta Criada? " + isDirectoryCreated);
        File fileDirectoryArchive = new File(fileDirectory,"arquivo.txt");
        try {
            final boolean isCreateNewFileOnDirectory = fileDirectoryArchive.createNewFile();
            System.out.println("arquivo.txt criado na Pasta? " + isCreateNewFileOnDirectory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileRenamed = new File(fileDirectory,"file_renamed.txt");
        final boolean isRenamed = fileDirectoryArchive.renameTo(fileRenamed);
        System.out.println("O arquivo.txt foi renomeado ? " + isRenamed);

        File directoryRenamed = new File("path");
        final boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("A Pasta foi renomeada? " + isDirectoryRenamed);
    }
}
