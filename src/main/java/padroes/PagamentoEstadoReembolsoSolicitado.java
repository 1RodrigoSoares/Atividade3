package padroes;

public class PagamentoEstadoReembolsoSolicitado extends PagamentoEstado{
    private static PagamentoEstadoReembolsoSolicitado instance = new PagamentoEstadoReembolsoSolicitado();

    public static PagamentoEstadoReembolsoSolicitado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Reembolso Solicitado";
    }

    @Override
    public boolean concluirReembolso(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoReembolsado.getInstance());
        return true;
    }
}
