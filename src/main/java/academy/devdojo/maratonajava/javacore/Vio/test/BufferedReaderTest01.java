package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("devdojo/file.txt");
        try (java.io.FileReader fr = new java.io.FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            br.read();
            String linha;
            while ((linha=br.readLine()) != null){
                System.out.print(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
