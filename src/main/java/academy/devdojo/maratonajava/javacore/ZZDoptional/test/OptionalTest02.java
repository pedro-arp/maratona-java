package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.model.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku No Hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku No Hero 2"));
        System.out.println(mangaByTitle);

        Optional<Manga> mangaById = MangaRepository.findById(2);
        mangaById.orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        String newManga = "Dragon Ball";
        Manga createNewTitle = MangaRepository.findByTitle(newManga)
                .orElseGet(() -> new Manga(3, newManga, 10));
        System.out.println(createNewTitle);

    }
}
