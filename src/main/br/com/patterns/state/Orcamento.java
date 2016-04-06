package main.br.com.patterns.state;

/**
 * Created by odilon on 06/04/16.
 */
public class Orcamento {

    private double valor;
    protected EstadoOrcamento estadoOrcamento;

    public Orcamento(double valor) {
        this.valor = valor;
        this.estadoOrcamento = new AguardandoAprovacao();

    }

    public double aplicaDesconto() {
        return this.estadoOrcamento.calcula(this);
    }

    public double getValor() {
        return valor;
    }

    public void finalizar() {
        this.estadoOrcamento.finaliza(this);
    }

    public void aprovar() {
        this.estadoOrcamento.aprova(this);
    }

    public void reprovar() {
        this.estadoOrcamento.finaliza(this);
    }
}
