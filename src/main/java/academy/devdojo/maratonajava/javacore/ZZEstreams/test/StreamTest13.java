package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.model.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.model.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.model.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collectPromotion = lightNovels.stream()
                .collect(Collectors.groupingBy( ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));
        System.out.println(collectPromotion);

        Map<Category, Map<Promotion, List<LightNovel>>> collectCategoryAndPromotion = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                )));
        System.out.println(collectCategoryAndPromotion);
    }
}
