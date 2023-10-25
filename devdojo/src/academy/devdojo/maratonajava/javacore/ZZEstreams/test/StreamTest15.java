package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.model.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.model.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.model.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY), new LightNovel("Overlord", 10.99, Category.FANTASY), new LightNovel("Violet Evergarden", 5.99, Category.DRAMA), new LightNovel("No Game No Life", 2.99, Category.FANTASY), new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, toSet())));

        Map<Category, LinkedHashSet<Promotion>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println(collect3);
    }
}
