package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Carro;

public class CarroTest {
    public static void main(String[] args) {
       //Exercicio
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda Fit";
        carro1.cor = "Azul";
        carro1.modelo = "Sedan";
        carro1.ano = 2012;

        carro2.nome = "Citroen C3";
        carro2.cor = "Prata";
        carro2.modelo = "Hatch";
        carro2.ano = 2008;

        System.out.println("Carro 1");
        System.out.println("Nome do carro: " + carro1.nome + "; Cor do carro: " + carro1.cor + "; Modelo do carro: " + carro1.modelo + "; Ano do carro: " + carro1.ano);
        System.out.println("\nCarro 2");
        System.out.println("Nome do carro: " + carro2.nome + "; Cor do carro: " + carro2.cor + "; Modelo do carro: " + carro2.modelo + "; Ano do carro: " + carro2.ano);
    }
}
