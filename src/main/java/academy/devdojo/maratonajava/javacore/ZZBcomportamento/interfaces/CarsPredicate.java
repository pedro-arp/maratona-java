package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.model.Car;

public interface CarsPredicate {
    // anonimas, funções
    boolean test(Car car);
    //(parametro) -> <expressão>
    //(Car car) -> car.getColor().equals("green");
}
