package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    public static void main(String[] args) {
        List<Car> green = filterCarByColor(cars, "green");;
        System.out.println(green);

    }
    private static List<Car> cars = List.of(new Car("green", 2023),new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
