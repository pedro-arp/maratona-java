package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.model.Jogador;

public class JogadorArraysComObjeto {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Messi");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
        System.out.println("-------------------");
        for (int i = 0; i < jogadores.length; i++) {
            Jogador jogador = jogadores[i];
            jogador.imprime();
        }
    }
}
