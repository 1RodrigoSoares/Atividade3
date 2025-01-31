package padroes;

public abstract class PagamentoEstado {
    public abstract String getEstado();

    public boolean solicitar (Pagamento pagamento) {
        return false;
    }

    public boolean pagar (Pagamento pagamento) {
        return false;
    }

    public boolean cancelar (Pagamento pagamento) {
        return false;
    }

    public boolean solicitarReembolso (Pagamento pagamento) {
        return false;
    }

    public boolean concluirReembolso(Pagamento pagamento) {
        return false;
    }

}

