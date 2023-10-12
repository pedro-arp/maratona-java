package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.model.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.model.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        RentalService<Carro> rentalServiceCar = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCar.retrieveAvailableObject();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCar.returnRentedObject(carro);

        System.out.println("----------------");

        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
        RentalService<Barco> rentalServiceBoat = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBoat.retrieveAvailableObject();
        System.out.println("Usando barco por um mês...");
        rentalServiceBoat.returnRentedObject(barco);

    }
}
