package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("path/arquivo.zip");
        Path filesToZip = Paths.get("path/subpath1/subsubpath1");
        zip(zipFile, filesToZip);
    }
    private static void zip(Path zipFile, Path filesToZip){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)){
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado e Zipado com sucesso!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
