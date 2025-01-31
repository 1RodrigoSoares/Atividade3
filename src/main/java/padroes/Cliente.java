package padroes;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void acompanharPagamento(Pagamento pagamento) {
        pagamento.addObserver(this);
    }

    public void update(Observable pagamento, Object arg1) {
        Pagamento p = (Pagamento) pagamento;
        this.ultimaNotificacao = this.nome + ", o pagamento " + p.getCodigo() + " está como pago";
    }
}
