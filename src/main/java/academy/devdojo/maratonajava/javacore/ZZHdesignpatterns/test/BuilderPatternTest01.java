package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.model.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person1 = Person.PersonBuilder
                .builder()
                .firstName("Pedro")
                .lastName("Augusto")
                .email("pedroagtrodrigues@gmail")
                .username("pedroarp")
                .build();
        System.out.println(person1);
    }
}
