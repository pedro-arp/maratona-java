package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        matches(file);
        return FileVisitResult.CONTINUE;
    }
    private static void matches(Path file) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**Test*");
        if (matcher.matches(file)) {
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






