package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        Integer multiplication = integers.stream()
                .reduce(1, (x, y) -> x * y);
        System.out.println(multiplication);

        integers.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);


    }
}
