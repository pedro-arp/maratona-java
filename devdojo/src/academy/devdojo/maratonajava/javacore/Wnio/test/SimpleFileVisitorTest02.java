package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        boolean isJavaClassCheck = file.getFileName().toString().endsWith(".java");
        if (isJavaClassCheck) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("preVisit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
       //  FileVisitResult.SKIP_SUBTREE;
       //  FileVisitResult.SKIP_SIBLINGS;

    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc){
        System.out.println("---------");
        System.out.println("postVisit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("path");
        Files.walkFileTree(root, new ListAllFiles());
    }


}
