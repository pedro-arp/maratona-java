package academy.devdojo.maratonajava.javacore.Dconstrutores.model;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;
    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");


    }
    public void imprime() {
        System.out.println("-------------");
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
        System.out.println("-------------");

    }

}
