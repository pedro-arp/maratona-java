package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    private static Optional<String> findName(String name) {
        List<String> list = List.of("Pedro", "Bianca");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu");
        Optional<String> o2 = Optional.ofNullable(null);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println("--");

        Optional<String> findOptional = findName("Pedro");
        String empty = findOptional.orElse("EMPTY");
        System.out.println(empty);
        findOptional.ifPresent(s -> System.out.println(s.toUpperCase()));

    }
}
