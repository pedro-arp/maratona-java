package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon-Ball","TV", 12, "Ação", "Production IG");
      // anime.init("Naruto", "TV", 12, "Ação");
        anime.imprime();

    }
}
