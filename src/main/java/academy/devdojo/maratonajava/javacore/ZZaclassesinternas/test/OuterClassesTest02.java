package academy.devdojo.maratonajava.javacore.ZZaclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print() {
        String lastName = "Izuku";

        class LocalClass {
            public void printLocal() {

                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
