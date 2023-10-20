package academy.devdojo.maratonajava.javacore.ZZDoptional.repository;

import academy.devdojo.maratonajava.javacore.ZZDoptional.model.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku No Hero", 50), new Manga(2, "OverLord", 20));

    public static Optional<Manga> findByTitle(String title) {
       return  find(manga -> manga.getTitle().equals(title));
    }
    public static Optional<Manga> findById(Integer id) {
        return  find(manga -> manga.getId().equals(id));
    }
    private static Optional<Manga> find(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;

            }
        }
        return Optional.ofNullable(found);

    }
}
