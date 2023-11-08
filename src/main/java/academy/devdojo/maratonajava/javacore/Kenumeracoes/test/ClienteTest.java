package academy.devdojo.maratonajava.javacore.Kenumeracoes.test;

import academy.devdojo.maratonajava.javacore.Kenumeracoes.model.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.model.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.model.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("Pedro Augusto", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
    Cliente cliente2 = new Cliente("VisualG", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("----------");
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println("----------");

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);

    }
}
