package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.model.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.retrieveAvailableCar();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
