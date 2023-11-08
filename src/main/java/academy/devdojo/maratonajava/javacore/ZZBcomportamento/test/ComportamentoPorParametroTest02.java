package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green")); //lambda
        List<Car> yearCars = filter(cars, car -> car.getYear() > 2015); //lambda
        System.out.println(greenCars);
        System.out.println(yearCars);
    }

    private static List<Car> cars = List.of(new Car("green", 2023), new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    private static List<Car> filter(List<Car> cars, Predicate<Car> carsPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carsPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

}


//       lambda -> replace this:
//      new CarsPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
