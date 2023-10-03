package academy.devdojo.maratonajava.javacore.Gassociacao.test.unidirecional;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Time;

public class TimeJogadorUmParaMuitos {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Time time = new Time("Corinthians");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}