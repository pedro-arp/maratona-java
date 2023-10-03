package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (java.io.FileReader fr = new java.io.FileReader(file)) {
//            char[] in = new char[1];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i=fr.read()) != -1){
                System.out.print((char)i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
