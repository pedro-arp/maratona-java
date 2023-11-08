package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green")); //lambda
        List<Car> yearCars = filter(cars, car -> car.getYear() > 2015); //lambda
        System.out.println(greenCars);
        System.out.println(yearCars);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> filterNums = filter(nums, num -> num % 2 == 0);
        System.out.println(filterNums);
    }

    private static List<Car> cars = List.of(new Car("green", 2023), new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) filteredList.add(e);
        }
        return filteredList;
    }

}
//       lambda -> replace this:
//      new CarsPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
