package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.model;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}
    class UsDollar implements Currency {
        @Override
        public String getSymbol() {
            return "$";
        }
    }
