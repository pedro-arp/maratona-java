package academy.devdojo.maratonajava.javacore.Oexception.exception.model;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login Invalido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
