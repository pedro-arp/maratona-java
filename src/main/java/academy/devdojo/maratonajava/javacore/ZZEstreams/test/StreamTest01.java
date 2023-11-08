package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.model.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
            ));
    public static void main(String[] args) {
        List<String> titles = new ArrayList<>();
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >=  3 ){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
