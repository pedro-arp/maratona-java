package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            final boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("is Directory: " + file.isDirectory());
            System.out.println("is File: " + file.isFile());
            System.out.println("is Hidden: " + file.isHidden());
            System.out.println("Last Modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            final boolean isExistis = file.exists();
            if (isExistis) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
