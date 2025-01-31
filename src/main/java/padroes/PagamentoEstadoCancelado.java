package padroes;

public class PagamentoEstadoCancelado extends PagamentoEstado{
    private static PagamentoEstadoCancelado instance = new PagamentoEstadoCancelado();

    public static PagamentoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }
}
