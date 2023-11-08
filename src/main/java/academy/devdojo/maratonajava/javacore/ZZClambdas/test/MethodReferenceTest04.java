package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.model.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Referencia para um Construtor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>();
        animeList.add(new Anime("One Piece", 2));
        animeList.add(new Anime("Berserk", 3));
        animeList.add(new Anime("Naruto", 1));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

       // BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Dragon Ball", 4));
    }
}
