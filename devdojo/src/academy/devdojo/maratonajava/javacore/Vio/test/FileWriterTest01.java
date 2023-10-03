package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (java.io.FileWriter fw = new java.io.FileWriter(file)) {
            fw.write("O DevDojo é incrivel e é o melhor curso do Brasil!");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
