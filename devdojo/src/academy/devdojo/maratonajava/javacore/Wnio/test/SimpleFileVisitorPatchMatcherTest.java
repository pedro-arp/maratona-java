package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        matches(file, "glob:**Test*");
        return FileVisitResult.CONTINUE;
    }
    private static void matches(Path file, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        if (matcher.matches(file) == true) {
            //System.out.println(glob + ": " + matcher.matches(file));
            System.out.println(file.getFileName());

        }
    }
}
public class SimpleFileVisitorPatchMatcherTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path, new ListFiles());
    }
}






