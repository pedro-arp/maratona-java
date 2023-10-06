package academy.devdojo.maratonajava.javacore.Xserialization.test;

import academy.devdojo.maratonajava.javacore.Xserialization.model.Aluno;
import academy.devdojo.maratonajava.javacore.Xserialization.model.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(12L, "Pedro Augusto", "1234567");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serialize(aluno);
        deserialize();
    }

    private static void serialize(Aluno aluno) {
        Path path = Paths.get("path/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
            System.out.println("Sucess");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        Path path = Paths.get("path/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Object aluno = ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
