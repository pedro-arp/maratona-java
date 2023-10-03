package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (java.io.FileWriter fw = new java.io.FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo é incrivel e é o melhor curso do Brasil!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
