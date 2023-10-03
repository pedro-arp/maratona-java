package academy.devdojo.maratonajava.javacore.Gassociacao.test.bidirecional;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.model.Time;

public class JogadorTime {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Ronaldinho");
        Jogador jogador2 = new Jogador("Ronaldo Fenomeno");
        Time selecao = new Time("Brasil");
        Time time = new Time("Barcelona");
        Time time2 = new Time("Real Madrid");

        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time2);

        selecao.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("------------");
        jogador2.imprime();
        System.out.println("--- Selecao ---");
        selecao.imprime();
    }
}