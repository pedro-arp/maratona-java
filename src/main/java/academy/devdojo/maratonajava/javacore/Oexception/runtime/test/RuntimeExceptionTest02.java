package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
       try {
           divisao(1, 0);
       }catch (RuntimeException e){
           e.printStackTrace();
       }
        System.out.println("Código Finalizado");
    }
    private static int divisao(int a, int b) {
        if (b==0 || a ==0){
            throw new ArithmeticException("Argumento ilegal, não pode dividir numero por 0");
        }
        return a/b;
    }
}
