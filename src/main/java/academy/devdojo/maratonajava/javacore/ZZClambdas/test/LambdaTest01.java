package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Pedro","Bianca", "Naruto", "Goku");
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        forEach(names, s -> System.out.print(s));
        forEach(nums, integer -> System.out.print(integer));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
            System.out.println();
        }

    }
}
