package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.model;

public class Anime {
    // 1 - Alocado espaço em memoria
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    private String nome;
    private int[] episodios;

    public Anime(String nome) {
        this.nome = nome;
    }

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        System.out.println(nome);
        for (int i = 0; i < episodios.length; i++) {
            System.out.print(episodios[i] + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}