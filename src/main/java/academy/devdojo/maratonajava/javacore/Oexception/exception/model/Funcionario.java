package academy.devdojo.maratonajava.javacore.Oexception.exception.model;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        super.salvar();
    }
}

