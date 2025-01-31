package padroes;

public class PagamentoEstadoReembolsado extends PagamentoEstado{
    private static PagamentoEstadoReembolsado instance = new PagamentoEstadoReembolsado();

    public static PagamentoEstadoReembolsado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Reembolsado";
    }
}
