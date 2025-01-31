package padroes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    Pagamento pagamento;

    @Test
    void deveNotificarUmCliente() {
        Pagamento pagamento = new Pagamento("1");
        Cliente Cliente = new Cliente("Rodrigo");
        Cliente.acompanharPagamento(pagamento);
        pagamento.solicitar();
        pagamento.pagar();
        Assertions.assertEquals("Cliente 1, pedido 001 saiu para entrega.", Cliente.getUltimaNotificacao());
    }
}
