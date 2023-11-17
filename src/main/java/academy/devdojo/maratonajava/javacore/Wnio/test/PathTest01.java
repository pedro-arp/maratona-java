package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
      Path p1 = Paths.get("C:\\workspace-Java\\maratona-java\\path\\file_renamed.txt");
      Path p2 = Paths.get("C:\\workspace-Java\\maratona-java\\path","file_renamed.txt");
      Path p3 = Paths.get("C:","workspace-Java\\maratona-java\\path","file_renamed.txt");
      Path p4 = Paths.get("C:","workspace-Java","maratona-java","path","file_renamed.txt");
        System.out.println(p1.getFileName().toFile());
        System.out.println(p2.getFileName().toFile());
        System.out.println(p3.getFileName().toFile());
        System.out.println(p4.getFileName().toFile());
    }
}
