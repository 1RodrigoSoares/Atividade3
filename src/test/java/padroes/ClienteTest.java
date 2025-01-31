package padroes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    Pagamento pagamento;

    @Test
    void deveNotificarUmCliente() {
        Pagamento pagamento = new Pagamento("234421");
        Cliente Cliente = new Cliente("Rodrigo");
        Cliente.acompanharPagamento(pagamento);
        pagamento.solicitar();
        pagamento.pagar();
        Assertions.assertEquals("Rodrigo, o pagamento 234421 está como pago", Cliente.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Pagamento pagamento = new Pagamento("56563");
        Cliente Cliente = new Cliente("Lucas");
        Cliente.acompanharPagamento(pagamento);
        pagamento.solicitar();
        pagamento.cancelar();
        Assertions.assertEquals((Object) null, Cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarDoisClientes() {
        Pagamento pagamento = new Pagamento("12313");
        Cliente Cliente = new Cliente("Rodrigo");
        Cliente Cliente2 = new Cliente("Rafael");
        Cliente.acompanharPagamento(pagamento);
        Cliente2.acompanharPagamento(pagamento);
        pagamento.solicitar();
        pagamento.pagar();
        Assertions.assertEquals("Rodrigo, o pagamento 12313 está como pago", Cliente.getUltimaNotificacao());
        Assertions.assertEquals("Rafael, o pagamento 12313 está como pago", Cliente2.getUltimaNotificacao());
    }
}
