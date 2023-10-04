package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/pedro");
        Path file = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/pedro");
        Path relative = Paths.get("dev");
        Path fileExample = Paths.get("file.txt");
        System.out.println("1 " + absolute.resolve(relative));
        System.out.println("2 " + absolute.resolve(fileExample));
        System.out.println("3 " + relative.resolve(absolute));
        System.out.println("4 " + relative.resolve(fileExample));
        System.out.println("5 " + fileExample.resolve(absolute));
        System.out.println("6 " + fileExample.resolve(relative));
    }
}