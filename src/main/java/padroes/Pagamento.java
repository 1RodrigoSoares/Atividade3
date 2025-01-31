package padroes;

import java.util.Observable;

class Pagamento extends Observable {
    private String codigo;
    private PagamentoEstado estado;

    public Pagamento(String codigo) {
        this.codigo = codigo;
        this.estado = PagamentoEstadoAguardando.getInstance();
    }

    public void setEstado(PagamentoEstado estado) {
        this.estado = estado;
    }

    public PagamentoEstado getEstado() {
        return this.estado;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public boolean solicitar () {
        return this.estado.solicitar(this);
    }

    public boolean pagar () {
        this.setChanged();
        this.notifyObservers();
        return this.estado.pagar(this);
    }

    public boolean cancelar () {
        this.setChanged();
        this.notifyObservers();
        return this.estado.cancelar(this);
    }

    public boolean solicitarReembolso () {
        return this.estado.solicitarReembolso(this);
    }

    public boolean concluirReembolso() {
        return this.estado.concluirReembolso(this);
    }
}