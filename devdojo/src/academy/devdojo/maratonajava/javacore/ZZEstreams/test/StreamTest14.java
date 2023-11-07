package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.model.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.model.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY), new LightNovel("Overlord", 10.99, Category.FANTASY), new LightNovel("Violet Evergarden", 5.99, Category.DRAMA), new LightNovel("No Game No Life", 2.99, Category.FANTASY), new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<Category, Long> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect1);
        Map<Category, Optional<LightNovel>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);
        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
         Map<Category, LightNovel> collect3Function = lightNovels.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect3);
    }
}
