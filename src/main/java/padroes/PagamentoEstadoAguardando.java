package padroes;

public class PagamentoEstadoAguardando extends PagamentoEstado{
    private static PagamentoEstadoAguardando instance = new PagamentoEstadoAguardando();

    public static PagamentoEstadoAguardando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Aguardando";
    }

    @Override
    public boolean cancelar(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoCancelado.getInstance());
        return true;
    }

    @Override
    public boolean pagar(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoPago.getInstance());
        return true;
    }
}
