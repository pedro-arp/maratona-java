package academy.devdojo.maratonajava.javacore.ZZaclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Goku";
    static class Nested{
        private String lastName = "SSJ";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }

    }
    public static void main(String[] args) {
        new Nested().print();
    }
}
