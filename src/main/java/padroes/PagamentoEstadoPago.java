package padroes;

public class PagamentoEstadoPago extends PagamentoEstado{
    private static PagamentoEstadoPago instance = new PagamentoEstadoPago();

    public static PagamentoEstadoPago getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pago";
    }

    @Override
    public boolean solicitarReembolso(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoReembolsoSolicitado.getInstance());
        return true;
    }
}
